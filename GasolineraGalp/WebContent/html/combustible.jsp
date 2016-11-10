<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/estilo.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="js/miscript.js"></script>

<meta charset="ISO-8859-1">
<title>Combustible</title>
</head>
<body>

	<h2 id="tipos">TIPOS DE COMBUSTIBLE</h2>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

	<p>
		Ha pagado con <%= request.getAttribute("dato1") %>
	</p>

	<div class="row">

		<div class="col-sm-3"></div>

		<div class="col-sm-6">

			<div id="botonescombustible">
				<button>Sin 95</button>

				<button>Sin 98</button>

				<button>Gasoleo A</button>

				<button>Gasoleo E</button>

			</div>
		</div>

		<div class="col-sm-3"></div>

	</div>
	<br>
	<br>
	<br>
	<br>
	<br>

	<div class="row">


		<div class="col-sm-3"></div>

		<div class="col-sm-6">
			<form action="Pago" method="post" id="formulariocombustible">
				<p>Confirmar datos de compra</p>
				<input name="nombre" type="text" placeholder="Nombre"> <br>
				<br> <input name="apellido" type="text" placeholder="Apellidos">
				<br>
				<br> <input name="pagar" type="submit" value="Pagar">
			</form>
		</div>

		<div class="col-sm-3"></div>

	</div>


</body>
</html>