var Yuga = {};



$(document).ready(function(){

	Yuga.config = {
		
		jqgrid : {
			autowidth : true,
			jsonReader : {
				repeatitems : false
			},
			page: 1,
			rowNum: 20,
			datatype: "json",
			viewrecords : true,
			height : "auto",
			ignoreCase : true,
			rowList: [10, 20, 30, 50, 100],
			view: true,
			treeReader: {
				level_field:'level',
				parent_id_field:'parent',
				leaf_field:'leaf',
				expanded_field:'expanded'
			},
			prmNames: {
				page:"page",
				rows:"rows", 
				sort: "sortField",
				order: "sortType", 
				search:"search",
				oper: "operation"
			}
		},
		
		datepicker : {
			dateFormat: "yy-mm-dd"	
		},
		
		format : {
			date : "yyyy/MM/dd",
			time : "hh:mm:ss tt",
			datetime : "yyyy-MM-dd hh:mm:ss tt"
		},
		
		ajax : {
			
			beforeSend : function(){

				$(".message").remove();
				Yuga.waiting.show();
			},
			complete : function(){
				
				Yuga.waiting.hide();
			},
			success : function(){
				
				Yuga.waiting.hide();
			},
			error : function(jqXHR, textStatus, errorThrown){
				
				// Leave abort request
				if (jqXHR.status === 0 || jqXHR.readyState === 0) {
			        return;
			    }
				
				var $span = $("<span>");
				
				$span.text("x")
					 .addClass("close")
					 .on({
						 click : function(){
							 
							 $(this).parent().remove();
						 }
				 });
				
				$("<div>", {
					html : "<b>Error</b> Error when processing. Status code " + textStatus				
				}).addClass("message type2")
				  .prependTo(".container").append($span);
				
				Yuga.waiting.hide();
			}
		}
	};
	
	Yuga.dialog = {};
	Yuga.waiting = {};
	
	Yuga.initMessage = function(){

		var INFO_MESSAGE = 1;
		var ERROR_MESSAGE = 2;
		var SUCCESS_MESSAGE = 3;
		var $span = $("<span>");
		
		$(".message.type" + INFO_MESSAGE).prepend("<b>Warning!</b>");
		$(".message.type" + ERROR_MESSAGE).prepend("<b>Error</b>");
		$(".message.type" + SUCCESS_MESSAGE).prepend("<b>Success</b>");
		
		$span.text("x")
			 .addClass("close")
			 .on({
				 click : function(){
					 
					 $(this).parent().remove();
				 }
			 });
		
		$(".message").append($span);
	};


	Yuga.dialog.confirm = function(message, okCallback, cancelCallBack){
		
		var isCancel = true;
		
		var $dialog = $("<p>", {
				html : message
			})
			.dialog({
				modal : true,
				title : "Confirm",
				close: function(){
					if( isCancel ){
						if( cancelCallBack != null ){
							cancelCallBack.call(this);
						}
					}
				},
				buttons : {
					"OK" : function(){
						isCancel = true;
						$(this).dialog("close");
						okCallback.call(this);
					},
					"Cancel" : function(){
						$(this).dialog("close");
						if( cancelCallBack != null ){
							cancelCallBack.call(this);
						}
					}
				}
		});
	};
	
	Yuga.dialog.alert = function(message){
		var $dialog = $("<p>", {
			html : message
		})
		.dialog({
			modal : true,
			title : "Infomation",
			buttons : {
				"Close" : function(){
					$(this).dialog("close");
				}
			}
		});
	};

	Yuga.waiting.show = function(){
		
		var $wait = $("#waiting");
		$wait.show();
	};
	
	Yuga.waiting.hide = function(){
		
		var $wait = $("#waiting");
		$wait.hide();
	};
	
	Yuga.redirect = function(url){
		window.location.href = url;
		return false;
	};
	
	Yuga.datepicker = function(){

//		$(".startDate").datepicker({
//			onSelect : function() {
//				var minDate = $(this).datepicker('getDate');
//				$('.endDate').datepicker('option', 'minDate', minDate);
//			}
//		});
		$('.endDate').datepicker({
			onSelect : function() {
				var maxDate = $(this).datepicker('getDate');
				$('.startDate').datepicker('option', 'maxDate', maxDate);
			}
		});
		
		$('.date').datepicker();
	};
	
	Yuga.init = function(){
		
		Yuga.initMessage();
		Yuga.datepicker();
		
		$.extend($.jgrid.defaults, Yuga.config.jqgrid);
		$.datepicker.setDefaults(Yuga.config.datepicker);
		$.ajaxSetup(Yuga.config.ajax);
	};
	
	Yuga.getFormatDate = function(){
		return Yuga.config.format.date;
	};
	
	Yuga.commaSeparateNumber = function( val ){
		if(val == null || val == undefined){
			val = 0;
		}
	    while (/(\d+)(\d{3})/.test(val.toString())){
	      val = val.toString().replace(/(\d+)(\d{3})/, '$1'+','+'$2');
	    }
	    return val;
	};
	
	Yuga.removeComma = function(val){
		return val.replace(/,/g, '');
	};
	
	Yuga.init();
	
	Yuga.baseURL = function(){
		var l = window.location;
		var url =  "/" + l.pathname.split('/')[1] + "/";
		return url;
	};
	
});
