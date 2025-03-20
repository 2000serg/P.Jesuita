<?php
//Conecta con la base de datos ($conexión)
    include 'configdb.php'; //include del archivo con los datos de conexión
	$conexion = new mysqli(SERVIDOR, USUARIO, PASSWORD, BBDD); //Conecta con la base de datos
    $conexion->set_charset("utf8"); //Usa juego caracteres UTF8
	//Desactiva errores
	$controlador = new mysqli_driver();
    $controlador->report_mode = MYSQLI_REPORT_OFF;
	

//obtener nombre jesuita
	$nombre_jesuita=.$_POST["nombre"];	
	$sql=" SELECT idJesuita from jesuita"
	where nombre=".$_POST["nombre"]".? AND codigo="$_POST["codigo"]";				//prepara la consulta
	echo $sql;	//Para probar
	$resultado=$conexion->query($sql);
	
//Obtener ip

	$sql="SELECT ip, lugar from lugar;"; //Prepara la consulta
	echo $sql;	//Para probar
	$resultado=$conexion->query($sql);
?>

<!DOCTYPE html>
<html class="jesuitas">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta lang="es"/>
		<title>Formulario</title>
		<link rel="stylesheet" href="./ciudades.css">
	</head>
	<body class="jesuitas">
		<h1 class="jesuitas">Ciudades</h1>
		<br><br><br>
		<form class="jesuitas" method="POST" action="./jesuitas.php"> 
			<label> Lugar </label>
			<select id="ciudades" class="visitas" name="select_ciudades" >
				<option class="visita" value="124.10.6.0">Madrid
				<option class="visita" value="124.10.6.1">Sevilla
				<option class="visita" value="124.10.6.2">Cordoba
				<option class="visita" value="124.10.6.3">Caceres
				<option class="visita" value="124.10.6.4">Valencia
				<option class="visita" value="124.10.6.5">Vigo
			
			</select>
			<input type="submit" name="Enviar">
		</form>
		 <?php
		while($fila=$resultado->fetch_array()){
			echo '<option class="visitas" value="'.$fila["ip"]'."------".$fila["firma"]."</p>";
		}*/
	














	</body>
</html>