<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/user/login">
		<table>
			<tbody>
				<tr>
					<td>
						<label for="ui_id">아이디</label><input type="text" id="ui_id" name="ui_id" />
					</td>
				</tr>	
				<tr>
					<td>
						<label for="ui_pw">패스워드</label><input type="password" id="ui_pw" name="ui_pw" />
					</td>
				</tr>
				<tr>
					<td>
						<label for="ui_name">이름</label><input type="text" id="ui_name" name="ui_name" />
					</td>
				<tr>
					<td>						
						<button type="submit">작성</button>
					</td>
				</tr>			
			</tbody>			
		</table>
	</form>
</body>
</html>