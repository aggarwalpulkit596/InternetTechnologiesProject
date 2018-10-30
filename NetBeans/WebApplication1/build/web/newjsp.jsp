
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Using forEach</title>
</head>
<body>
<fmt:parseNumbervar="n" type="number" value="${param.num}"/>
<c:forEachvar="i" begin="1" end="${n}">
<c:forEachvar="i" begin="1" end="${i}">
<c:out value="${i} "/>
</c:forEach>
<br>
</c:forEach>
</body>
</html>