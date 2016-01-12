<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- Form signup -->
<div class="container">
    <div class="row">
        <h3>Signup for FREE</h3>
    </div>
    <div class="row signup-form">
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
            <s:form class="form-horizontal" method="POST" action="/user/signupProcess">
                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">Username*</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="username" name="user.username"
                            placeholder="6<=Username<=20" required="required" pattern=".{6,20}">
                    </div>
                </div>
                <br>
                <br>
                <br>
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">Email*</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="email" name="user.email"
                            placeholder="Email" required="required" maxlength=40>
                    </div>
                </div>
                <br>
                <br>
                <div class="form-group">
                    <label for="password" class="col-sm-2 control-label">Password*</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="password"
                            name="user.password" placeholder="6<=Password<=16" required="required"
                            pattern=".{6,16}">
                    </div>
                </div>
                <br>
                <br>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary pull-right">Sign up</button>
                    </div>
                </div>
            </s:form>
        </div>
    </div>
</div>