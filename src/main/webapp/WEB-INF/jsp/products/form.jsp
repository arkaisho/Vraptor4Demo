<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="<c:url value='/products/add'/>">
        Nome:
        <input type="text" name="product.name"/><br/>
        Descrição:
        <input type="text" name="product.description"/><br/>
        Preço:
        <input type="text" name="product.price"/><br/>

        <input type="submit" value="Salvar" />
    </form>
</body>
</html>
