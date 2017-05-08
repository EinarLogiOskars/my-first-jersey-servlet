/**
 * 
 */


$(document).ready(function() {
	$("#DUButton").click(function(){

		$.ajax({
			type: "POST",
			url: "http://localhost:8080/rest/thisthat/deleteuser",
			success: function(data){
				alert(data);
				$("#respone").html(data);
			}
		});

	});

});

