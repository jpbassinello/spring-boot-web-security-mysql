/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jpb.sbwsm.service;

import br.com.jpb.sbwsm.model.QUser;
import br.com.jpb.sbwsm.model.User;
import com.querydsl.jpa.impl.JPAQuery;
import org.assertj.core.util.Strings;
import org.hibernate.annotations.QueryHints;

import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
@Singleton
public class UserService {

	@PersistenceContext
	private EntityManager entityManager;

	public List<User> findAll() {
		JPAQuery<User> query = new JPAQuery<>(entityManager);
		query.from(QUser.user);

		query.setHint(QueryHints.CACHEABLE, true);
		query.setHint(QueryHints.CACHE_REGION, "User.findAll");

		return query.fetch();
	}

	public User findByEmail(final String email) {
		if (Strings.isNullOrEmpty(email)) {
			return null;
		}
		return findAll()
				.stream()
				.filter(user -> email.equals(user.getEmail()))
				.findFirst()
				.orElse(null);
	}

}