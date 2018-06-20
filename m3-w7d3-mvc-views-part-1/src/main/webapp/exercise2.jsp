<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
				
				
				...it must take the value of the previous number and add it then print it...
			 --%>
			
			<c:set var="mainCount" value="1"></c:set>
			<c:set var="nextCount" value="1"></c:set>
			
			<li>1</li>
			<c:forEach begin="0" end="25">
				<c:set var="nextCount" value="${nextCount}"></c:set>
			
				<c:set var="thirdCount" value="${mainCount+nextCount}"></c:set>
				<li>${thirdCount}</li>	
				<c:set var="mainCount" value="${nextCount}"></c:set>
				<c:set var="nextCount" value="${thirdCount}"></c:set>
				
				
			</c:forEach>
			
			
			 
		</ul>
	</body>
</html>