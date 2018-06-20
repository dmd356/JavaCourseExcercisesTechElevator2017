<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
			 
			 
			 

			<c:set var="mainCount" value="1"></c:set>
			<c:set var="nextCount" value="1"></c:set>
			
			<li>1</li>
			<li>2</li>
			<c:forEach begin="0" end="100">
			 <c:if test="${mainCount%3==0}">
			 	<li class="fizz">fizz</li>
		 	 </c:if>
		 	 <c:if test="${mainCount%5==0}">
			 	<li class="buzz">buzz</li>
		 	 </c:if>
		 	 <c:if test="${mainCount%5==0 && mainCount%3==0}">
			 	<li class="fizzbuzz">fizz buzz</li>
		 	 </c:if>
			<c:set var="mainCount" value="${mainCount+nextCount}"></c:set>
			<c:set var="thirdCount" value="${mainCount+nextCount}"></c:set>
			<li>${thirdCount}</li>	
				
				
			</c:forEach>
			
			
			
				 
		 

		
		</ul>
	</body>
</html>