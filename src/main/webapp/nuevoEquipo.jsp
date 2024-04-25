<%-- 
    Document   : nuevoEquipo
    Created on : 24 abr 2024, 12:22:40
    Author     : Michael Torres
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Equipo</title>
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
                box-sizing: border-box; /* Incluye el padding en el ancho total */
            }
            button {
                width: 100%;
                padding: 10px;
                background-color: #5cb85c;
                color: white;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                margin-top: 20px;
                box-sizing: border-box;
            }
            button:hover {
                background-color: #4cae4c;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Crear Equipo</h1>
            <form action="" method="post"> <!-- Asegúrate de reemplazar con la URL correcta de tu Servlet -->
                <input type="text" placeholder="Nombre del equipo" name="nombres" required>
                <input type="text" placeholder="Deporte" name="deporte" required>
                <input type="text" placeholder="ID de País" name="idPais" required>
                <input type="text" placeholder="Año de Fundación" name="anioFundacion" required>
                <button type="submit" value="Guardar">Aceptar</button>
            </form>
        </div>
    </body>
</html>

