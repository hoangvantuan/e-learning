<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
    <div class="left-bar col-md-4">
        <div class="row">
            <div class="thumbnail">
                <img src="${user.avatar}" alt="avatar" class="image-responsive" width="120">
                <div class="caption">
                    <p>Username: ${user.username }</p>
                    <p>Join day: ${user.createdAt }</p>
                    <p>Joined day:${joinedDay } days</p>
                    <p>Email : ${user.email }</p>
                    <s:if test="user.isAdmin">
                        <p>Level: Admin</p>
                    </s:if>
                    <s:else>
                        <p>Level: Member</p>
                    </s:else>

                    <a href='<s:url value="/user/changeAvatarForm"></s:url>'>Change Avatar</a> <br>
                    <a href='<s:url value="/user/changePasswordForm"></s:url>'>Change your
                        password</a>
                </div>
            </div>
        </div>
    </div>
    <div class="right-bar col-md-4">
        <div class="panel panel-warning">
            <div class="panel-heading">
                <h3 class="panel-title">Following</h3>
            </div>
            <div class="panel-body">
                <s:iterator value="listFollow">
                    ${followingId }
                    ${followerId  }<br>
                </s:iterator>
            </div>
        </div>
    </div>
    <div class="right-bar col-md-4">
        <div class="panel panel-danger">
            <div class="panel-heading">
                <h3 class="panel-title">Follower</h3>
            </div>
            <div class="panel-body">List Follower</div>
        </div>
    </div>