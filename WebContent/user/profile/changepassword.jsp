<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- Form update -->
<div class="container">
	<div class="row">
		<h3>Change Your Password</h3>
	</div>
	<div class="row update-form">
		<div class="col-md-5 col-md-offset-3">
			<div>
				<div>
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
			<br>
			<s:form class="form-horizontal" method="POST"
				action="/user/changePassword">
				<div class="form-group row">
					<label for="oldPassword" class="col-md-3 control-label">Old
						password*</label>
					<div class="col-md-9">
						<input type="password" class="form-control" id="oldPassword"
							name="password.oldPassword" placeholder="Old password"
							required="required">
					</div>
				</div>
				<div class="form-group row">
					<label for="newPassword" class="col-md-3 control-label">New
						Password*</label>
					<div class="col-md-9">
						<input type="password" class="form-control" id="newPassword"
							name="password.newPassword" placeholder="New password"
							required="required">
					</div>
				</div>
				<div class="form-group row">
					<label for="confirmPassword" class="col-md-3 control-label">Confirm
						Password*</label>
					<div class="col-md-9">
						<input type="password" class="form-control" id="confirmPassword"
							name="password.confirmPassword" placeholder="Confirm password"
							required="required">
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<button type="submit" class="btn btn-primary pull-right">Change</button>
					</div>
				</div>
			</s:form>
		</div>
	</div>
</div>