$(document).ready(function() {
	$("#CUButton").click(function(){

		var person = {
				userName: $("#userName").val(),
				ini: $("#ini").val(),
				cpr: $("#cpr").val(),
				roles: getRoles(),
		}
		alert("userName: " + person.userName + ", ini: " + person.ini + ", cpr: " + person.cpr + ", roles: " + person.roles);
		
		$.ajax({
			type: "POST",
			url: "http://localhost:8080/rest/thisthat/createuser",
			data: JSON.stringify(person),
			dataType: "json",
			contentType: "application/json"
		});

	});

	function getRoles() {

		var roles = "[";

		if (Admin.checked==true) {
			roles = roles.concat("\"Admin\", ");
		}
		if (Operator.checked==true) {
			roles = roles.concat("\"Operator\", ");
		}
		if (Foreman.checked==true) {
			roles = roles.concat("\"Foreman\", ");
		}
		if (Pharmacist.checked==true) {
			roles = roles.concat("\"Pharmacist\", ");
		}
		roles = roles.substring(0, roles.length - 2);
		roles = roles.replace("//","");
		roles = roles.concat("]");
		return roles;

	}
});

