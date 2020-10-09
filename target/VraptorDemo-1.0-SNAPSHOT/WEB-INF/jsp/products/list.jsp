<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <ul>
        <c:forEach items="${productList}" var="product">
            <li>${product.name} - ${product.description}</li>
        </c:forEach>
    </ul>
</body>
</html>
