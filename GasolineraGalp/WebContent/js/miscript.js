/**
 * 
 */

$(document).ready(function(){
		
		$('#formulariotarjeta').css("display", "none");
		
		$('#botontarjeta').on( "click", function() {
			$('#formulariotarjeta').toggle('slow'); 

		});
		
		
		$('#efectivo').css("display", "none");
		
		$('.efectivo').on( "click", function() {
			$('#efectivo').toggle('slow'); 

		});
		
		$("#formulariocombustible").css("display", "none");
		
		$('#botonescombustible button').on( "click", function() {
			$('#formulariocombustible').show("slow");
			
		});
		
	});