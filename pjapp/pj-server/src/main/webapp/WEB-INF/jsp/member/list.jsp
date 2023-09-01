<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>회원</title>
<style>
  /* 추가된 스타일 */
  table {
    border-collapse: collapse;
    border-radius: 10px;
    overflow: hidden;
    width: 100%;
    margin: auto;
  }
  th, td {
    padding: 10px 20px;
    text-align: left;
    border-bottom: 1px solid #ddd;
    font-size: 14px; /* 글씨 크기 조정 */
    font-weight: normal; /* 글씨 굵기 조정 */
  }
  th {
    background-color: #f2f2f2;
  }
  tr:hover {
    background-color: #f5f5f5;
  }
</style>
</head>
<body>

<jsp:include page="../header.jsp"/>

<div style="display: flex; justify-content: center; align-items: center; height: calc(100vh - 100px); margin-bottom: 50px;">
  <div style="border: 4px solid #01BF86; padding: 20px; border-radius: 20px;">
    <h2 style="text-align: center;">회원 목록</h2>
    <table>
<thead>
        <!-- 글씨 크기와 굵기를 조정한 부분 -->
        <tr><th style="font-size: 12px; font-weight: normal;">번호</th> <th style="font-size: 12px; font-weight: normal;">이름</th> <th style="font-size: 12px; font-weight: normal;">이메일</th></tr>
</thead>
<tbody>
<c:forEach items="${list}" var="member">
          <tr>
              <td>${member.no}</td>
              <td>
                  <img src='http://mvsenqskbqzl19010704.cdn.ntruss.com/member/${member.photo}?type=f&w=30&h=40&faceopt=true&ttype=jpg'>
                  <a href='detail?no=${member.no}'>${member.name}</a></td>
              <td>${member.email}</td>
          </tr>
          </c:forEach>
          </tbody>
    </table>
  </div>
</div>

<jsp:include page="../footer.jsp"/>
</body>
</html>
