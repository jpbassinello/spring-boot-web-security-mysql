<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="Bootstrap 3 Default Panel" pageEncoding="UTF-8" %>
<%@attribute name="fontAwesomeIcon" required="false" type="java.lang.String" %>
<%@attribute name="headingTitle" required="true" type="java.lang.String" %>
<div class="panel panel-default">
	<div class="panel-heading">
		<h3 class="panel-title">
			<c:if test="${fontAwesomeIcon ne null}"><i class="fa ${fontAwesomeIcon}"></i> </c:if>
			${headingTitle}
		</h3>
	</div>
	<div class="panel-body">
		<jsp:doBody/>
	</div>
</div>