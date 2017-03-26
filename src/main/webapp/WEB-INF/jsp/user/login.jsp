<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
	<title>Login</title>
	<c:import url="/WEB-INF/jsp/inc/head.jsp"/>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<h1 class="text-center">Login</h1>

			<c:import url="/WEB-INF/jsp/inc/messagesWithSpringSecurity.jsp"/>

			<form:form action="/j_spring_security_check" method="post">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				<div class="form-group">
					<input type="email" class="form-control" name="j_username"
						   placeholder="Email" required="required"/>
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="j_password"
						   placeholder="Password" required="required"/>
				</div>
				<div class="text-center">
					<button type="submit" class="btn btn-primary">
						<i class="fa fa-send"></i> Submit
					</button>
				</div>
			</form:form>
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/inc/js.jsp"/>

</body>
</html>