<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span
					class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/"><i
					class="fa fa-files-o"></i> Home</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-navbar-collapse">
			<form action="/logout" method="post" class="navbar-form navbar-right" id="form" name="form">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				<button type="submit" class="btn btn-default">
					<i class="fa fa-sign-out"></i> Logout
				</button>
			</form>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<sec:authentication property="principal" var="userData"/>

<sec:authorize access="hasRole('USER')">
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<t:defaultPanel headingTitle="Hello ${userData.name}! You are logged in!">
					<div class="row">
						<div class="col-md-6">
							<strong>Email: </strong> ${userData.email}
						</div>
						<div class="col-md-6">
							<strong>Birth Day: </strong> ${userData.getFormattedBirthDay()}
						</div>
					</div>
				</t:defaultPanel>
			</div>
		</div>
	</div>
</sec:authorize>