package br.com.jpb.assessment.controller;

import com.jayway.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.Test;

public class RestControllerIT {

	@Test
	public void testRest() {
		RestAssured
				.get("/rest/test")
				.then()
				.assertThat()
				.body(Matchers.equalTo("OK"));
	}

}
