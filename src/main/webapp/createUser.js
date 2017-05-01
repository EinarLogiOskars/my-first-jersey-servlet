/**
 * 
 */

function ConvertFormToJSON(form) {
	var array = jQuery(form).serializeArray();
	var json = {};
	
	jQuery.each(array, function() {
		json[this.name] = this.value || '';
	});
	
	return json;
}


$(document).ready(function() {
	$("form#CUButton").submit(function() {
		
		var form = this;
		var json = ConvertFormToJSON(form);
		
		$.ajax({
			type: "POST",
			url: "localhost:8080/rest/thisthat/createuser",
			data: json,
			datatype: "json"
		})
		
		
		return true;
	});
});