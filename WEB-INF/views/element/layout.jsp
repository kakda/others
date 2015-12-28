<%@ include file="/WEB-INF/views/element/tag.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><tiles:getAsString name="title" defaultValue="Redmine API" /></title>
	<link rel="stylesheet" href="${resourceUrl}/css/bootstrap.css">
	<link rel="stylesheet" href="${resourceUrl}/css/bootstrap-theme.css">
	<script type="text/javascript" > 
		window.resourceUrl 	= "${resourceUrl}";
		window.contextUrl 	= "${contextUrl}";
	</script>
</head>
	<body>
		<tiles:insertTemplate template="/WEB-INF/views/element/header.jsp" />
		<div class="container">
	    	<tiles:insertAttribute name="body" />
		</div>
		<tiles:insertTemplate template="/WEB-INF/views/element/footer.jsp" />
	</body>
</html>