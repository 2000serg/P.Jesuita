<?php
//Recoge la información del formulario
echo $idJesuita=$_GET["nJesuita"];
echo "</br>"   //asigna el valor que se envía del formulario, recuerda acabar con ;
echo $ipLugar= $ipLugar=$_GET["codigo"];

//Conecta con la base de datos ($conexión)
    include 'configdb.php'; //include del archivo con los datos de conexión
	$conexion = new mysqli(SERVIDOR, USUARIO, PASSWORD, BBDD); //Conecta con la base de datos
    $conexion->set_charset("utf8"); //Usa juego caracteres UTF8
	//Desactiva errores
	$controlador = new mysqli_driver();
    $controlador->report_mode = MYSQLI_REPORT_OFF;
	
//Cadena de caracteres de la consulta sql	
	$sql="INSERT INTO viaje ........ VALUES(".idJesuita."','".   //completa lo que falta
	echo $sql; //envía el contenido de la variable al navegador, o sea, muestra la información en el navegador
	
//Ejecuta la consulta
	$conexion->query($sql);
	if($conexion->affected_rows>0)
		echo "<h2>Visita realizada</h2>";
	else{
		echo "<h2>La visita no se ha realizado</h2>";
		echo '<h3><a href="tu_formulario.html"> Vuelve a intentarlo</a></h3>';
	}	

//Cierra la conexión
	$conexion->close();
?>
