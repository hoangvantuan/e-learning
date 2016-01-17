<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
    <div class="row">
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
    </div>
    <div class="left-bar col-md-4">
        <div class="row">
            <div class="thumbnail">
                <img src="${user.avatar}" alt="avatar" class="image-responsive" width="120"><br>
                <s:if test="#session.user.userId != user.userId">
                    <div class="text-center">
                        <s:if test="isFollowing">
                            <a class="btn btn-danger text-center" href="unfollow${user.userId }"
                                role="button">Unfollow</a>
                        </s:if>
                        <s:else>
                            <a class="btn btn-default text-center" href="follow${user.userId }"
                                role="button">Follow</a>
                        </s:else>

                    </div>
                </s:if>
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
                    <s:if test="#session.user.userId == user.userId">
                        <a href='<s:url value="/user/changeAvatarForm"></s:url>'>Change Avatar</a>
                        <br>
                        <a href='<s:url value="/user/changePasswordForm"></s:url>'>Change your
                            password</a>
                    </s:if>
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
                <s:iterator value="listUserFollower">
                    <a href="showProfile${userId }" role="button">${username }</a>
                    <br>
                </s:iterator>
            </div>
        </div>
    </div>
    <div class="right-bar col-md-4">
        <div class="panel panel-danger">
            <div class="panel-heading">
                <h3 class="panel-title">Follower</h3>
            </div>
            <div class="panel-body">
                <s:iterator value="listUserFollowing">
                    <a href="showProfile${userId }" role="button">${username }</a>
                    <br>
                </s:iterator>
            </div>
        </div>
    </div>
</div>