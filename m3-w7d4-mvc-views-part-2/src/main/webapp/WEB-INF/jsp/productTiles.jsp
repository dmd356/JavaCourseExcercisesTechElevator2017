
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


    <p>Toy Department</p>
    
    <c:forEach var="product" items="${requestScope.productList}">
    
            <div class="toydivlist">
            
                <img id="toypics"  src="<c:out value = "img/${product.imageName}"/>"/> 
                
                <p class="toylines">
                
                
        
                <c:url var="productDetailUrl" value="/productDetail">
                <c:param name="productId" value="${product.productId}"></c:param>
                </c:url>
                <a href = "${productDetailUrl}"><c:out value="${product.name}"/> </a>
                
                <c:if test="${product.topSeller == true}">
                <c:out value = "Best Seller"/>
                </c:if> 
                </p>
                        
                
                <p class="toylines"><c:out value = "by ${product.manufacturer}" /></p>
                <p class="toylines" id="red"><c:out value = "$ ${product.price}"/></p>              
                <p class="toylines"><c:out value = "Weight: ${product.weightInLbs}"/></p>
                
                <fmt:formatNumber var="ratingInt" value="${product.averageRating}" maxFractionDigits="0" />
    
                <c:url var="ratingImage" value="/img/${ratingInt}-star.png"/>
    
                <p ><img src="${ratingImage}" style="width:90px; height:25px; text-align:left; position: relative; right:105px"></p>
            
            </div>
            <div>
            <p class="pinstripe">&nbsp;</p>
            </div>
            
    </c:forEach>