<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${successMessage ne null}">
		<div class="alert alert-success fade in">
			<button class="close" data-dismiss="alert">x</button>
			<i class="fa-fw fa fa-check"></i> ${successMessage}
		</div>
	</c:when>
	<c:otherwise>
		<c:choose>
			<c:when test="${errorMessage ne null}">
				<div class="alert alert-danger fade in">
					<button class="close" data-dismiss="alert">x</button>
					<i class="fa-fw fa fa-times"></i> ${errorMessage}
				</div>
			</c:when>
			<c:otherwise>
				<c:choose>
					<c:when test="${sessionScope['SPRING_SECURITY_LAST_EXCEPTION'].message ne null}">
						<div class="alert alert-danger fade in">
							<button class="close" data-dismiss="alert">x</button>
							<i class="fa-fw fa fa-times"></i> ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
						</div>
					</c:when>
					<c:otherwise>
						<c:if test="${warningMessage ne null}">
							<div class="alert alert-warning fade in">
								<button class="close" data-dismiss="alert">x</button>
								<i class="fa-fw fa fa-warning"></i> ${warningMessage}
							</div>
						</c:if>
					</c:otherwise>
				</c:choose>
			</c:otherwise>
		</c:choose>
	</c:otherwise>
</c:choose>