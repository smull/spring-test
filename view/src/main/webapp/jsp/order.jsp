<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 19.03.2015
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
    <title>Order</title>
    <script src="<c:url value="/resources/mytheme/js/jquery.1.10.2.min.js" />"></script>
    <script src="<c:url value="/resources/mytheme/js/main.js" />"></script>
</head>
<body>

      <form:form>
          <div>Company Name :</div>
          <select id="companiesName">
          <c:forEach items="${companies}" var="company">
              <option value="${company.name}">"${company.name}"</option>
          </c:forEach>
          </select>


          <div><input id="number" type="text"></div>
          <div>Operation</div>

          <select id="price">
              <option value="sell">Sell</option>
              <option value="buy">Buy</option>
          </select>

          <input type="submit"/>
      </form:form>

      <!--<div id="msg"></div>-->



      <div class="kit" id="priceCom" ></div>
      <!--<div class="kit" id="sellPriceCisco" style="display:none">${sellCisco}</div>
      <div class="kit" id="sellPriceIntel" style="display:none">${sellIntel}</div>

      <div class="kit" id="buyPriceApple" style="display:none">${buyApple}</div>
      <div class="kit" id="buyPriceCisco" style="display:none">${buyIntel}</div>
      <div class="kit" id="buyPriceIntel" style="display:none">${buyIntel}</div>-->


      <!--<input type="button" id="button">-->

</body>
</html>
