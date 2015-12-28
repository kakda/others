//Project Constant

var CONSTANT = {
	
		PROJECT_STATUS_OPEN  				: "O",     
		PROJECT_STATUS_CLOSE 				: "C",
		PROJECT_STATUS_GENERAL_INFOR		: "G",
		PROJECT_STATUS_PROJECT_MEMBER		: "M",
		PROJECT_STATUS_PROJECT_RESOURCE		: "R",
		PROJECT_STATUS_BUDGET				: "B",
		
		
		ROLE_SUPER_USER				: "S",
		ROLE_PM						: "P",
		ROLE_EMPLOYEE				: "E",

		TIMECARD_STATUS_SAVE		: "SAVE",
		TIMECARD_STATUS_SUBMIT		: "SUBMIT",
		
		PROJECT_MEMBER_PM			: "PM",
		PROJECT_MEMBER_MEMBER		: "MEMBER",
		PROJECT_MEMBER_GROUP		: "GROUP",
		PROJECT_MEMBER_TBN			: "TBN",
		PROJECT_MEMBER_OUTSOURCE	: "OUTSOURCE",
		
		MM_FORMAT					: 2,
		
		BILL_PLAN_TYPE				: "PLAN",
		BILL_ACTUAL_TYPE			: "ACTUAL",
		
		PROJECT_TYPE_RND			: "R&D", 
		PROJECT_TYPE_SI				: "Billable SI", 
		
		MEMBERSHIP					: "MEMBERSHIP",
		UNSUBMIT					: "UNSUBMIT",
		PM							: "PM",
		OVERTIME					: "OVERTIME",
		
		LICENSE						: 'License',
		SERVICE						: 'SI & SM',
		OUT_SOURCE					: '3rd Party',
		
		REVENUETYPE					: function(key){
			switch(key){
				case 'SI' 			: return 'SI Revenue'; break;
				case 'SM' 			: return 'SM Revenue'; break;
				case 'LICENSE'		: return 'License Revenue'; break;
				case 'OUT_SOURCE'	: return '3rd party Solutions Revenue'; break;
				case 'INTERNAL_RD'	: return 'Internal R&D Revenue'; break;
				default				: return {
		    							LICENSE : 'License Revenue',					
							     		SI : 'SI Revenue',
							    		SM : 'SM Revenue',
							    		OUT_SOURCE : '3rd party Solutions Revenue',
							    		INTERNAL_RD : 'Internal R&D Revenue'
							    	}; break;
			}
		},
};