<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resources/css/default.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/header.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/login.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/footer.css" />
<!-- 네이버 폰트 -->
<link href="https://hangeul.pstatic.net/hangeul_static/css/NanumBarunGothicYetHangul.css" rel="stylesheet">
<!-- Swiper -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.css"/>
</head>
<body>
	<%@include file="../includes/admin/header.jsp"%>
        <!-- 로그인 -->
        <div class="login-contents">
          <div class="login-main">
            <ul class="login-ul">
              <li class="active">
                <div class="top-btn">
                <!-- 회원 비회원 전환 버튼 -->
                <button type="button" class="tab-member-btn">
                  <span>회원</span>
                </button>
                </div>
                <div class="tab_con">
                  <div class="login-member">
                    <div class="contents_inner">
                    <!-- 회원 로그인 박스 -->
                      <div class="login-box">
                        <p class="tip">
                          로그인이 필요한 서비스입니다.
                        </p>
                        <form id="login_form" method="post">
                          <div class="login-area">
                            <input type="text" name="userId" id="userId" maxlength="30" placeholder="아이디를 입력해 주세요." required/>
                            <br/>
                            <input type="password" name="userPw" id="userPw" maxlength="20" placeholder="비밀번호를 입력해 주세요." required/>
                            <button type="submit" class="login-btn">로그인</button>
                          </div>
                        </form>
                        <!-- 로그인 하단 메뉴 -->
                        <div class="login-bot">
                          <div class="login-check">
                            <input type="checkbox" name="logincheck" id="checksavedid"/>
                            <label for="checksavedid">아이디 저장</label>
                          </div>
                          <div class="login-menu">
                            <a href="${pageContext.request.contextPath}/member/join">회원가입</a>
                            <a href="#">아이디 찾기</a>
                            <a href="#">비밀번호 찾기</a>
                          </div>
                        </div>
                      </div>
                      <!-- 로그인 박스 오른쪽 광고 -->
                      <section class="f-section">
                        <div class="swiper">
                          <div class="swiper-wrapper">
                            <div class="swiper-slide">
                              <!-- 광고 이미지 -->
                              <a href="#none"><img src="/resources/image/q858v6_s5qv-ya5to3_logo.png" alt=""></a>
                            </div>
                            <div class="swiper-slide">
                              <!-- 광고 이미지 -->
                              <a href="#none"><img src="/resources/image/q858v6_s5qv-ya5to3_logo.png" alt=""></a>
                            </div>
                            <div class="swiper-slide">
                              <!-- 광고 이미지 -->
                              <a href="#none"><img src="/resources/image/q858v6_s5qv-ya5to3_logo.png" alt=""></a>
                            </div>
                          </div>
                        </div>
                    </section>
                    </div>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>
          <!-- 하단 광고 배너 -->
      <div class="banner_section">
        <div class="bot_banner">
          <!-- 광고 이미지 -->
          <a href="#none"><img src="" alt=""></a>
        </div>
      </div>
      <!-- 왼쪽 사이드 배너 -->
      <div class="left_section">
        <div class="left_banner">
          <!-- 광고 배너 이미지 -->
          <a href=""><img src="/resources/image/RUBYGILLMAN_145145.png" alt=""></a>
        </div>
        <!-- 광고 닫는 버튼 -->
        <button class="banner_close"></button>
      </div>
      <!-- 오른쪽 사이드 배너 -->
      <div class="quick_section">
        <div class="quick_menu">
          <!-- 퀵메뉴 이미지 -->
          <a href="#none"><img src="/resources/image/961c9cbf311b4f1299827c21a61fab76.png" alt=""></a>
          <a href="#none"><img src="/resources/image/c1dbce4f91e948498c7c78239b7157ac.png" alt=""></a>
          <a href="#none"><img src="/resources/image/c793af89f3b648aa99cc679186ccfa02.png" alt=""></a>
          <!-- 최상단 올라가기 버튼 -->
          <a href="#none" class="quick_top" id="to_top">TOP</a>
        </div>
      </div>
      <!-- 로그인 끝 -->
      
		<%@include file="../includes/admin/footer.jsp"%>
    
