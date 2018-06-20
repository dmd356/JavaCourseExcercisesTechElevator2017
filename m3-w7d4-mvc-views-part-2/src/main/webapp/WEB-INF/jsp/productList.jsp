<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">

      <c:forEach var="product" items="${productList}">
      <div class="productDiv">
      	<p font-size="38px"><c:out value="${product.name}"/>
      	<p>
      	<c:url var="productImage" value="/img/${product.imageName}"/>
      	<img src="${productImage}" style="float:left" alt="image" height="100" width="100">
      	</p>
      	<div>
      	<p><c:out value="${product.manufacturer}"/>
      	<p><c:out value="${product.weightInLbs}"/>lbs </p>
      	<p>$<c:out value="${product.price}"/></p>
      	<c:if test="${product.averageRating < 2 && product.averageRating > 1}">
		 <c:set var="imageName" value="1-star.png"/> 
		</c:if>  
		<c:if test="${product.averageRating < 3  && product.averageRating > 2}">
		 <c:set var="imageName" value="1-star.png"/> 
		</c:if>  
		<c:if test="${product.averageRating < 4  && product.averageRating > 3}">
		 <c:set var="imageName" value="1-star.png"/> 
		</c:if>  
		<c:if test="${product.averageRating < 5  && product.averageRating > 4}">
		 <c:set var="imageName" value="1-star.png"/> 
		</c:if>  
		<c:if test="${product.averageRating < 6  && product.averageRating > 5}">
		 <c:set var="imageName" value="1-star.png"/> 
		</c:if> 
		<c:url var="imageUrl" value="/img/${imageName}"/>
      	<p><img src="${imageUrl}" width="100px">
      	</div>
      	
      	</div>
      	<hr>
      </c:forEach>

    </section>
</body>
</html>