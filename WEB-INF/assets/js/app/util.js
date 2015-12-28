define(["jquery"], function($){
	
	var util = {};
	
	util.Ajax = function(){};
	util.Ui   = function(){};
	
	
	util.Ajax.prototype = new Object();
	util.Ui.prototype	= new Object();
	
	util.Ajax.get		= function(option, callback){
		var def = $.extend({
			async 		: false,
			data		: {},
			url			: contextUrl,
			method 		: "GET",
			beforeSend 	: function(){
				util.Ui.showWait();
			},
			complete	: function(){
				util.Ui.hideWait();
			},
			success		: callback,
			statusCode 	: {
				404		: function(){
					util.Ui.showError(404);
				}
			}
		}, option);
		return $.ajax(def).done(util.Ui.hideWait);
	};
	
	util.Ajax.post		= function(option, callback){
		
	};
	
	util.Ui.showWait	= function(){
		console.log("show Wait...")
	};

	util.Ui.hideWait	= function(){
		console.log("hide Wait...")
	};
	util.Ui.showError	= function(code){
		console.log("show Error...")
	};
	
	return util;
});