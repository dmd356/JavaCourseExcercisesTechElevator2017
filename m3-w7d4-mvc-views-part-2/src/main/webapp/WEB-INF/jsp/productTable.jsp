<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
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
      	
      	<p><c:url var="productImage" value="/img/${product.imageName}"/><img src="${product.imageName} alt="image" height="50" width="50"></p>
      	<p><c:out value="${product.name}"/>
      	<p><c:out value="${product.description}"/>
      	<p><c:out value="${product.manufacturer}"/>
      	<p><c:out value="${product.weightInLbs}"/>
      	<p><c:out value="${product.price}"/>
      	<p><c:out value="${product.averageRating}"/>
      	<p><c:out value="${product.remainingStock}"/>
      	<p><c:out value="${product.topSeller}"/>
      	
      </c:forEach>
       

    </section>
</body>
</html>