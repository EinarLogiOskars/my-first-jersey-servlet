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
		
		$.ajax({
		        url: "localhost:8080/something",
		        data: $("#CUForm").serializeJSON(),
		        contentType: "application/json",
		        method: 'POST',
		        success : function(data){
		            alert("Posted data: " + data);
		        },
		        error: function(jqXHR, text, error){
		            alert(jqXHR.status + text + error);
		        }
		});
		
		$.ajax({
			url: "localhost:8080/something",
			data: $("#somethingFromShowUsersHTML"),
			contentType: "String", 
			method: 'GET',
			succes: function(data){
				alert("Got data: " + data);
			},
			error: function(jqXHR, text, error){
				alert(jqXHR.status + text + error);
			}
		});
		
		$("#CUButton").click(function() {
			
		});
});
