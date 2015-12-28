<%@ include file="/WEB-INF/views/element/tag.jsp" %>
<header role="banner" id="top" class="navbar navbar navbar-default navbar-static-top">
  <div class="container">
    <div class="navbar-header">
      <button aria-expanded="false" aria-controls="bs-navbar" data-target="#bs-navbar" data-toggle="collapse" type="button" class="navbar-toggle collapsed">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
      <a class="navbar-brand" href="<c:url value="/dashboard/index" />">Redmine API</a>
    </div>
    <nav class="collapse navbar-collapse" id="bs-navbar">
      <ul class="nav navbar-nav">
        <li>
          <a href="<c:url value="/project" />">Project</a>
        </li>
        <li>
          <a href="<c:url value="/issue" />">Issue</a>
        </li>
        <li>
          <a href="<c:url value="/attachment" />">Attachment</a>
        </li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a  href="#">API Key</a></li>
        <li><a  href="#">User Account</a></li>
      </ul>
    </nav>
  </div>
</header>