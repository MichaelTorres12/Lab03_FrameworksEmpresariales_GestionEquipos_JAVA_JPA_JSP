<%-- 
    Document   : modificarEquipo
    Created on : 24 abr 2024, 12:22:27
    Author     : Michael Torres
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Equipo</title>
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
            }
            input[type="text"] {
                width: 100%;
                padding: 10px;
                margin-top: 10px;
                border: 1px solid #dddddd;
                border-radius: 4px;
                box-sizing: border-box; /* Include padding and border in the element's total width and height */
            }
            button {
                width: 100%;
                padding: 10px;
                background-color: #0275d8;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                margin-top: 20px;
                box-sizing: border-box;
            }
            button:hover {
                background-color: #025aa5;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Modificar Equipo</h1>
                <form action="" method="post">
                <input type="text" placeholder="Id del equipo a modificar" name="idEquipo" required>
                <input type="text" placeholder="Nuevo nombre del equipo" name="nombres" required>
                <input type="text" placeholder="Nuevo deporte" name="deporte" required>
                <input type="text" placeholder="ID de País" name="idPais" required>
                <input type="text" placeholder="Nuevo Año de Fundación" name="anioFundacion" required>
                <input type="text" placeholder="Confederacion del equipo" name="confederacion" required>
                <button type="submit" value="Modificar">Aceptar</button>
        </form>
        </div>
    </body>
</html>
