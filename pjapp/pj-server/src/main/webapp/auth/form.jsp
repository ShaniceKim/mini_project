<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>비트캠프</title>
</head>
<body style="margin: 0; padding: 0;">

<jsp:include page="../header.jsp"/>

<div style="display: flex; justify-content: center; align-items: center; height: calc(100vh - 100px); margin-bottom: 50px;">
  <div style="border: 4px solid #01BF86; padding: 20px; border-radius: 20px;">
    <h1 style="text-align: center;">LogIn</h1>

    <form action='/auth/login.jsp' method='post'>
      <table style="border: none;">
        <tr>
          <td><input type="text" name="email" placeholder="이메일" style="margin-bottom: 10px;"></td>
        </tr>
        <tr>
          <td><input type='password' name='password' placeholder="암호" style="margin-bottom: 10px;"></td>
        </tr>
      </table>
      <div style="display: flex; justify-content: center; align-items: center; margin-top: 10px;">
        <button style="font-size: 14px; background-color: #01BF86; border: none; padding: 6px 12px; color: white; cursor: pointer;">로그인</button>
      </div>
    </form>
  </div>
</div>

<jsp:include page="../footer.jsp"/>

</body>
</html>
