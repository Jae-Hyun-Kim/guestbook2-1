<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
<link rel="stylesheet" type="text/css" href="/guestbook2/assets/css/gb.css">
</head>
<body>
	<form action="/guestbook2/gb" method="post">
		<input type="hidden" name="a" value="insert">
		<table>
			<tr>
				<td>이름</td><td><input type="text" name="name"></td>
				<td>비밀번호</td><td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
			</tr>
			<tr>
				<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
			</tr>
		</table>
	</form>
	
		<table>
			<tr>
				<td>[3]</td>
				<td>안대혁</td>
				<td>2015-10-25</td>
				<td>
				<a href="">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan=4>
				하이!
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td>[3]</td>
				<td>안대혁</td>
				<td>2015-10-25</td>
				<td>
				<a href="">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan=4>
				하이!
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td>[3]</td>
				<td>안대혁</td>
				<td>2015-10-25</td>
				<td>
				<a href="">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan=4>
				하이!
				</td>
			</tr>
		</table>		
</body>
</html>