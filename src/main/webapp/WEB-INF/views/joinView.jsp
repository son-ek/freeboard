<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div id="root">
		<header>
			<h1> 회원가입</h1>
		</header>
		<section id="container">
			<form role="form" method="post" action="/emotion/user/join">
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
								<button type="submit">회원가입</button>
							</td>
						</tr>
						<tr>
							<td>
								<input type=button value="뒤로가기" onClick="history.back();">
							</td>
						</tr>		
					</tbody>			
				</table>
			</form>
		</section>
		<hr />
	</div>
</body>
</html>