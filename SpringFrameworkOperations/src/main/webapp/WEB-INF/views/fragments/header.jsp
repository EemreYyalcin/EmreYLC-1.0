<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-default">
		<div class="container-fluid">
		
			<div class="navbar-header">
      			<a class="navbar-brand" href="#">Users Polls</a>
    		</div>
    		
    		<ul class="nav navbar-nav">
    		
    			<li><a href="#">Home</a></li>
    		
    			<li class="dropdown">
          			
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Accounts <span class="caret"></span></a>
          	
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/user/add"/>">Add</a></li>
            			<li><a href="<spring:url value="/category/getAll"/>">Categories</a></li>
            			<li><a href="<spring:url value="/account/getAll"/>">Accounts</a></li>
          			</ul>
          			
        		</li>
        		
    			<li class="dropdown">
          		
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Polls <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="#">Add</a></li>
            			<li><a href="#">Find</a></li>
            			<li><a href="#">Display</a></li>
          			</ul>
        		
        		</li>
    			<li class="dropdown">
          		
          			<a href="#" class="dropdown-toggle" 
          				data-toggle="dropdown" role="button" 
          				aria-expanded="false">Exceptions <span class="caret"></span></a>
          		
          			<ul class="dropdown-menu" role="menu">
            			<li><a href="<spring:url value="/user/throw"/>">Controller</a></li>
            			<li><a href="<spring:url value="/user/globalThrow"/>">Global</a></li>
          			</ul>
        		
        		</li>
        		
        		<li><br><br>${currentDate}</li>  
        		
    		</ul>
    		
		</div>
</nav>