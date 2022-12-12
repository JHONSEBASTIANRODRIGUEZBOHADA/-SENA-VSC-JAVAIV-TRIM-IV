<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head lang="es-co">
        <title>pirinola</title>
        <link rel="stylesheet" href="../Assets/style.css">
    </head>

    <body>
        <section id="pantalla-dividida">
            <div class="contenedor2">
                <h1>JUGADOR 1</h1>
                <br><h3>INFORMACION</h3><br>
                <label><b>NOMBRE</b></label><br>
                <input type="text" id="Pirinola"><br><br>
                <label><b>EDAD</b></label><br>
                <input type="number" id="Pirinola" pattern="[0-9]"><br><br>
                <label><b>DINERO ACUMULADO</b></label><br>
                <input type="number" pattern="[0-9]">
            </div class = "imagen">
            <div>
                <img src="../Assets/_img/pirinola.jpg" alt="pirinola" width="450" height="400" ><br><br><br><br><br><br><br>
                <label><b>Ingrese el dinero</b></label><br>
                <input type="number" pattern="[0-9]"><br><br><br><br>
                <br><br><br><a href="">Girar</a> 
                <a href="../index.jsp">Menú</a>
            </div>
            <div class="contenedor3">
                <h1>JUGADOR 2</h1>
                <br><h3>INFORMACION</h3><br>
                <label><b>NOMBRE</b></label><br>
                <input type="text" id="Pirinola"><br><br>
                <label><b>EDAD</b></label><br>
                <input type="number" id="Pirinola" pattern="[0-9]"><br><br>
                <label><b>DINERO ACUMULADO</b></label><br>
                <input type="number" pattern="[0-9]">
            </div>
        </section>
    </body>
</html>