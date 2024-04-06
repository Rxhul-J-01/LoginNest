<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="register.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

	<div class="main">
        <div class="container">
            <div class="con2">
                <form action = "register" method = "post">
                    <h1>Sign up</h1>
                    <p><i class="fa-solid fa-user"></i> <input class = "in" type = "text" placeholder=" Your Name" name = "name"> <br></p>
                    <p><i class="fa-solid fa-envelope"></i> <input class = "in" type = "text" placeholder = "Your Email" name = "email"><br></p>
                    <p><i class="fa-solid fa-lock"></i> <input class = "in" type = "password" placeholder="Password" name = "pass"><br></p>
                    <p><i class="fa-solid fa-unlock"></i> <input class = "in" type = "text" placeholder = "Repeat your password" name = "rpass"><br></p>
                    
                    <input type="checkbox">
                    <label for="checkbox">I agree all statements in <a>Terms of service</a></label>
                    <button>Register</button> 
                </form>
            </div>
            
            <div class="con1">
                <img src="signup-image.jpg">
                <a href="login.jsp">Login</a>
                
                <a href="Index.html">Back to home</a>
            </div>
        </div>
    </div>

</body>
</html>