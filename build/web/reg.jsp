<%-- 
    Document   : form
    Created on : Jun 29, 2018, 8:05:24 AM
    Author     : dell
--%>
import java.sql.*;
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <center><body background = "pic1.jpg">
        
        <form action="/Pract/regser.jsp" method="post">
            <h1>Welcome to Registration</h1><br/><br/><br/><br/><br/><br/><br/><br/>
            
            UserName :  <input type="text" name="username" required/> <br/> <br/>
        Password : <input type="password" name="password" /><br/><br/>
        Name     : <input type="text" name="name" required/><br/><br/>
        Phone    : <input type="number" name="phone" ><br/><br/> 
        Age    : <input type="number" name="age" ><br/><br/>
        Sex:    
        <input type="radio" name="gender" value="male" required> Male
        <input type="radio" name="gender" value="female" required> Female
        <input type="radio" name="gender" value="other" required> Other<br/><br/>
        
               
       

            
         
             
                <input type='Submit' value='Submit'/>
        </form>
   
   </center> </body>
     </html> 