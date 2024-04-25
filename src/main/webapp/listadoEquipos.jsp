<%-- 
    Document   : listadoEquipos
    Created on : 24 abr 2024, 12:22:07
    Author     : Michael Torres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Equipos</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
                color: #333;
            }
            .container {
                width: 80%;
                margin: auto;
                padding: 20px;
            }
            table {
                width: 100%;
                margin-top: 20px;
                border-collapse: collapse;
            }
            table, th, td {
                border: 1px solid #dddddd;
            }
            th, td {
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #333;
                color: white;
            }
            tr:nth-child(even) {
                background-color: #f2f2f2;
            }
            tr:hover {
                background-color: #ddd;
            }
            
            
            
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Listado de Equipos</h1>
            <table>
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Deporte</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${equipos}" var="equipo">
                        <tr>
                            <td>${equipo.nombres}</td>
                            <td>${equipo.deporte}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            
            
        </div>
    </body>
</html>
