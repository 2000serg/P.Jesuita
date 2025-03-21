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

	while($fila=$resultado->fetch_array()){
		echo '<option class="visitas" value="'.$fila["ip"]'."------".$fila["firma"]."</p>";
		}
?>
