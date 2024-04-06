<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="login.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div class="main">
        <div class="container">
            <div class="con1">
                <img src="signin-image.jpg">
                <a href="register.jsp">Create an account</a>
            </div>
            <div class="con2">
                <form action = "login" method = "post">
                    <h1>Sign in</h1>
                    <p><i class="fa-solid fa-user"></i> <input class="in" type = "text" placeholder="Name" name = "uname"> <br></p>
                    <p><i class="fa-solid fa-lock"></i> <input class="in" type = "password" placeholder="Password" name = "upass"><br></p>
                    
                    

                    <input type="checkbox">
                    <label for="checkbox">Remember me</label>

                    <button>Log In</button> 

                    <a href = "Index.html">Back to home</a>
                </form>
            </div>
        </div>
    </div>

</body>
</html>