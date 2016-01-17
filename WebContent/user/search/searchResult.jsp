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
    <br><br>
    <div class="row">
        <div class="left-bar col-md-4 col-md-offset-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    <s:iterator value="resultSearch">
                        <a href="showProfile${userId }" role="button">${username }</a>
                        <br>
                    </s:iterator>
                </div>
            </div>

        </div>
    </div>
</div>