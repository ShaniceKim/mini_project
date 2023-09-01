<%@ page
    language="java"
    pageEncoding="UTF-8"
    contentType="text/html;charset=UTF-8"%>
<div style='height:50px;background-color:#01BF86;display:flex;align-items:center;justify-content:center;'>
    <a href='http://localhost:8888'> <!-- 네이버 로고 클릭 시 localhost:8888로 이동 -->
        <img src='https://www.ncloud.com/public/img/logo-m.png' style='height:40px'>
    </a>

<%--
    <jsp:useBean id="loginUser" class="bitcamp.myapp.vo.Member" scope="session"/>
    <% if (loginUser.getNo() == 0) { %>
         <a href='/auth/form.jsp'>로그인</a>
    <% } else {
         if (loginUser.getPhoto() == null) { %>
           <img style='height:40px' src='/images/avatar.png'>
      <% } else { %>
           <img src='http://mvsenqskbqzl19010704.cdn.ntruss.com/member/${loginUser.photo}?type=f&w=30&h=40&faceopt=true&ttype=jpg'>
      <% } %>
           ${loginUser.name} <a href='/auth/logout.jsp'>로그아웃</a>
    <% } %>
--%>

</div>
