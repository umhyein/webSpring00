<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href="/webApp/aLink?num=100&name=김길동">A태그 링크걸기</a>
<!-- 여기서 controller로 넘어가는 명시?는 web에서 알수 있음 
web.xml에 DispatcherServlet는 /가 들어오면 저절로 컨트롤러와 뷰를 연결해주는 역할  -->
<!--  스프링은 DispatcherServlet처럼 사용자는 모르지만 복잡한 구현을 해놓은것 여러개... -->
<!-- /aLink로 접속한다는 의미 , /aLink를 controller에 추가해줘야함 -->

<P>  
	폼 데이터 전송 <br/>
	<form method="post" action="/webApp/formData">
		이름 : <input type="text" name="name"/><br/>
		번호 : <input type="text" name="num"/><br/>
		연락처 : <input type="text" name="tel"/><br/>
		<input type="submit" name="전송"/>
	</form>

</P>
<img src="/webApp/resources/img/1.jpg"/>
<img src="/webApp/resources/2.jpg"/>
<img src="/webApp/imgList/3.jpg"/>
</body>
</html>
