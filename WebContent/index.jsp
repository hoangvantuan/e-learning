<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offser-3">
			<s:if test="hasActionErrors()">
				<div class="errors text-warning">
					<s:actionerror />
				</div>
			</s:if>
		</div>
		<div>
			<s:if test="hasActionMessages()">
				<div class="message text-info">
					<s:actionmessage />
				</div>
			</s:if>
		</div>
	</div>
	<s:if test="!#session.user">
		<div class="jumbotron jumbotron-customer">
			<h1>Let's Learning Japanese together !</h1>
			<p>We are E-LEARNING system, Sign up now to learn more.</p>
			<a class="btn btn-primary btn-lg"
				href="<s:url value="/user/signinForm" ></s:url>" role="button">Sign
				in</a> <a class="btn btn-primary btn-lg"
				href="<s:url value="/user/signupForm" ></s:url>" role="button">Sign
				up</a>
		</div>
	</s:if>

	<s:else>
		<div class="left-bar col-md-3">
			<div class="row">
				<div class="thumbnail">
					<img src="${pageContext.request.contextPath }${user.avatar}"
						alt="avatar" class="image-responsive" width="120">
					<div class="caption">
						<p>Username: ${user.username }</p>
						<p>Join day: ${user.createdAt }</p>
						<s:if test="user.isAdmin">
							<p>Level: Admin</p>
						</s:if>
						<s:else>
							<p>Level: Member</p>
						</s:else>
						<a href='<s:url value="/user/changeAvatarForm"></s:url>'>Change
							Avatar</a> <br> <a
							href='<s:url value="/user/changePasswordForm"></s:url>'>Change
							your password</a>
					</div>
				</div>
			</div>
		</div>
		<div class="right-bar col-md-9">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">Activities</h3>
				</div>
				<div class="panel-body">Activities</div>
			</div>
		</div>
	</s:else>
</div>
