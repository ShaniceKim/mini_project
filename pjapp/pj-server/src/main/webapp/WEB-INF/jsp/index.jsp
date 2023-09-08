<%@ page
    language="java"
    pageEncoding="UTF-8"
    contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href=" ">
<title>BitSalon</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/custom.css" rel="stylesheet">

<!-- Page Loader -->
<link href="/css/loaders.css" rel="stylesheet">

<!-- Font Awesome Style -->
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body style=" background-image: url('/images/salon.png'); background-size: cover;">
<div class="loader loader-bg">
  <div class="loader-inner line-scale">
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </div>
</div>

<!-- Top Navigation
    ================================================== -->
<nav class="navbar top-bar navbar-static-top sps sps--abv">
  <div class="container relative-box "> <a class="navbar-brand" href="#">BitSalon</a>
    <button class="navbar-toggler hidden-lg-up collapsed" type="button" data-toggle="collapse" data-target="#exCollapsingNavbar2" aria-controls="exCollapsingNavbar2" aria-expanded="false" aria-label="Toggle navigation"> ☰ </button>
    <div class="navbar-toggleable-md collapse" id="exCollapsingNavbar2" >
      <ul class="nav navbar-nav pull-xs-right">
        <li class="nav-item"> <a class="nav-link" href='/admin/member/form'>회원가입</a></li>

        <jsp:useBean id="loginUser" class="bitcamp.myapp.vo.Member" scope="session"/>
        <% if (loginUser.getNo() == 0) { %>
             <li class="nav-item"> <a class="nav-link" href='/app/auth/form'>로그인</a></li>
        <% } else {
             if (loginUser.getPhoto() == null) { %>
               <img style='height:40px' src='/images/avatar.png'>
          <% } else { %>
               <img src='http://mvsenqskbqzl19010704.cdn.ntruss.com/member/${loginUser.photo}?type=f&w=30&h=40&faceopt=true&ttype=jpg'>
          <% } %>
               ${loginUser.name} <a href='/app/auth/logout'>로그아웃</a>
        <% } %>

        <li class="nav-item"> <a class="nav-link" href='/admin/member/list'>회원</a></li>
        <li class="nav-item"> <a class="nav-link" href='/app/board/list?category=1'>후기</a></li>
        <li class="nav-item"> <a class="nav-link" href='/app/reserve/add'>예약</a></li>
        <li class="nav-item"> <a class="nav-link" href='/board/list?category=2'>Contact Us</a> </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Carousel
    ================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->

  <div class="carousel-inner" role="listbox">
    <div class="carousel-item active">
      <div class="container d-flex h-100 align-items-center"> <!-- Added container and flex classes -->
        <div class="carousel-caption bg-dark"> <!-- Modified this line -->
          <h1>There Are No Secrets to Success</h1>
          <p>The man who will use his skill and constructive imagination to see how much he can give for a dollar, instead of how little he can give for a dollar, is bound to succeed.</p>
          <a class="btn btn-aqua btn-capsul" href="#" role="button">Sign up today</a> </div>
      </div>
    </div>
    <div class="carousel-item">
      <div class="container">
        <div class="carousel-caption bg-dark"> <!-- Modified this line -->
          <h1>Another example headline.</h1>
          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
          <a class="btn btn-capsul btn-aqua" href="#" role="button">Learn more</a> </div>
      </div>
    </div>
    <div class="carousel-item">
      <div class="container">
        <div class="carousel-caption bg-dark"> <!-- Modified this line -->
          <h1>One more for good measure.</h1>
          <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
          <a class="btn btn-capsul btn-aqua" href="#" role="button">Browse gallery</a> </div>
      </div>
    </div>
  </div>
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev"> <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span class="sr-only">Previous</span> </a> <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next"> <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span class="sr-only">Next</span> </a> </div>
<!-- /.carousel -->





<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->


<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js" integrity="sha384-THPy051/pYDQGanwU6poAc/hOdQxjnOEXzbT+OuUAFqNqFjL+4IGLBgCJC3ZOShY" crossorigin="anonymous"></script> 
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js" integrity="sha384-Plbmg8JY28KFelvJVai01l8WyZzrYWG825m+cZ0eDDS1f7d/js6ikvy1+X+guPIB" crossorigin="anonymous"></script> 
<script src="/js/bootstrap.min.js"></script>
<script src="/js/scrollPosStyler.js"></script>
<script src="/js/core.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug --> 
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
<jsp:include page="footer.jsp"/>
</body>
</html>
