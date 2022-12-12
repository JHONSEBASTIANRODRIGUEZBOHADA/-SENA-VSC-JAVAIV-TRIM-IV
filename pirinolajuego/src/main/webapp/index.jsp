<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es-co">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./Assets/style.css">
    <title>Pirinola Game</title>
</head>
<body>
    <div class="contenedor1">
        <br><h1>JUEGO DE LA PIRINOLA</h1><br>
        <label>NOMBRE JUGADOR 1</label>
        <input type="text" id="Pirinola">
        <label>EDAD JUGADOR 1</label>
        <input type="number" id="Pirinola" pattern="[0-9]"><br><br>
        <label>NOMBRE JUGADOR 2</label>
        <input type="text" id="Pirinola">
        <label>EDAD JUGADOR 2</label>
        <input type="number" id="Pirinola" pattern="[0-9]"><br><br><br>
        <label>DINERO CON EL QUE VAN A APOSTAR</label><br><br>
        <input type="number" id="Pirinola" pattern="[0-9]"><br><br><br><br>
        <a href="./Views/juego.jsp">Iniciar Juego</a>
    </div>
</body>
</html>