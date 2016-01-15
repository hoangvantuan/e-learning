<%@ taglib uri="/struts-tags" prefix="s"%>
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href='<s:url value="/"></s:url>'><img
				alt="Logo" src="/JavaProject02/image/common/logo.png" height="40"
				width="auto"></a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href='<s:url value="/"></s:url>'>Home<span
						class="sr-only">(current)</span></a></li>
				<s:if test="#session.user">
					<li><a href="#">Word List</a></li>
					<li><a href="#">Categories</a></li>
				</s:if>
				<li><a href='<s:url value="/info/showAbout"></s:url>'>About</a></li>
				<li><a href='<s:url value="/info/showContact"></s:url>'>Contact</a></li>
			</ul>
			<s:if test="#session.user">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">${user.username}<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href='<s:url value="/user/showProfile"></s:url>'><i
									class="glyphicon glyphicon-user"></i>&nbsp;Profile</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-grain"></i>&nbsp;Activities</a></li>
							<li role="separator" class="divider"></li>
							<li><a href='<s:url value="/user/logout"></s:url>'><i
									class="glyphicon glyphicon-off"></i>&nbsp;Logout</a></li>
						</ul></li>
				</ul>
			</s:if>
			<s:else>
				<ul class="nav navbar-nav navbar-right">
					<li><a href='<s:url value="/user/signinForm"></s:url>'>Signin</a></li>
					<li><a href='<s:url value="/user/signupForm"></s:url>'>Signup</a></li>
				</ul>
			</s:else>

		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>