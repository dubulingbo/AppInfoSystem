<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"
						+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <title>User Log</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/statics/css/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css" rel="stylesheet">
    
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/statics/css/custom.min.css" rel="stylesheet">
  </head>
  
<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a>
		<a class="hiddenanchor" id="signin"></a>
		<div class="login_wrapper">
        	<div class="animate form login_form">
          		<section class="login_content">
            		<form action="dologin" method="post">
              			<h1>Login Form</h1>
			            <div>
			            	<input type="text" class="form-control" name="devCode" placeholder="Username" required="" />
			            </div>
	              		<div>
	                		<input type="password" class="form-control" name="devPassword" placeholder="Password" required="" />
	              		</div>
	              		<span>${error}</span>
	              		<div>
	                		<button type="submit" class="btn btn-success">登  录</button>
	                		<button type="reset" class="btn btn-default">重  置</button>
	                		<a class="reset_pass" href="#">Lost your password?</a>
	              		</div><br>
	              		<div>
	              			<p>©2019 All Rights Reserved.</p>
	              		</div>
					</form>
				</section>
			</div>
		</div>
	</div>
</body>
</html>