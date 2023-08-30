<%@ page
    language="java"
    pageEncoding="UTF-8"
    contentType="text/html;charset=UTF-8"
    trimDirectiveWhitespaces="true"
    errorPage="/error.jsp"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.List"%>
<%@ page import="bitcamp.myapp.vo.Board"%>

<%
  request.setAttribute("refresh", "2;url=list.jsp?category=" + request.getParameter("category"));
  int category = Integer.parseInt(request.getParameter("category"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>게시글</title>
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
  /* 수정된 스타일 */
  .write-link {
    font-size: 12px;
    font-weight: normal;
    text-decoration: none;
    color: #01BF86;
  }
</style>
</head>
<body>

<jsp:include page="../header.jsp"/>

<div style="display: flex; justify-content: center; align-items: center; height: calc(100vh - 100px); margin-bottom: 50px;">
  <div style="border: 4px solid #01BF86; padding: 20px; border-radius: 20px;">
    <h2 style="text-align: center;">후기 목록</h2>
    <div style='margin:5px;'>
      <a href='/board/form.jsp?category=${param.category}' class="write-link">후기 작성</a>
    </div>
    <table>
      <thead>
        <tr>
          <th style="font-size: 12px; font-weight: normal;">번호</th>
          <th style="font-size: 12px; font-weight: normal;">제목</th>
          <th style="font-size: 12px; font-weight: normal;">작성자</th>
          <th style="font-size: 12px; font-weight: normal;">조회수</th>
          <th style="font-size: 12px; font-weight: normal;">등록일</th>
        </tr>
      </thead>

      <jsp:useBean id="boardDao" type="bitcamp.myapp.dao.BoardDao" scope="application"/>

      <tbody>
        <%
          List<Board> list = boardDao.findAll(category);
          for (Board board : list) {
            pageContext.setAttribute("board", board);
        %>
          <tr>
            <td>${board.no}</td>
            <td><a href='/board/detail.jsp?category=${board.category}&no=${board.no}'>
                ${board.title.length() > 0 ? board.title : "제목없음"}
              </a>
            </td>
            <td>${board.writer.name}</td>
            <td>${board.viewCount}</td>
            <td>${simpleDateFormatter.format(board.createdDate)}</td>
          </tr>
        <%
          }
        %>
      </tbody>
    </table>
  </div>
</div>

<jsp:include page="../footer.jsp"/>

</body>
</html>
