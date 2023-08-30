<%@ page
    language="java"
    pageEncoding="UTF-8"
    contentType="text/html;charset=UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='UTF-8'>
    <title>비트캠프</title>
    <style>
        /* 추가된 스타일 */
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            text-align: center;
            margin: 20px 0;
        }
        form {
            width: 40%;
            margin: 210px auto;
            padding: 20px;
            border: 4px solid #01BF86;
            border-radius: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        label, input, textarea, button {
            display: block;
            margin-bottom: 15px;
        }
        label {
            font-weight: bold;
        }
        input[type="text"],
        input[type="file"] {
            width: 100%;
            max-width: 300px; /* 최대 너비 설정 */
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        textarea {
            width: 100%;
            max-width: 300px; /* 최대 너비 설정 */
            height: 100px; /* 높이 조정 */
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        button {
            background-color: #01BF86;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 14px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<jsp:include page="../header.jsp"/>

<form action='/board/add.jsp' method='post' enctype='multipart/form-data';>

    <h2>후기 작성</h2>

    <input type='text' name='title' value="제목을 입력하세요">

    <textarea name='content'>내용을 입력하세요</textarea>

    <input type='file' name='files' multiple style="max-width: 150px;">


    <input type='hidden' name='category' value='1'>
    <button>등록</button>
</form>


<jsp:include page="../footer.jsp"/>

</body>
</html>

