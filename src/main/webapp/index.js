$(document).ready(function() {
		$("#createuser").click(function() {
			$("#div2").load("createUser.html");
		});
		
		$("#showusers").click(function() {
			$("#div2").load("showUsers.html");
		});
		
		$("#updateuser").click(function() {
			$("#div2").load("updateUser.html");
		});	
		
		$("#deleteuser").click(function() {
			$("#div2").load("deleteUser.html");
		});
		
		$("#SUButton").click(function(){
			$.ajax({
				url: "localhost:8080/rest/",
				//data: $("#somethingFromShowUsersHTML"),
				//contentType: "String", 
				method: 'POST',
				succes: function(data){
					alert("Got data: " + data);
				},
				error: function(jqXHR, text, error){
					alert(jqXHR.status + text + error);
				}
			});
		});
		
		$("#CUButton").click(function() {
			$.ajax({
				url: "localhost:8080/rest/createuser",
				data: $("form#CUForm").serializeObject(),
				contentType: "application/json",
				method: 'POST',
				success : function(data){
					alert("Posted data: " + data);
				},
				error: function(jqXHR, text, error){
					alert(jqXHR.status + text + error);
				}
			});
		});

});
