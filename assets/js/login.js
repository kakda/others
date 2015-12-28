$(document).ready(function(){

	$("#login").validate({
		rules : {
			id : {
				required : true
			},
			password : {
				required : true
			}
		}
	});
});