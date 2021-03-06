<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="<c:url value="/resources/css/recipes.css" />" rel="stylesheet">
<html>
<head>
    <title>Items</title>
</head>
<body>
<table class="recipe_table">
    <form:form method="post">
        <tr>
            <td>
                <div>Name</div>
            </td>
            <td>
                <div>Buy Price</div>
            </td>
            <td>
                <div>Craft Price</div>
            </td>
        </tr>
        <c:forEach items="${items}" var="item">
            <tr>
                <td>
                    <div>${item.name}</div>
                </td>
                <td>
                    <div>${item.buyPrice}</div>
                </td>
                <td>
                    <div>${item.craftPrice}</div>
                </td>
            </tr>
        </c:forEach>
    </form:form>
</table>

<body>
<div>
    <a href="/recipes">Recipes</a>
</div>
<div>
    <a href="/reagents">Reagents</a>
</div>
<div>
    <a href="/lots">Lots</a>
</div>
</body>
</html>
