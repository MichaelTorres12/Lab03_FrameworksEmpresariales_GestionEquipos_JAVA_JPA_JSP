<%-- 
    Document   : eliminarEquipo
    Created on : 24 abr 2024, 12:21:39
    Author     : Michael Torres
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Equipo</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
                color: #333;
            }
            .container {
                width: 35%;
                margin: auto;
                padding: 20px;
            }
            form {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                max-width: 300px;
            }
            input[type="text"] {
                width: 100%;
                padding: 10px;
                margin-top: 10px;
                border: 1px solid #dddddd;
                border-radius: 4px;
                box-sizing: border-box; /* Include padding and border in the element's total width and height */
            }
            input[type="submit"] {
                width: 100%;
                padding: 10px;
                background-color: #d9534f;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                margin-top: 20px;
                box-sizing: border-box;
            }
            input[type="submit"]:hover {
                background-color: #c9302c;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Eliminar Equipo</h1>
            <form action="" method="post"> <!-- Make sure to replace with the correct URL for your Servlet -->
                <label for="idEquipo">ID del equipo:</label>
                <input type="text" id="idEquipo" name="idEquipo" required/><br/>
                <input type="submit" value="Eliminar"/>
            </form>
        </div>
    </body>
</html>

