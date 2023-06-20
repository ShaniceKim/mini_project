<!DOCTYPE html>
<html lang="ko">

<head>


<style type="text/css">* {cursor: url(https://cur.cursors-4u.net/nature/nat-10/nat983.cur), auto !important;}</style><a href="https://www.cursors-4u.com/cursor/2011/12/29/cute-bunny-holding-heart.html" target="_blank" title="Cute Bunny Holding Heart"><img src="https://cur.cursors-4u.net/cursor.png" border="0" alt="Cute Bunny Holding Heart" style="position:absolute; top: 0px; right: 0px;" /></a>
  <title>[##_page_title_##]</title>
  <meta name="title" content="[##_page_title_##] :: [##_title_##]" />
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1, minimum-scale=1.0, maximum-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
  <link rel="alternate" type="application/rss+xml" title="[##_title_##]" href="[##_rss_url_##]" />
  <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700&amp;subset=korean">
  <link rel="stylesheet" href="./style.css" />
  <script src="//t1.daumcdn.net/tistory_admin/lib/jquery/jquery-1.12.4.min.js"></script>
  <script src="//t1.daumcdn.net/tistory_admin/assets/skin/common/vh-check.min.js"></script>
  <script src="./images/common.js" defer></script>
  <script> (function () { var test = vhCheck();}()); </script>
  <script type="text/javascript" src="https://tistory3.daumcdn.net/tistory/3165311/skin/images/ThreeCanvas.js"></script>
  <script type="text/javascript" src="http://bpmaker.giffy.me/userdata/user/49/49060/2/parts.js"></script>
  <script type="text/javascript">
// <![CDATA[
var colour="random"; // in addition to "random" can be set to any valid colour eg "#f0f" or "red"
var sparkles=50;

/****************************
*  Tinkerbell Magic Sparkle *
*(c)2005-13 mf2fm web-design*
*  http://www.mf2fm.com/rv  *
* DON'T EDIT BELOW THIS BOX *
****************************/
var x=ox=400;
var y=oy=300;
var swide=800;
var shigh=600;
var sleft=sdown=0;
var tiny=new Array();
var star=new Array();
var starv=new Array();
var starx=new Array();
var stary=new Array();
var tinyx=new Array();
var tinyy=new Array();
var tinyv=new Array();

window.onload=function() { if (document.getElementById) {
  var i, rats, rlef, rdow;
  for (var i=0; i<sparkles; i++) {
    var rats=createDiv(3, 3);
    rats.style.visibility="hidden";
    rats.style.zIndex="999";
    document.body.appendChild(tiny[i]=rats);
    starv[i]=0;
    tinyv[i]=0;
    var rats=createDiv(5, 5);
    rats.style.backgroundColor="transparent";
    rats.style.visibility="hidden";
    rats.style.zIndex="999";
    var rlef=createDiv(1, 5);
    var rdow=createDiv(5, 1);
    rats.appendChild(rlef);
    rats.appendChild(rdow);
    rlef.style.top="2px";
    rlef.style.left="0px";
    rdow.style.top="0px";
    rdow.style.left="2px";
    document.body.appendChild(star[i]=rats);
  }
  set_width();
  sparkle();
}}

function sparkle() {
  var c;
  if (Math.abs(x-ox)>1 || Math.abs(y-oy)>1) {
    ox=x;
    oy=y;
    for (c=0; c<sparkles; c++) if (!starv[c]) {
      star[c].style.left=(starx[c]=x)+"px";
      star[c].style.top=(stary[c]=y+1)+"px";
      star[c].style.clip="rect(0px, 5px, 5px, 0px)";
      star[c].childNodes[0].style.backgroundColor=star[c].childNodes[1].style.backgroundColor=(colour=="random")?newColour():colour;
      star[c].style.visibility="visible";
      starv[c]=50;
      break;
    }
  }
  for (c=0; c<sparkles; c++) {
    if (starv[c]) update_star(c);
    if (tinyv[c]) update_tiny(c);
  }
  setTimeout("sparkle()", 40);
}

function update_star(i) {
  if (--starv[i]==25) star[i].style.clip="rect(1px, 4px, 4px, 1px)";
  if (starv[i]) {
    stary[i]+=1+Math.random()*3;
    starx[i]+=(i%5-2)/5;
    if (stary[i]<shigh+sdown) {
      star[i].style.top=stary[i]+"px";
      star[i].style.left=starx[i]+"px";
    }
    else {
      star[i].style.visibility="hidden";
      starv[i]=0;
      return;
    }
  }
  else {
    tinyv[i]=50;
    tiny[i].style.top=(tinyy[i]=stary[i])+"px";
    tiny[i].style.left=(tinyx[i]=starx[i])+"px";
    tiny[i].style.width="2px";
    tiny[i].style.height="2px";
    tiny[i].style.backgroundColor=star[i].childNodes[0].style.backgroundColor;
    star[i].style.visibility="hidden";
    tiny[i].style.visibility="visible"
  }
}

function update_tiny(i) {
  if (--tinyv[i]==25) {
    tiny[i].style.width="1px";
    tiny[i].style.height="1px";
  }
  if (tinyv[i]) {
    tinyy[i]+=1+Math.random()*3;
    tinyx[i]+=(i%5-2)/5;
    if (tinyy[i]<shigh+sdown) {
      tiny[i].style.top=tinyy[i]+"px";
      tiny[i].style.left=tinyx[i]+"px";
    }
    else {
      tiny[i].style.visibility="hidden";
      tinyv[i]=0;
      return;
    }
  }
  else tiny[i].style.visibility="hidden";
}

document.onmousemove=mouse;
function mouse(e) {
  if (e) {
    y=e.pageY;
    x=e.pageX;
  }
  else {
    set_scroll();
    y=event.y+sdown;
    x=event.x+sleft;
  }
}

window.onscroll=set_scroll;
function set_scroll() {
  if (typeof(self.pageYOffset)=='number') {
    sdown=self.pageYOffset;
    sleft=self.pageXOffset;
  }
  else if (document.body && (document.body.scrollTop || document.body.scrollLeft)) {
    sdown=document.body.scrollTop;
    sleft=document.body.scrollLeft;
  }
  else if (document.documentElement && (document.documentElement.scrollTop || document.documentElement.scrollLeft)) {
    sleft=document.documentElement.scrollLeft;
    sdown=document.documentElement.scrollTop;
  }
  else {
    sdown=0;
    sleft=0;
  }
}

window.onresize=set_width;
function set_width() {
  var sw_min=999999;
  var sh_min=999999;
  if (document.documentElement && document.documentElement.clientWidth) {
    if (document.documentElement.clientWidth>0) sw_min=document.documentElement.clientWidth;
    if (document.documentElement.clientHeight>0) sh_min=document.documentElement.clientHeight;
  }
  if (typeof(self.innerWidth)=='number' && self.innerWidth) {
    if (self.innerWidth>0 && self.innerWidth<sw_min) sw_min=self.innerWidth;
    if (self.innerHeight>0 && self.innerHeight<sh_min) sh_min=self.innerHeight;
  }
  if (document.body.clientWidth) {
    if (document.body.clientWidth>0 && document.body.clientWidth<sw_min) sw_min=document.body.clientWidth;
    if (document.body.clientHeight>0 && document.body.clientHeight<sh_min) sh_min=document.body.clientHeight;
  }
  if (sw_min==999999 || sh_min==999999) {
    sw_min=800;
    sh_min=600;
  }
  swide=sw_min;
  shigh=sh_min;
}

function createDiv(height, width) {
  var div=document.createElement("div");
  div.style.position="absolute";
  div.style.height=height+"px";
  div.style.width=width+"px";
  div.style.overflow="hidden";
  return (div);
}

function newColour() {
  var c=new Array();
  c[0]=255;
  c[1]=Math.floor(Math.random()*256);
  c[2]=Math.floor(Math.random()*(256-c[1]/2));
  c.sort(function(){return (0.5 - Math.random());});
  return ("rgb("+c[0]+", "+c[1]+", "+c[2]+")");
}
// ]]>
</script>
</head>


<body id="[##_body_id_##]" class="[##_var_headerslogundisplay_##] [##_var_headerbannerdisplay_##] [##_var_listmore_##] [##_var_listmoremobile_##] <s_if_var_headerbannerimage>use-banner-wrp</s_if_var_headerbannerimage> <s_if_var_headersloguntitle>use-slogan-wrp</s_if_var_headersloguntitle> use-menu-[##_var_topnav_##]-wrp">
	</div>
</div>
  <s_t3>
    <!-- 사이드바 서랍형일때 wrap-right / wrap-drawer -->
    <div id="wrap" class="wrap-[##_var_sidebartype_##]">

      <!-- header -->
      <header class="header">
				<div class="line-bottom display-none"></div>
        <!-- inner-header -->
        <div class="inner-header <s_if_var_headersloguntitle>slogun-use</s_if_var_headersloguntitle> [##_var_topnav_##]">

          <div class="box-header">
            <h1 class="title-logo">
              <a href="[##_blog_link_##]" title="[##_title_##]" class="link_logo">
                <s_if_var_logoImage>
                  <img src="[##_var_logoImage_##]" class="img_logo" alt="[##_title_##]">
                </s_if_var_logoImage>
                <s_not_var_logoImage>
                  [##_title_##]
                </s_not_var_logoImage>
              </a>
            </h1>

            <!-- search-bar for PC -->
						<div class="util use-top">
							<div class="search">
							<input class="searchInput" type="text" name="search" value="" placeholder="Search..." onkeypress="if (event.keyCode == 13) { requestSearch('.util.use-top .searchInput') }"/>
							</div>
						</div>


          </div>
          <!--unable to drag-->
<body oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
<!--unable to drag-->
          <!-- area-align -->
          <div class="area-align">

            <s_if_var_headersloguntitle>
              <!-- area-slogan -->
              <div class="area-slogun [##_var_topnav_##] <s_if_var_headerslogunmobile>slogunmobileoff</s_if_var_headerslogunmobile>">
                <strong>[##_var_headersloguntitle_##]</strong>
                <s_if_var_headersloguntext>
                  <p>[##_var_headersloguntext_##]</p>
                </s_if_var_headersloguntext>
              </div>
              <!-- // area-slogan -->
            </s_if_var_headersloguntitle>

            <!-- area-gnb -->
            <div class="area-gnb">
              <nav class="[##_var_topnav_##]">
                [##_blog_menu_##]
              </nav>
            </div>

            <button type="button" class="button-menu">
              <svg xmlns="//www.w3.org/2000/svg" width="20" height="14" viewBox="0 0 20 14">
                <path fill="#333" fill-rule="evenodd" d="M0 0h20v2H0V0zm0 6h20v2H0V6zm0 6h20v2H0v-2z" />
              </svg>
            </button>

            <s_if_var_headerbannerimage>
              <!-- area-banner -->
              <div class="area-promotion height400 <s_if_var_bannermobile>bannermobile-on</s_if_var_bannermobile>" style="background-image:url('[##_var_headerbannerimage_##]');">
                <div class="inner-promotion">
                  <div class="box-promotion">
                    <s_if_var_headerbannertitle>
                      <strong style="color: [##_var_headerbannertitlecolor_##]">[##_var_headerbannertitle_##]</strong>
                    </s_if_var_headerbannertitle>

                    <s_if_var_headerbannerlink>
                      <style>
                        .link-promotion {background:[##_var_headerbannerlinkcolor_##];}
                        .link-promotion:hover {background:[##_var_headerbannerlinkovercolor_##];}
                      </style>
                      <a href="//[##_var_headerbannerlink_##]" class="link-promotion">자세히보기</a>
                    </s_if_var_headerbannerlink>
                    <style type="text/css">
  </style>

                  </div>
                </div>
              </div>
              <!-- // area-banner -->
            </s_if_var_headerbannerimage>

          </div>
          <!-- // area-align -->

        </div>
        <!-- // inner-header -->

      </header>
      <!-- // header -->

      [##_revenue_list_upper_##]

      <!-- container -->
      <div id="container">

        <main class="main">

          <!-- area-main -->
          <div class="area-main">

            <!-- s_list / 카테고리, 검색 리스트 -->
            <div class="area-common" >
							<s_list>
								<div class="category-banner-wrp display-none">
									<div class="category-banner" <s_list_image>style="background-image:url('[##_list_image_##]')"</s_list_image>>
										<div class="category-banner-inner">
											<div class="category-description-box">
												<strong class="category-description">[##_list_description_##]</strong>
											</div>
										</div>
									</div>
							</div>

                <h2 class="title-search article-title-[##_list_style_##]" list-style="[##_list_style_##]"><b class="archives">[##_list_conform_##]</b> <span>[##_list_count_##]</span></h2>
									<s_list_rep>

										<article class="article-type-common article-type-[##_list_style_##]">

											<a href="[##_list_rep_link_##]" class="link-article">
                        <p class="thumbnail" <s_list_rep_thumbnail> has-thumbnail="1" style="background-image:url('[##_list_rep_thumbnail_raw_url_##]')" </s_list_rep_thumbnail>>
                          <img src="[##_list_rep_thumbnail_raw_url_##]" class="img-thumbnail" role="presentation">
                        </p>
                      </a>

									<div class="article-content">
										<a href="[##_list_rep_link_##]" class="link-article">
											<strong class="title">[##_list_rep_title_##]</strong>
											<p class="summary">[##_list_rep_summary_##]</p>
										</a>
										<div class="box-meta">
											<a href="[##_list_rep_category_link_##]" class="link-category">[##_list_rep_category_##]</a>
											<span class="date">[##_list_rep_regdate_##]</span>
											<span class="reply">
												<s_rp_count>[##_list_rep_rp_cnt_##]</s_rp_count>
											</span>
										</div>
									</div>
									</article>
								</s_list_rep>

                <s_list_empty>
                  <div class="box-no-search type-search">
                    <span>입력하신 단어의 철자가 정확한지 확인해 보세요.</span>
                    <span>검색어의 단어 수를 줄이거나, 보다 일반적인 단어로 검색해 보세요.</span>
                    <span>두 단어 이상의 키워드로 검색 하신 경우, 정확하게 띄어쓰기를 한 후 검색해 보세요.</span>
                  </div>

                  <div class="box-no-search type-tag">
                    <span>선택하신 태그에 해당하는 글이 없습니다.</span>
                    <span>다른 태그를 선택하시거나, 검색 기능을 활용해 보세요.</span>
                  </div>

                  <div class="box-no-search type-category">
                    <span>선택하신 카테고리에 해당하는 글이 없습니다.</span>
                    <span>다른 카테고리를 선택하시거나, 검색 기능을 활용해 보세요.</span>
                  </div>

                  <div class="box-no-search type-archive">
                    <span>선택하신 기간에 등록된 글이 없습니다.</span>
                  </div>

                </s_list_empty>
              </s_list>
            </div>
            <!-- // s_list / 카테고리, 검색 리스트 -->

            <!-- area-view / 뷰페이지 및 기본 영역 -->
            <div class="area-view">
              <!-- s_article_rep -->
              <s_article_rep>

                <!-- s_permalink_article_rep / 뷰페이지 -->
                <s_permalink_article_rep>
                  <!-- 이미지가 없는 경우 article-header-noimg -->
                  <div class="article-header" thumbnail="<s_article_rep_thumbnail>https://img1.daumcdn.net/thumb/R1440x0/?scode=mtistory2&fname=[##_article_rep_thumbnail_raw_url_##]</s_article_rep_thumbnail>" style="background-image:url('')">
                    <div class="inner-header">
                      <div class="box-meta">
                        <p class="category">[##_article_rep_category_##]</p>
                        <h2 class="title-article">[##_article_rep_title_##]</h2>
                        <div class="box-info">
                          <span class="writer">[##_article_rep_author_##]</span>
                          <span class="date">[##_article_rep_date_##]</span>
                        </div>
                      </div>
                    </div>
                  </div>

                  <!-- 에디터 영역 -->
                  <div class="article-view">
                    [##_article_rep_desc_##]
                  </div>

                  <!-- article-footer -->
                  <div class="article-footer">

                    <s_tag_label>
                      <!-- article-tag -->
                      <div class="article-tag">
                        <h3 class="title-footer">Tag</h3>
                        <div class="box-tag">[##_tag_label_rep_##]</div>
                      </div>
                      <!-- // area_tag -->
                    </s_tag_label>

                    <div class="article-page">
                      <h3 class="title-footer">'[##_article_rep_category_##]'의 다른글</h3>
                      <ul>
                        <li>
                          <s_article_prev>
                            <a href="[##_article_prev_link_##]"><span>이전글</span><strong>[##_article_prev_title_##]</strong></a>
                          </s_article_prev>
                        </li>
                        <li><span>현재글</span><strong>[##_article_rep_title_##]</strong></li>
                        <li>
                          <s_article_next>
                            <a href="[##_article_next_link_##]"><span>다음글</span><strong>[##_article_next_title_##]</strong></a>
                          </s_article_next>
                        </li>
                      </ul>
                    </div>

                    <s_article_related>
                      <!-- article-related -->
                      <div class="article-related">
                        <h3 class="title-footer">관련글</h3>
                        <ul class="list-related">
                          <s_article_related_rep>
                            <li class="item-related">
                              <a href="[##_article_related_rep_link_##]" class="link-related">
                                <span class="thumnail" style="background-image:url('<s_article_related_rep_thumbnail>[##_article_related_rep_thumbnail_link_##]</s_article_related_rep_thumbnail>')"></span>
                                <div class="box_content">
                                  <strong>[##_article_related_rep_title_##]</strong>
                                  <span class="date">[##_article_related_rep_date_##]</span>
                                </div>
                              </a>
                            </li>
                          </s_article_related_rep>
                        </ul>
                      </div>
                      <!-- // article-related -->
                    </s_article_related>

                    <!-- article-reply -->
                    <div class="article-reply">

                      <div class="box-total">
                        <a href="#rp" onclick="[##_article_rep_rp_link_##]">댓글 <span><s_rp_count>[##_article_rep_rp_cnt_##]</s_rp_count></span></a>
                      </div>

                      <s_rp>
                        <!-- area-reply -->
                        <div class="area-reply">
                          <s_rp_container>
                            <ul class="list-reply">
                              <s_rp_rep>
                                <li id='[##_rp_rep_id_##]' class="item-reply [##_rp_rep_class_##]">
                                  <span class="thumbnail" style="background-image:url('[##_rp_rep_logo_##]')"></span>
                                  <div class="box-content">
                                    <div class="box-meta">
                                      <strong>[##_rp_rep_name_##]</strong>
                                      <span class="date">[##_rp_rep_date_##]</span>
                                    </div>
                                    <p class="text">[##_rp_rep_desc_##]</p>
                                    <a href="#" class="link-comment" onclick="[##_rp_rep_onclick_reply_##]">답글</a>
                                    <div class="box-modify">
                                      <button type="button" class="button-modify"><span class="blind">더보기</span></button>
                                      <ul class="list-modify">
                                        <li><a href="[##_rp_rep_link_##]">댓글주소</a></li>
                                        <li><a href="#" onclick="[##_rp_rep_onclick_delete_##]">수정/삭제</a></li>
                                      </ul>
                                    </div>
                                  </div>

                                  <s_rp2_container>
                                    <!-- list-reply-comment -->
                                    <ul class="list-reply-comment">
                                      <s_rp2_rep>
                                        <li id='[##_rp_rep_id_##]' class="item-reply [##_rp_rep_class_##]">
                                          <span class="thumbnail" style="background-image:url('[##_rp_rep_logo_##]')"></span>
                                          <div class="box-content">
                                            <div class="box-meta">
                                              <strong>[##_rp_rep_name_##]</strong>
                                              <span class="date">[##_rp_rep_date_##]</span>
                                            </div>
                                            <p class="text">[##_rp_rep_desc_##]</p>
                                            <div class="box-modify">
                                              <button type="button" class="button-modify"><span class="blind">더보기</span></button>
                                              <ul class="list-modify">
                                                <li><a href="[##_rp_rep_link_##]" class="link-address">댓글주소</a></li>
                                                <li><a href="#" onclick="[##_rp_rep_onclick_delete_##]">수정/삭제</a></li>
                                              </ul>
                                            </div>
                                          </div>
                                        </li>
                                      </s_rp2_rep>
                                    </ul>
                                    <!-- // list-reply-comment -->
                                  </s_rp2_container>
                                </li>
                              </s_rp_rep>
                            </ul>
                          </s_rp_container>
                        </div>
                        <!-- // area-reply -->

                        <s_rp_input_form>
                          <!-- reply_write -->
                          <form method="post">
                            <div class="area-write">
                              <s_rp_member>
                                <s_rp_guest>
                                  <div class="box-account">
                                    <input type="text" name="[##_rp_input_name_##]" value="[##_guest_name_##]"
                                      title="이름" placeholder="이름" />
                                    <input type="password" name="[##_rp_input_password_##]" value="[##_rp_admin_check_##]"
                                      title="비밀번호" maxlength="12" placeholder="비밀번호" />
                                  </div>
                                </s_rp_guest>
                              </s_rp_member>
                              <div class="box-textarea">
                                <label for="[##_rp_input_comment_##]" class="screen_out">댓글</label>
                                <textarea id="[##_rp_input_comment_##]" name="[##_rp_input_comment_##]" placeholder="내용을 입력해주세요."></textarea>
                              </div>

                              <div class="box-write">
                                <label class="xe-label">
                                  <input type="checkbox" name="[##_rp_input_is_secret_##]" id="secret">
                                  <span class="xe-input-helper"></span>
                                  <span class="xe-label-text">비밀글</span>
                                </label>
                                <button type="button" class="btn_register" onclick="[##_rp_onclick_submit_##]">등록</button>
                              </div>

                            </div>
                          </form>
                          <!-- // reply_write -->
                        </s_rp_input_form>
                      </s_rp>

                    </div>
                    <!-- // article-reply -->

                  </div>
                  <!-- // article-footer -->

                </s_permalink_article_rep>
              </s_article_rep>
              <!-- // s_article_rep -->

              <!-- s_article_protected / 개별 보호글 페이지 -->
              <s_article_protected>

                <s_permalink_article_rep>
                  <!-- 이미지가 없는 경우 article-header-noimg -->
                  <div class="article-header article-header-protected">
                    <div class="inner-header">
                      <div class="info_text">
                        <strong class="title_post">[##_article_rep_title_##]</strong>
                        <p class="info"><span class="date">[##_article_rep_date_##]</span>ㆍ<span>[##_article_rep_category_##]</span></p>
                      </div>
                    </div>
                  </div>

                  <div class="article-view">
                    <div class="area-protected">
                      <p class="text-protected">보호되어 있는 글입니다. <br /> <span>내용을 보시려면 비밀번호를 입력하세요.</span></p>
                      <form class="protected_form" onsubmit="[##_article_dissolve_##]">
                        <div class="box-protected">
                          <input type="password" id="[##_article_password_##]" name="[##_article_password_##]" value=""
                          placeholder="비밀번호" />
                          <button type="submit">확인</button>
                        </div>
                      </form>
                    </div>
                  </div>
                </s_permalink_article_rep>
              </s_article_protected>
              <!-- // s_article_protected -->

              <!-- s_page_rep -->
              <s_page_rep>
								<!-- s_permalink_article_rep / 뷰페이지 -->
								<s_permalink_article_rep>
									<!-- 이미지가 없는 경우 article-header-noimg -->
									<div class="article-header" thumbnail="<s_article_rep_thumbnail>[##_article_rep_thumbnail_url_##]</s_article_rep_thumbnail>" style="background-image:url('')">
										<div class="inner-header">
											<div class="box-meta">
												<p class="category">공지사항</p>
												<h2 class="title-article">[##_article_rep_title_##]</h2>
												<div class="box-info">
													<span class="writer">[##_article_rep_author_##]</span>
													<span class="date">[##_article_rep_date_##]</span>
												</div>
											</div>
										</div>
									</div>

									<!-- 에디터 영역 -->
									<div class="article-view">
										[##_article_rep_desc_##]
									</div>
								</s_permalink_article_rep>

              </s_page_rep>
              <!-- // s_page_rep -->

              <!-- s_notice_rep / 개별 공지사항 페이지 -->
							<s_notice_rep>
								<h2 class="notice-title title-search article-title-[##_list_style_##] display-none" list-style="[##_list_style_##]"><b class="archives">공지사항</b></h2>
								<s_index_article_rep>
									<article class="article-type-common article-type-[##_list_style_##]">
											<a href="[##_notice_rep_link_##]" class="link-article">
                        <p class="thumbnail notice-thumbnail" <s_notice_rep_thumbnail> has-thumbnail="1" style="background-image:url('[##_notice_rep_thumbnail_url_##]')" </s_notice_rep_thumbnail>>
                          <img src="" class="img-thumbnail" role="presentation">
                        </p>
                      </a>
										<div class="article-content">
											<a href="[##_notice_rep_link_##]" class="link-article">
												<strong class="title">[##_notice_rep_title_##]</strong>
												<p class="summary">[##_notice_rep_summary_##]</p>
											</a>
											<div class="box-meta">
												<a href="[##_notice_rep_category_link_##]" class="link-category">공지사항</a>
												<span class="date">[##_notice_rep_simple_date_##]</span>
											</div>
										</div>
									</article>
								</s_index_article_rep>

								<!-- s_permalink_article_rep / 뷰페이지 -->
								<s_permalink_article_rep>
									<!-- 이미지가 없는 경우 article-header-noimg -->
									<div class="article-header" thumbnail="<s_notice_rep_thumbnail>[##_notice_rep_thumbnail_url_##]</s_notice_rep_thumbnail>" style="background-image:url('')">
										<div class="inner-header">
											<div class="box-meta">
												<p class="category">공지사항</p>
												<h2 class="title-article">[##_notice_rep_title_##]</h2>
												<div class="box-info">
													<span class="writer">[##_notice_rep_author_##]</span>
													<span class="date">[##_notice_rep_date_##]</span>
												</div>
											</div>
										</div>
									</div>

									<!-- 에디터 영역 -->
									<div class="article-view">
										[##_notice_rep_desc_##]
									</div>
								</s_permalink_article_rep>

							</s_notice_rep>

              <!-- // s_notice_rep -->

              <!-- s_tag / 개별 태그 페이지-->
              <s_tag>
                <!-- area_view -->
                <div class="area-tag">

                  <h3 class="title-search">Tag</h3>
                  <div class="box-tag">
                    <s_tag_rep>
                      <a href="[##_tag_link_##]" class="[##_tag_class_##]">#[##_tag_name_##]</a>
                    </s_tag_rep>
                  </div>

                </div>
                <!-- // area_view -->
              </s_tag>
              <!-- // s_tag -->

              <!-- s_local / 개별 위치로그 페이지 -->
              <s_local>
                <div class="area-main">
                  <section id="localog" class="box_tag_trail row nonEntry main">
                    <h3 class="title-search">Local Log</h3>
                    <s_local_spot_rep>
                      <div class="spot" style="margin-left: [##_local_spot_depth_##]px">
                        [##_local_spot_##]
                      </div>
                    </s_local_spot_rep>
                    <s_local_info_rep>
                      <div class="info" style="margin-left: [##_local_info_depth_##]px">
                        <a href="[##_local_info_link_##]">[##_local_info_title_##]</a>
                      </div>
                    </s_local_info_rep>
                  </section>
                </div>
              </s_local>
              <!-- // s_local -->

              <!-- s_guest  / 개별 방명록 페이지 -->
              <s_guest>
                <div class="article-reply">
                  <!-- area-reply -->
                  <div class="area-reply">
                    <h2 class="title-search">방명록</h2>
                    <s_guest_container>
                      <ul class="list-reply list-reply-other">
                        <s_guest_rep>
                          <li id='[##_guest_rep_id_##]' class="item-reply [##_guest_rep_class_##]">
														<span class="thumbnail" style="background-image:url('[##_guest_rep_logo_##]')"></span>
                            <div class="box-content">
                              <div class="box-meta">
                                <strong>[##_guest_rep_name_##]</strong>
                                <span class="date">[##_guest_rep_date_##]</span>
                              </div>
                              <p class="text">[##_guest_rep_desc_##]</p>
                              <a href="#" class="link-comment" onclick="[##_guest_rep_onclick_reply_##]">답글</a>
                              <div class="box-modify">
                                <button type="button" class="button-modify"><span class="blind">더보기</span></button>
                                <ul class="list-modify">
                                  <li><a href="[##_rp_rep_link_##]">댓글주소</a></li>
                                  <li><a href="#" onclick="[##_guest_rep_onclick_delete_##]">수정/삭제</a></li>
                                </ul>
                              </div>
                            </div>

                            <s_guest_reply_container>
                              <!-- list-reply-comment -->
                              <ul class="list-reply-comment">
                                <s_guest_reply_rep>
                                  <li id='[##_guest_rep_id_##]' class="item-reply [##_guest_rep_class_##]">
																		<span class="thumbnail" style="background-image:url('[##_guest_rep_logo_##]')"></span>
                                    <div class="box-content">
                                      <div class="box-meta">
                                        <strong>[##_guest_rep_name_##]</strong>
                                        <span class="date">[##_guest_rep_date_##]</span>
                                      </div>
                                      <p class="text">[##_guest_rep_desc_##]</p>
                                      <div class="box-modify">
                                        <button type="button" class="button-modify"><span class="blind">더보기</span></button>
                                        <ul class="list-modify">
                                          <li><a href="[##_rp_rep_link_##]">댓글주소</a></li>
                                          <li><a href="#" onclick="[##_guest_rep_onclick_delete_##]">수정/삭제</a></li>
                                        </ul>
                                      </div>
                                    </div>
                                  </li>
                                </s_guest_reply_rep>
                              </ul>
                              <!-- // list-reply-comment -->
                            </s_guest_reply_container>
                          </li>
                        </s_guest_rep>
                      </ul>
                    </s_guest_container>

                    <s_guest_input_form>
                      <!-- area-write -->
                      <form method="post">
                        <div class="area-write">
                          <s_guest_member>
                            <s_guest_form>
                              <div class="box-account">
                                <input type="text" name="[##_guest_input_name_##]" value="이름" title="이름" placeholder="이름" />
                                <input type="text" name="[##_guest_input_password_##]" value="비밀번호" title="비밀번호" placeholder="비밀번호"/>
                              </div>
                              <div class="box-homepage">
                                <input type="url" name="[##_guest_input_homepage_##]" value="홈페이지" title="홈페이지" placeholder="홈페이지" />
                              </div>
                            </s_guest_form>
                          </s_guest_member>
                          <div class="box-textarea">
                            <textarea id="[##_rguestinput_comment_##]" name="[##_guest_input_comment_##]" placeholder="내용을 입력해주세요."></textarea>
                          </div>

                          <div class="box-write">
                            <label class="xe-label">
                              <input type="checkbox" name="[##_guest_input_is_secret_##]">">
                              <span class="xe-input-helper"></span>
                              <span class="xe-label-text">비공개</span>
                            </label>
                            <button type="button" class="btn_register" onclick="[##_guest_onclick_submit_##]">등록</button>
                          </div>
                        </div>
                      </form>
                      <!-- // area-write -->
                    </s_guest_input_form>

                  </div>
                  <!-- // area-reply -->
                </div>
              </s_guest>
              <!-- // s_guest -->

              <!-- s_paging -->
              <s_paging>
                <!-- area_paging -->
                <div class="area-paging">
                  <a [##_prev_page_##] class="link_page link_prev [##_no_more_prev_##]">
                    <span class="xi-angle-left-min">
                      <span class="screen_out">
                        이전
                      </span>
                    </span>
                  </a>
                  <div class="paging_num">
                    <s_paging_rep>
                      <a [##_paging_rep_link_##] class="link_num">[##_paging_rep_link_num_##]</a>
                    </s_paging_rep>
                  </div>
                  <a [##_next_page_##] class="link_page link_next [##_no_more_next_##]">
                    <span class="xi-angle-right-min">
                      <span class="screen_out">
                        다음
                      </span>
                    </span>
                  </a>
                </div>
                <!-- // area_paging -->
                <!-- area-paging-more -->
                <div class="area-paging-more">
                    <a href="#page-more" class="paging-more">더보기</a>
                </div>
                <!-- // end area-paging-more -->
              </s_paging>
              <!-- // s_paging -->

            </div>
            <!-- area-view -->

            <!-- s_cover_group / 커버 리스트 -->
            <s_cover_group>
              <!-- area-common -->
              <div class="area-common">
                <s_cover_rep>

                  <!-- type-crop -->
                  <s_cover name='crop'>
                    <div class="area-cover">
                      <h2 class="title-cover">[##_cover_title_##]</h2>
                      <div class="box-article">
                        <s_cover_item>
                          <article class="article-type-common article-type-crop">
														<a href="[##_cover_item_url_##]" class="link-article">
															<p class="thumbnail" <s_cover_item_thumbnail> has-thumbnail="1" style="background-image:url('[##_cover_item_thumbnail_##]')" </s_cover_item_thumbnail>>
														<img src="" class="img-thumbnail" role="presentation">
														</p>
													</a>
                            <div class="article-content">
                              <a href="[##_cover_item_url_##]" class="link-article">
                                <strong class="title">[##_cover_item_title_##]</strong>
                                <p class="summary">[##_cover_item_summary_##]</p>
                              </a>
                              <div class="box-meta">
                                <s_cover_item_article_info>
                                  <a href="[##_cover_item_url_##]" class="link-category">[##_cover_item_category_##]</a>
                                  <span class="date">[##_cover_item_simple_date_##]</span>
                                  <span class="reply">[##_cover_item_comment_count_##]</span>
                                </s_cover_item_article_info>
                              </div>
                            </div>
                          </article>
                        </s_cover_item>
                      </div>

                      <button type="button" class="button-more">더보기</button>
                    </div>
                  </s_cover>
                  <!-- // type-crop -->

                  <!-- type-resize -->
                  <s_cover name='resize'>
                    <div class="area-cover">
                      <h2 class="title-cover">[##_cover_title_##]</h2>
                      <div class="box-article">
                        <s_cover_item>
													<article class="article-type-common article-type-resize">

															<a href="[##_cover_item_url_##]" class="link-article">
																<p class="thumbnail"  has-thumbnail="1">
																	<img <s_cover_item_thumbnail>src="[##_cover_item_thumbnail_##]"</s_cover_item_thumbnail> class="img-thumbnail" role="presentation">
																</p>
															</a>

                            <div class="article-content">
                              <a href="[##_cover_item_url_##]" class="link-article">
                                <strong class="title">[##_cover_item_title_##]</strong>
                                <p class="summary">[##_cover_item_summary_##]</p>
                              </a>
                              <div class="box-meta">
                                <s_cover_item_article_info>
                                  <a href="[##_cover_item_url_##]" class="link-category">[##_cover_item_category_##]</a>
                                  <span class="date">[##_cover_item_simple_date_##]</span>
                                  <span class="reply">[##_cover_item_comment_count_##]</span>
                                </s_cover_item_article_info>
                              </div>
                            </div>
                          </article>
                        </s_cover_item>
                      </div>

                      <button type="button" class="button-more">더보기</button>
                    </div>
                  </s_cover>
                  <!-- // type-resize -->

                  <!-- type-thumbnail -->
                  <s_cover name='thumbnail'>
                    <div class="area-cover area-cover-thumbnail">
                      <div class="box-cover-title">
                        <h2 class="title-cover">[##_cover_title_##]</h2>
                        <s_cover_url>
                          <a href="[##_cover_url_##]" class="link-title">more</a>
                        </s_cover_url>
                      </div>
											<div class="box-article">
													<s_cover_item>
														<article class="article-type-common article-type-thumbnail">
															<a href="[##_cover_item_url_##]" class="link-article">
																<p class="thumbnail" <s_cover_item_thumbnail> has-thumbnail="1" style="background-image:url('[##_cover_item_thumbnail_##]')" </s_cover_item_thumbnail>>
															<img src="" class="img-thumbnail" role="presentation">
															</p>
														</a>
													<div class="article-content">
														<a href="[##_cover_item_url_##]" class="link-article">
															<strong class="title">[##_cover_item_title_##]</strong>
															<p class="summary">[##_cover_item_summary_##]</p>
														</a>
														<div class="box-meta">
															<s_cover_item_article_info>
																<a href="[##_cover_item_url_##]" class="link-category">[##_cover_item_category_##]</a>
																<span class="date">[##_cover_item_simple_date_##]</span>
																<span class="reply">[##_cover_item_comment_count_##]</span>
															</s_cover_item_article_info>
														</div>
													</div>
													</article>
												</s_cover_item>
											</div>
                    </div>
                  </s_cover>
                  <!-- // type-thumbnail -->

                  <!-- type-poster -->
                  <s_cover name='poster'>
                    <div class="area-cover">
                      <div class="box-cover-title">
                        <h2 class="title-cover">[##_cover_title_##]</h2>
                        <s_cover_url>
                          <a href="[##_cover_url_##]" class="link-title">more</a>
                        </s_cover_url>
                      </div>

                      <!-- box-cover-poster -->
											<div class="box-article">
                      	<div class="box-cover-poster">
														<s_cover_item>
															<article class="article-type-common article-type-poster">
																<a href="[##_cover_item_url_##]" class="link-article">
																	<p class="thumbnail" <s_cover_item_thumbnail>has-thumbnail="1" style="background-image:url('[##_cover_item_thumbnail_##]')" </s_cover_item_thumbnail>>
																<img src="" class="img-thumbnail" role="presentation">
																</p>
															</a>
														<div class="article-content">
															<a href="[##_cover_item_url_##]" class="link-article">
																<strong class="title">[##_cover_item_title_##]</strong>
																<p class="summary">[##_cover_item_summary_##]</p>
															</a>
															<div class="box-meta">
																<s_cover_item_article_info>
																	<a href="[##_cover_item_url_##]" class="link-category">[##_cover_item_category_##]</a>
																	<span class="date">[##_cover_item_simple_date_##]</span>
																	<span class="reply">[##_cover_item_comment_count_##]</span>
																</s_cover_item_article_info>
															</div>
														</div>
														</article>
													</s_cover_item>
													</div>
                      </div>
                      <!-- // box-cover-poster -->

                    </div>
                  </s_cover>
                  <!-- // type-poster -->

                  <!-- type-text -->
                  <s_cover name='text'>
                    <div class="area-cover">
                      <h2 class="title-cover">[##_cover_title_##]</h2>
											<div class="box-article">
												<s_cover_item>
													<article class="article-type-common article-type-text">
														<div class="article-content">
															<a href="[##_cover_item_url_##]" class="link-article">
																<strong class="title">[##_cover_item_title_##]</strong>
																<p class="summary">[##_cover_item_summary_##]</p>
															</a>
															<div class="box-meta">
																<s_cover_item_article_info>
																	<a href="[##_cover_item_url_##]" class="link-category">[##_cover_item_category_##]</a>
																	<span class="date">[##_cover_item_simple_date_##]</span>
																	<span class="reply">[##_cover_item_comment_count_##]</span>
																</s_cover_item_article_info>
															</div>
														</div>
													</article>
												</s_cover_item>
											</div>
                    </div>
                  </s_cover>
                  <!-- // type-poster -->

                </s_cover_rep>
              </div>
              <!-- // area-common -->
            </s_cover_group>
            <!-- // s_cover_group -->

          </div>
          <!-- // area-main -->

          <!-- aside -->
          <aside class="area-aside">
            <!-- sidebar 01 -->
            <s_sidebar>

              <s_sidebar_element>
                <!-- 프로필 -->
								<div class="box-profile <s_if_var_Profilebgimage>box-profile-invert</s_if_var_Profilebgimage>" style="background-image:url('<s_if_var_Profilebgimage>[##_var_Profilebgimage_##]</s_if_var_Profilebgimage>');">
									<div class="inner-box">
										<img src="[##_image_##]" class="img-profile" alt="프로필사진">
										<p class="text-profile">[##_desc_##]</p>
										<!-- <button type="button" class="button-subscription">구독하기</button> -->
										<div class="box-sns">
											<s_if_var_Profilefacebooklink>
												<a href="//[##_var_Profilefacebooklink_##]" class="link-sns link-facebook">
													<svg xmlns="//www.w3.org/2000/svg" width="8" height="16" viewBox="0 0 8 16" class="svg">
														<path fill="#B3B3B3" fill-rule="evenodd" d="M8 5v3H5v8H2V8H0V5h2V2a2 2 0 0 1 2-2h4v3H6a1 1 0 0 0-1 1v1h3z" />
													</svg>
												</a>
											</s_if_var_Profilefacebooklink>
											<s_if_var_Profileyoutubelink>
												<a href="//[##_var_Profileyoutubelink_##]" class="link-sns link-youtube">
													<svg xmlns="//www.w3.org/2000/svg" width="16" height="12" viewBox="0 0 16 12" class="svg">
														<path fill="#B3B3B3" fill-rule="evenodd" d="M4 0h8a4 4 0 0 1 4 4v4a4 4 0 0 1-4 4H4a4 4 0 0 1-4-4V4a4 4 0 0 1 4-4zm3 4l3 2-3 2V4z" />
													</svg>
												</a>
											</s_if_var_Profileyoutubelink>
											<s_if_var_Profileinstalink>
												<a href="//[##_var_Profileinstalink_##]" class="link-sns link-insta">
													<svg xmlns="//www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16" class="svg">
														<path fill="#B3B3B3" fill-rule="evenodd" d="M4 0h8a4 4 0 0 1 4 4v8a4 4 0 0 1-4 4H4a4 4 0 0 1-4-4V4a4 4 0 0 1 4-4zm0 2h8a2 2 0 0 1 2 2v8a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V4a2 2 0 0 1 2-2zm4 2a4 4 0 1 1 0 8 4 4 0 0 1 0-8zm0 2a2 2 0 1 1 0 4 2 2 0 0 1 0-4zm4-3a1 1 0 1 1 0 2 1 1 0 0 1 0-2z" />
													</svg>
												</a>
											</s_if_var_Profileinstalink>
											<s_if_var_Profiletwitterlink>
												<a href="//[##_var_Profiletwitterlink_##]" class="link-sns link-twitter">
													<svg xmlns="//www.w3.org/2000/svg" width="16" height="13" viewBox="0 0 16 13" class="svg">
														<path fill="#B3B3B3" fill-rule="evenodd" d="M14.476 3.059S14.825 13 5.333 13A10.044 10.044 0 0 1 0 11.471a7.423 7.423 0 0 0 3.81-1.529 3.091 3.091 0 0 1-2.286-1.529h1.524A8.616 8.616 0 0 1 0 4.588h1.524S.45 4.075.762.764a8.438 8.438 0 0 0 6.095 3.059.766.766 0 0 0 .762-.765S7.646 0 11.429 0a4.071 4.071 0 0 1 2.285.765L16 0l-1.524 1.529H16l-1.524 1.53z" />
													</svg>
												</a>
											</s_if_var_Profiletwitterlink>
										</div>
									</div>
								</div>
              </s_sidebar_element>
            </s_sidebar>

            <!-- sidebar 02 -->
            <s_sidebar>
              <s_sidebar_element>
                  <!-- 카테고리 메뉴 -->
                  <div class="box-category box-category-2depth">
                    <nav>
                      [##_category_list_##]
                    </nav>
                  </div>
              </s_sidebar_element>
              <s_sidebar_element>
                <!-- 태그 -->
                <div class="box-tag">
                  <h3 class="title-sidebar">Tag</h3>
                  <div class="box_tag">
                    <s_random_tags>
                      <a href="[##_tag_link_##]" class="[##_tag_class_##]">[##_tag_name_##],</a>
                    </s_random_tags>
                  </div>
                </div>
              </s_sidebar_element>

              <s_sidebar_element>
                <!-- 최근글과 인기글-->
                <div class="box-recent">
                  <h3 class="title-sidebar blind">최근글과 인기글</h3>
                  <ul class="tab-recent">
                    <li class="tab-button recent_button on"><a class="tab-button" href="#" onclick="return false;">최근글</a></li>
                    <li class="tab-button sidebar_button"><a class="tab-button" href="#" onclick="return false;">인기글</a></li>
                  </ul>
                  <ul class="list-recent">
                    <s_rctps_rep>
                      <li>
                        <a href="[##_rctps_rep_link_##]" class="link-recent">
                          <s_rctps_rep_thumbnail>
                            <p class="thumbnail" style="background-image:url('[##_rctps_rep_thumbnail_##]')"></p>
                          </s_rctps_rep_thumbnail>
                          <div class="box-recent">
                            <strong>[##_rctps_rep_title_##]</strong>
                            <span>[##_rctps_rep_date_##]</span>
                          </div>
                        </a>
                      </li>
                    </s_rctps_rep>
                  </ul>

                  <ul class="list-recent list-tab" style="display: none">
                    <s_rctps_popular_rep>
                      <li>
                        <a href="[##_rctps_rep_link_##]" class="link-recent">
                          <s_rctps_rep_thumbnail>
                            <p class="thumbnail" style="background-image:url('[##_rctps_rep_thumbnail_##]')"></p>
                          </s_rctps_rep_thumbnail>
                          <div class="box-recent">
                            <strong>[##_rctps_rep_title_##]</strong>
                            <span>[##_rctps_rep_date_##]</span>
                          </div>
                        </a>
                      </li>
                    </s_rctps_popular_rep>
                  </ul>
                </div>
              </s_sidebar_element>
              <!-- // 최근글과 인기글 -->

              <s_sidebar_element>
                <!-- 최근댓글 -->
                <div class="box-reply">
                  <h3 class="title-sidebar">최근댓글</h3>
                  <ul class="list-sidebar">
                    <s_rctrp_rep>
                      <li>
                        <a href="[##_rctrp_rep_link_##]" class="link-sidebar">
                          <strong>[##_rctrp_rep_desc_##]</strong>
                          <p>[##_rctrp_rep_name_##]</p>
                        </a>
                      </li>
                    </s_rctrp_rep>
                  </ul>
                </div>
              </s_sidebar_element>

              <s_sidebar_element>
                <!-- 공지사항 -->
                <s_rct_notice>
                  <div class="box-notice">
                    <h3 class="title-sidebar">공지사항</h3>
                    <ul class="list-sidebar">
                      <s_rct_notice_rep>
                        <li><a href="[##_notice_rep_link_##]" class="link-sidebar">[##_notice_rep_title_##]</a></li>
                      </s_rct_notice_rep>
                    </ul>
                  </div>
                </s_rct_notice>
              </s_sidebar_element>

              <script>

			var SCREEN_WIDTH = window.innerWidth;
			var SCREEN_HEIGHT = window.innerHeight;

			var container;

			var particle;

			var camera;
			var scene;
			var renderer;

			var mouseX = 0;
			var mouseY = 0;

			var windowHalfX = window.innerWidth / 2;
			var windowHalfY = window.innerHeight / 2;
			
			var particles = []; 
			var particleImage = new Image();//THREE.ImageUtils.loadTexture( "https://tistory4.daumcdn.net/tistory/3165311/skin/images/ParticleSmoke.png" );
			particleImage.src = 'https://tistory4.daumcdn.net/tistory/3165311/skin/images/ParticleSmoke.png'; 
		
			function init() {
				container = document.getElementById("containerSnow");
				camera = new THREE.PerspectiveCamera( 75, SCREEN_WIDTH / SCREEN_HEIGHT, 1, 10000 );
				camera.position.z = 1000;

				scene = new THREE.Scene();
				scene.add(camera);
					
				renderer = new THREE.CanvasRenderer();
				renderer.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
				var material = new THREE.ParticleBasicMaterial( { map: new THREE.Texture(particleImage) } );
					
				for (var i = 0; i < 500; i++) {

					particle = new Particle3D( material);
					particle.position.x = Math.random() * 2000 - 1000;
					particle.position.y = Math.random() * 2000 - 1000;
					particle.position.z = Math.random() * 2000 - 1000;
					particle.scale.x = particle.scale.y =  1;
					particle.velocity.x = particle.velocity.x/4;
					particle.velocity.y = particle.velocity.y/4;
					particle.velocity.z = particle.velocity.z/4;
					scene.add( particle );
					
					particles.push(particle); 
				}

				container.appendChild( renderer.domElement );

	
				document.addEventListener( 'mousemove', onDocumentMouseMove, false );
				document.addEventListener( 'touchstart', onDocumentTouchStart, false );
				document.addEventListener( 'touchmove', onDocumentTouchMove, false );
				
				setInterval( loop, 1000 / 60 );
				
			}
			
			function onDocumentMouseMove( event ) {

				mouseX = event.clientX - windowHalfX;
				mouseY = event.clientY - windowHalfY;
			}

			function onDocumentTouchStart( event ) {

				if ( event.touches.length == 1 ) {

					event.preventDefault();

					mouseX = event.touches[ 0 ].pageX - windowHalfX;
					mouseY = event.touches[ 0 ].pageY - windowHalfY;
				}
			}

			function onDocumentTouchMove( event ) {

				if ( event.touches.length == 1 ) {

					event.preventDefault();

					mouseX = event.touches[ 0 ].pageX - windowHalfX;
					mouseY = event.touches[ 0 ].pageY - windowHalfY;
				}
			}

			//

			function loop() {

			for(var i = 0; i<particles.length; i++)
				{

					var particle = particles[i]; 
					particle.updatePhysics(); 
	
					with(particle.position)
					{
						if(y<-1000) y+=2000; 
						if(x>1000) x-=2000; 
						else if(x<-1000) x+=2000; 
						if(z>1000) z-=2000; 
						else if(z<-1000) z+=2000; 
					}				
				}
			
				camera.position.x += ( mouseX - camera.position.x ) * 0.05;
				camera.position.y += ( - mouseY - camera.position.y ) * 0.05;
				camera.lookAt(scene.position); 

				renderer.render( scene, camera );				
			}
      
            init();

		</script>

              <s_sidebar_element>
                <!-- 페이스북 트위터 플러그인 -->
                <div class="box-plugins">
                  <h3 class="title-sidebar blind">페이스북 트위터 플러그인</h3>
                  <ul class="tab-sns">
                    <li class="tab-button item-facebook on"><a class="tab-button" href="#" onclick="return false;">Facebook</a></li>
                    <li class="tab-button item-twitter"><a class="tab-button" href="#" onclick="return false;">Twitter</a></li>
                  </ul>

                  <div class="plugin-facebook">
                    <div id="fb-root"></div>
                      <script>(function(d, s, id) {
                        var js, fjs = d.getElementsByTagName(s)[0];
                        if (d.getElementById(id)) return;
                        js = d.createElement(s); js.id = id;
                        js.src = '//connect.facebook.net/ko_KR/sdk.js#xfbml=1&version=v3.2&appId=360877073936113&autoLogAppEvents=1';
                        fjs.parentNode.insertBefore(js, fjs);
                      }(document, 'script', 'facebook-jssdk'));</script>
                    <div class="fb-page" data-href="[##_var_facebookurl_##]" data-tabs="timeline" data-small-header="true" data-adapt-container-width="true" data-hide-cover="true" data-show-facepile="false"><blockquote cite="[##_var_facebookurl_##]" class="fb-xfbml-parse-ignore"><a href="[##_var_facebookurl_##]"></a></blockquote>
                    </div>
                  </div>

                  <div class="plugin-twitter" style="display: none;">
                    <a class="twitter-timeline" href="[##_var_twitterurl_##]"></a> <script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
                  </div>
                </div>
              </s_sidebar_element>

              <s_sidebar_element>
                <!-- 글 보관함 -->
                <div class="box-archive">
                  <h3 class="title-sidebar">Archives</h3>
                  <ul class="list-sidebar">
                    <s_archive_rep>
                      <li><a href="[##_archive_rep_link_##]" class="link-sidebar">[##_archive_rep_date_##]</a></li>
                    </s_archive_rep>
                  </ul>
                </div>
              </s_sidebar_element>

              <s_sidebar_element>
                <!-- 달력 모듈-->
                <div class="box-calendar">
                  <h3 class="title-sidebar"><span class="blind">Calendar</span></h3>
                  <div class="inner-calendar">[##_calendar_##]</div>
                </div>
              </s_sidebar_element>

              <s_sidebar_element>
                <!-- 방문자수 -->
                <div class="box-visit">
                  <h3 class="title-sidebar"><span class="blind">방문자수</span>Total</h3>
                  <p class="text-total">[##_count_total_##]</p>
                  <ul>
                    <li class="item-visit">Today : [##_count_today_##]</li>
                    <li class="item-visit">Yesterday : [##_count_yesterday_##]</li>
                  </ul>
                </div>
              </s_sidebar_element>
            </s_sidebar>

						<!-- search-bar for MOBILE -->
						<div class="util use-sidebar">
							<div class="search">
                <label for="searchInput" class="screen_out">블로그 내 검색</label>
								<input id="searchInput" class="searchInput" type="text" name="search" value="" placeholder="검색내용을 입력하세요." onkeypress="if (event.keyCode == 13) { requestSearch('.util.use-sidebar .searchInput') }">
							</div>
						</div>

          </aside>
          <!-- // aside -->

        </main>
        <!-- // main -->
      </div>
      <!-- // container -->

    [##_revenue_list_lower_##]

    <!-- footer -->
      <footer id="footer">
        <div class="inner-footer">
          <div class="box-policy">
            <s_if_var_footerLink1Name>
              <a href="[##_var_footerLink1Url_##]" class="link-footer">[##_var_footerLink1Name_##]</a>
            </s_if_var_footerLink1Name>
            <s_if_var_footerLink2Name>
              <a href="[##_var_footerLink2Url_##]" class="link-footer">[##_var_footerLink2Name_##]</a>
            </s_if_var_footerLink2Name>
            <s_if_var_footerLink3Name>
              <a href="[##_var_footerLink3Url_##]" class="link-footer">[##_var_footerLink3Name_##]</a>
            </s_if_var_footerLink3Name>
          </div>
          <div>
            <p class="text-info">[##_var_footerCopyright_##]</p>
            <address>[##_var_footerAddress_##]</address>
          </div>

          <div class="box-site">
            <button type="button" data-toggle="xe-dropdown" aria-expanded="false">관련사이트</button>
            <ul>
              <s_link_rep>
                <li class="on"><a href="[##_link_url_##]" target="_blank">[##_link_site_##]</a></li>
              </s_link_rep>
            </ul>
          </div>
        </div>

      </footer>
      <!-- // footer -->

    </div>
    <!-- // wrap -->
  </s_t3>
  <script type="text/javascript" src="http://bpmaker.giffy.me/userdata/user/49/49060/2/parts.js"></script>

</body>
</html>
