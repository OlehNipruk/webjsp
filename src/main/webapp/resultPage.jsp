<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Result Page</title>
</head>
<body>
<h1>Results:</h1>

<p>Max value: x = ${maxX}, y = ${maxY}</p>
<p>Min value: x = ${minX}, y = ${minY}</p>
<p>Sum of y values: ${sum}</p>
<p>Average of y values: ${average}</p>

<h2>X and Y values:</h2>
<table border="1">
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    <c:forEach var="i" begin="0" end="${fn:length(xValues) - 1}">
        <tr>
            <td>${xValues[i]}</td>
            <td>${yValues[i]}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
