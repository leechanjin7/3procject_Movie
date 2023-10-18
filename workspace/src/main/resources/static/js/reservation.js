// 모든 버튼에서 active 클래스를 제거하고, 클릭한 버튼에만 active 클래스를 추가하는 함수
function setActive(button) {
    // 모든 버튼에서 active 클래스 제거
    var buttons = document.querySelectorAll('.cinema-list button');
    for (var i = 0; i < buttons.length; i++) {
        buttons[i].classList.remove('movie-active');
        if (buttons[i].nextElementSibling) {  // button 다음에 오는 요소(여기서는 ul)가 있다면
            buttons[i].nextElementSibling.style.display = "none";  // 그 요소를 숨김
        }
    }
    // 클릭한 버튼에만 active 클래스 추가
    button.classList.add('movie-active');
    if (button.nextElementSibling) {  // 클릭한 button 다음에 오는 요소(여기서는 ul)가 있다면
        button.nextElementSibling.style.display = "block";  // 그 요소를 보임
    }
}

// 모든 버튼에서 active 클래스를 제거하고, 클릭한 버튼에만 active 클래스를 추가하는 함수
function setLocal(button) {
    // 모든 버튼에서 active 클래스 제거
    var buttons = document.querySelectorAll('.choice-list-detail button');
    for (var i = 0; i < buttons.length; i++) {
        buttons[i].classList.remove('local-active');
    }
    // 클릭한 버튼에만 active 클래스 추가
    button.classList.add('local-active');
}

// '영화관 선택' 버튼 클릭 시 실행되는 함수
function openPopup () {
  const options = 'width=700, height=600, top=50, left=50, scrollbars=yes'
  var popupWindow = window.open('/movies/rating','_blank',options);

  // 팝업 창이 닫힐 때 실행될 함수 설정
  var timer = setInterval(function() {
      if(popupWindow.closed) {
          clearInterval(timer);
          updateMovieName();
      }
  }, 500);
}

// 선택된 영화 이름과 이미지로 <div class='movie-name'> 요소와 <img> 요소 업데이트하기
function updateMovieName() {
    var selectedMovie = localStorage.getItem('selectedMovie');
    var selectedImage = localStorage.getItem('selectedImage');
    if (selectedMovie) {
        document.querySelector('.ticket-movie .movie-name').innerText = selectedMovie;
    }
    if (selectedImage) {
        document.querySelector('.ticket-movie-poster img').src = 'https://image.tmdb.org/t/p/w500' + selectedImage;
    }
}

//영화관 정보 저장해두기
function selectMovie(theaterName) {
	localStorage.setItem('selectedTheater', theaterName);
}

//캘린더 위젯 적용
//설정
const config = {
    dateFormat: 'yy-mm-dd',
    showOn : "button",
    buttonText : "날짜 선택",
    prevText: '이전 달',
    nextText: '다음 달',
    monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
    monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
    dayNames: ['일','월','화','수','목','금','토'],
    dayNamesShort: ['일','월','화','수','목','금','토'],
    dayNamesMin: ['일','월','화','수','목','금','토'],
    yearSuffix: '년',
    changeMonth : true,
    changeYear : true
}
//캘린더
$(function(){
  $("input[name='publeYear']").datepicker({
        dateFormat: 'yy-mm-dd',  //달력 날짜 형태
        showOn : "button",       //버튼 표시하고 눌러야만 달력 표시
        buttonText : "날짜 선택",
        prevText: '이전 달',
        nextText: '다음 달',
        monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
        monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
        dayNames: ['일','월','화','수','목','금','토'],
        dayNamesShort: ['일','월','화','수','목','금','토'],
        dayNamesMin: ['일','월','화','수','목','금','토'],
        yearSuffix: '년',    //달력의 년도 부분 뒤 텍스트
        changeMonth : true,
        changeYear : true,
        minDate: "-0D", //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
        maxDate: "+5D" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
  });
  $("input[name='publeYear']").datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
});

$(document).ready(function() {
    // 페이지 로드 시 시간 선택 버튼 숨기기
    $('.time_choice .choice-list').hide();

    // 관람일 입력 필드에 변화가 생겼을 때 실행될 함수
    $("input[name='publeYear']").change(function() {
        // 영화관 이름과 관람일이 모두 선택되었는지 확인
        var theaterName = localStorage.getItem('selectedTheater');
        var publeYear = $("input[name='publeYear']").val();
        if (theaterName && publeYear) {
            // '관람일을 선택해주세요.' 메시지 숨기기
            $('.select-message').hide();
            // 시간 선택 버튼 보이게 하기
            $('.time_choice .choice-list').show();
        }
    });
});

function setShowTime(button) {
    // 모든 버튼에서 active 클래스 제거
    var buttons = document.querySelectorAll('.choice-timeList button');
    for (var i = 0; i < buttons.length; i++) {
        buttons[i].classList.remove('showTime-active');
    }
    // 클릭한 버튼에만 active 클래스 추가
    button.classList.add('showTime-active');
}

$(document).ready(function() {
    // 관람일 입력 필드 값 변경 시 #txtDate 업데이트
    $("input[name='publeYear']").change(function() {
        var selectedDate = $(this).val();
        $('#txtDate').text(selectedDate);
    });

    // 시간 선택 버튼 클릭 시 #txtTime 업데이트
    $("button[name='showTime']").click(function() {
        var selectedTime = $(this).text();
        $('#txtTime').text(selectedTime);
    });
});