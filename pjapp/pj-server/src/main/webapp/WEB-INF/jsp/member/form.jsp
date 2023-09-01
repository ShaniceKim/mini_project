<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>비트캠프</title>
</head>
<body>

<jsp:include page="../header.jsp"/>

<div style="display: flex; justify-content: center; align-items: center; height: calc(100vh - 100px); margin-bottom: 50px;">
  <div style="border: 4px solid #01BF86; padding: 20px; border-radius: 20px; text-align: center;">
    <h2 style="margin-bottom: 20px;">회원가입</h2>
    <form action='add' method='post' enctype='multipart/form-data'>
      <div style="margin-bottom: 10px;">
        <input type="text" name="name" placeholder="이름을 입력하세요" style="width: 50%; padding: 5px;">
      </div>
      <div style="margin-bottom: 10px;">
        <input type="email" name="email" placeholder="이메일을 입력하세요" style="width: 50%; padding: 5px;">
      </div>
      <div style="margin-bottom: 10px;">
        <input type="password" name="password" placeholder="암호를 입력하세요" style="width: 50%; padding: 5px;">
      </div>
      <div style="margin-bottom: 10px;">
        <select name="gender" style="width: 30%; padding: 3px;">
          <option value="M">남자</option>
          <option value="W">여자</option>
        </select>
      </div>
      <div style="margin-bottom: 10px;">
        <input type="file" name="photo" style="width: 50%; padding: 5px;">
      </div>
      <div style="display: flex; justify-content: center; align-items: center; margin-top: 10px;">
        <button style="font-size: 14px; background-color: #01BF86; border: none; padding: 6px 12px; color: white; cursor: pointer;">등록</button>
      </div>
    </form>
  </div>
</div>

<jsp:include page="../footer.jsp"/>

</body>
</html>
