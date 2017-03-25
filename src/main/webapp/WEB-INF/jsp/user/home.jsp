<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<c:import url="/WEB-INF/jsp/inc/head.jsp"/>
</head>
<body>
<c:import url="/WEB-INF/jsp/inc/header.jsp"/>

<div class="container-fluid">
	<div class="row">
		<div class="col-xs-12">
			<t:defaultPanel fontAwesomeIcon="fa-files-o"
							headingTitle="Avalia&ccedil;&atilde;o: </b> ${CURRENT_ASSESSMENT.name}">
				<div class="row" style="margin: 55px 0;">
					<div class="col-xs-12">
						Content Goes Here!
					</div>
				</div>
			</t:defaultPanel>
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/inc/js.jsp"/>

</body>
</html>