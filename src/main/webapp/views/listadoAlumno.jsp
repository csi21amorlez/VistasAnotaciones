<%@include file="../configuraciones/cabecera.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado alumnos</title>
</head>
<body>

	<c:forEach items="${model.listAlumnos}" var="alumno">
		<c:out value="${alumno.nombre }"></c:out>
		<c:out value="${alumno.apellidos }"></c:out>
		<c:out value="${alumno.direccion }"></c:out>
		<c:out value="${alumno.curso }"></c:out>
	</c:forEach>

	<h1>test</h1>

</body>
</html>