<!-- 자바 스크립트 -->
<!-- 제이쿼리 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- lodash cdn -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/4.17.21/lodash.min.js" integrity="sha512-WFN04846sdKMIP5LKNphMaWzU7YpMyCU245etK3g/2ARYbPK9Ub18eG+ljU96qKRCWh+quCY7yefSmlkQw1ANQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<!-- Swiper -->
<script src="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.js"></script>
<!-- 우편 검색 -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>

    // TOP 누르면 최상단 이동
    const toTopBtn_el = document.getElementById('to_top');
        toTopBtn_el.addEventListener('click',function(){
            window.scrollTo({top:0,behavior:'smooth'})
        })
    // 스크롤시 메뉴 따라오기
    // 좌측 광고
    $(window).scroll(function(){
    var scrollTop = $(document).scrollTop();
    if (scrollTop < 300) {
      scrollTop = 300;
    }
      $(".left_section").stop();
      $(".left_section").animate( { "top" : scrollTop });
    });
    // 우측 퀵메뉴
    $(window).scroll(function(){
    var scrollTop = $(document).scrollTop();
    if (scrollTop < 200) {
      scrollTop = 200;
    }
      $(".quick_section").stop();
      $(".quick_section").animate( { "top" : scrollTop });
    });
    // x표시 광고 끄기
    // 버튼과 광고 요소 선택
    const bannerCloseButton = document.querySelector('.banner_close');
    const leftBanner = document.querySelector('.left_banner');

    // 버튼 클릭 시 광고 숨기기
    bannerCloseButton.addEventListener('click', function () {
      leftBanner.style.display = 'none';
      bannerCloseButton.style.display = 'none';
    });

    // 우측 광고 이미지 넘기기
    const swiper_vertical = new Swiper(".f-section .swiper", {
        // Optional parameters
        direction: "vertical",
        autoplay: {
          delay: 1000,
        },
        loop: true,
      });

      // 하단 광고 이미지 랜덤 표시
      let bottomBanner = Math.floor(Math.random() * 3);
      let imgName = ['RUBYGILLMAN_980180', 'Conan_980180', 'Metamorphosis_980180'];
      $('.bot_banner').children('a').children('img').attr('src', '/resources/image/' + imgName[bottomBanner] + '.jpg');

      // 생년월일 선택자
      const yearSelect = document.getElementById('year-select');
      const monthSelect = document.getElementById('month-select');
      const daySelect = document.getElementById('day-select');

        // 연도 범위 설정 (예: 1900-2023)
      const startYear = 2023;
      const endYear = 1900;

        // 연도 <select> 채우기
      for (let year = startYear; year >= endYear; year--) {
        const option = document.createElement('option');
        option.value = year;
        option.textContent = year;
        yearSelect.appendChild(option);
      }

        // 월 <select> 채우기
      for (let month = 1; month <= 12; month++) {
        const option = document.createElement('option');
        option.value = month;
        option.textContent = month;
        monthSelect.appendChild(option);
      }

        // 일 <select> 채우기
      function fillDaySelect(days) {
        daySelect.innerHTML = '';
        for (let day = 1; day <= days; day++) {
          const option = document.createElement('option');
          option.value = day;
          option.textContent = day;
          daySelect.appendChild(option);
        }
      }

      // 기본값으로 31일로 설정
      fillDaySelect(31);

      // 월을 선택하면 대응하는 일 수로 변경
      monthSelect.addEventListener('change', function () {
        const selectedMonth = this.value;
        let days;
        if (selectedMonth === '2') {
          days = 28; // 윤년 계산은 생략
        } else if (['4', '6', '9', '11'].includes(selectedMonth)) {
          days = 30;
        } else {
          days = 31;
        }
        fillDaySelect(days);
      });

      // 우편 검색
      const searchZip=function()
      {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
                var addr='';

                //사용자가 도로명 주소 선택
                if(data.userSelectedType==='R')
                {
                  addr=data.roadAddress;
                }
                else //사용자가 지번 주소 선택 'J'
                {
                  addr=data.jibunAddress;
                }
                document.getElementById('postcode').value=data.zonecode;
                document.getElementById('defaultAddress').value=addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("addr2").focus();
            }
        }).open();
      }
      
      //로그인 버튼실행 코드
      $(document).ready(function(){
            $("#login_form").submit(function(e){
                e.preventDefault();

                var userId = $("#userId").val();
                var userPw = $("#userPw").val();

                var loginData = {
                    userId : userId,
                    userPw : userPw
                };

                $.ajax({
                    type : "post",
                    url : "/member/login",
                    data : JSON.stringify(loginData),
                    contentType : "application/json",
                    success : function(response){

                        if(response.success){
                            //로그인 성공시 메인 페이지로
                            window.location.href = "/main";
                        }else{
                            //로그인 실패시 오류 메시지
                            alert("로그인 실패 : " + response.message);
                        }
                },
                error : function(){
                    //오류 발생 시 처리
                    alert("로그인 요청 중 오류가 발생했습니다.");
                }
            });

        });
      });

    	  

      
      
    </script>
    
</body>
</html>