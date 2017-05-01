$(document).ready(function() {
	$("#CUButton").click(function(){
		alert("working");
		var person = {
			userName: $("#userName").val(),
			ini: $("#ini").val(),
			cpr: $("#cpr").val(),
			roles: getRoles(),
		}
		alert(person);
	});
	
	function getRoles() {
		
		var roles = "[";
		
		if ($("#Admin").checked==true) {
			roles.append("\"Admin\", ");
		}
		if ($("#Operator").checked==true) {
			roles.append("\"Operator\", ");
		}
		if ($("#Foreman").checked==true) {
			roles.append("\"Foreman\", ");
		}
		if ($("#Pharmacist").checked==true) {
			roles.append("\"Pharmacist\"");
		}
		roles.append("]");
		
		return roles;
		
	}
});

