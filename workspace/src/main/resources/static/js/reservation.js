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
        if (buttons[i].nextElementSibling) {  // button 다음에 오는 요소(여기서는 ul)가 있다면
            buttons[i].nextElementSibling.style.display = "none";  // 그 요소를 숨김
        }
    }
    // 클릭한 버튼에만 active 클래스 추가
    button.classList.add('local-active');
    if (button.nextElementSibling) {  // 클릭한 button 다음에 오는 요소(여기서는 ul)가 있다면
        button.nextElementSibling.style.display = "block";  // 그 요소를 보임
    }
}

// 모든 버튼에서 active 클래스를 제거하고, 클릭한 버튼에만 active 클래스를 추가하는 함수
function setTheater(button) {
    // 모든 버튼에서 active 클래스 제거
    var buttons = document.querySelectorAll('.choice-list-detail-theater button');
    for (var i = 0; i < buttons.length; i++) {
        buttons[i].classList.remove('theater-active');
    }
    // 클릭한 버튼에만 active 클래스 추가
    button.classList.add('theater-active');
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
        minDate: '-0D', //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
        maxDate: '2023-10-30' //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)
  });
  $("input[name='publeYear']").datepicker('setDate', 'today'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
});

//캘린더 날짜 수정
$('button[data-hidden-value]').click(function() {
    var playMovie = localStorage.getItem('selectedMovie');
    console.log('캘린더 수정 무비', playMovie);

    $.ajax({
        url: '/member/reservation',  // 실제 엔드포인트로 변경해야 합니다.
        type: 'POST',
        contentType : 'application/json',
        data: JSON.stringify ({ 'playMovie': playMovie,
        }),
        success: function(response) {
            // response는 서버에서 보내는 응답입니다.
            // 이 예시에서는 response가 { 'endDate': '2023-11-20' } 형태라고 가정합니다.
            console.log('response.endDate : ', response.endDate);
            $("input[name='publeYear']").datepicker('option', 'maxDate', response.endDate);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('캘린더 수정 에러', textStatus, errorThrown);
        }
    });
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
        buttons[i].classList.remove('startTime-active');
    }
    // 클릭한 버튼에만 active 클래스 추가
    button.classList.add('startTime-active');
}

$(document).ready(function() {
    // 관람일 입력 필드 값 변경 시 #txtDate 업데이트
    $("input[name='publeYear']").change(function() {
        var selectedDate = $(this).val();
        $('#txtDate').text(selectedDate);
    });

    // 시간 선택 버튼 클릭 시 #txtTime 업데이트
    $("button[name='startTime']").click(function() {
        var selectedTime = $(this).text();
        var theaterId = $(this).attr('data-hidden-value');
        $('#txtTime').text(selectedTime + " ~ " + theaterId);
    });
});

// '영화 선택', '날짜 선택', '시간 선택' 버튼 클릭 시 실행되는 함수
$('button[data-hidden-value], button[name="startTime"]').click(fetchTheaterPlayMovieId);
$("input[name='publeYear']").change(fetchTheaterPlayMovieId);

function fetchTheaterPlayMovieId() {
    var theaterId = $('button[data-hidden-value].theater-active').attr('data-hidden-value');
    var playMovie = localStorage.getItem('selectedMovie');
    var startDate = $("input[name='publeYear']").val();
    var startTime = $('button[name="startTime"].startTime-active').text();

    console.log('상영관', theaterId);

    $.ajax({
        url: '/member/reservation',  // 실제 엔드포인트로 변경해야 합니다.
        type: 'POST',
        contentType : 'application/json',
        data: JSON.stringify ({
            'theaterId': theaterId,
            'playMovie': playMovie,
            'startDate': startDate,
            'startTime': startTime
        }),
        success: function(response) {
            localStorage.setItem('totalSeats', response.totalSeats);
            localStorage.setItem('currentSeat', response.currentSeat);

             // 현재 좌석 값 업데이트
            $('#current-seat').text(response.currentSeat);

            // 총 좌석 값 가져오기 및 업데이트
            $('#total-seats').text(response.totalSeats);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            console.log('시트 에러값', textStatus, errorThrown);
        }
    });
}

//결제 API
function requestPayment() {
    PortOne.requestPayment({
        storeId: 'store-81aa1a2d-3dc6-4101-aef0-7ee6967790bc',
        paymentId: 'paymentId' + new Date().getTime(), // 고유한 결제 ID 생성
        orderName: movieName,
        totalAmount: totalAmount,
        currency: 'CURRENCY_KRW',
        channelKey: 'channel-key-cf0efb22-a82f-4dc4-8895-44a8f38f0aa8',
        payMethod: "CARD",
        customer: {customerId:"홍길동",
        phoneNumber:"01011111111"}
    });
//    .then(function(response){
//        if(response.success){
//            return fetch('/payment', {
//                method : 'POST',
//                headers : {
//                    'Content-Type' : 'application/json'
//                },
//                body : JSON.stringify({
//                    userId:
//                    movieName:
//                    startDate:
//                    startTime:
//                    endTime:
//                    selectSeat:
//                    selectSeatNum:
//                    priceTotal:
//                })
//            })
//        }
//    }).then(res => res.json())
//         .then(data => console.log(data))
//         .catch(error => console.error('Error : ', error));
}


$(document).ready(function(){
    var prevValues = {childrenCount: 0, teenCount: 0, adultCount: 0};

    $("#childrenCount, #teenCount, #adultCount").each(function() {
        prevValues[$(this).attr('id')] = $(this).val();
    });

    $("#childrenCount, #teenCount, #adultCount").change(function(){
        var children = parseInt($("#childrenCount").val(), 10);
        var teen = parseInt($("#teenCount").val(), 10);
        var adult = parseInt($("#adultCount").val(), 10);

        var totalPeople = children + teen + adult;

        // 현재 좌석 수 가져오기
        let currentSeats = parseInt($('#current-seat').text());

        if (totalPeople > currentSeats) {
            alert("현재 좌석 수를 초과할 수 없습니다.");
            $(this).val(prevValues[$(this).attr('id')]); // 이전 값으로 되돌리기
            return;
        }

         // 이전 값을 업데이트
         prevValues[$(this).attr('id')] = $(this).val();

         // 총 가격 초기화
         totalTicketPrice = 0;

         // 어린이
         $.ajax({
             url: '/getPrice',
             type: 'post',
             data: JSON.stringify({ age: "어린이", count : children }),
             contentType : 'application/json',
             dataType : 'json',
             success : function(data){
                 updatePrice(data.price * children);
             }
         });

          // 청소년
          $.ajax({
              url:'/getPrice',
              type:'post',
              data : JSON.stringify({age:"청소년", count : teen}),
              contentType:'application/json',
              dataType:'json',
              success:function(data){
                  updatePrice(data.price * teen);
              }
          });

           // 성인
           $.ajax({
               url:'/getPrice',
               type:'post',
               data : JSON.stringify({age:"성인", count : adult}),
               contentType:'application/json',
               dataType:'json',
               success:function(data){
                   updatePrice(data.price * adult);
               }
           });
      });
});

var totalTicketPrice = 0;
function updatePrice(priceToAdd) {
    totalTicketPrice += priceToAdd;
    $(".ticket-price").html(totalTicketPrice.toLocaleString('ko-KR') + "<span>원</span>");
    $("input[name='moviePrice']").val(totalTicketPrice);
}

$(document).ready(function(){
    let maxSeats = 0;

    $(".select-person").change(function() {
        // 총 인원 계산
        maxSeats = parseInt($('#childrenCount').val()) + parseInt($('#teenCount').val()) + parseInt($('#adultCount').val());

        // 현재 선택된 좌석 수가 새로운 최대값보다 많으면 초과하는 만큼 제거
        let selectedSeats = $('.selected-seat');
        if (selectedSeats.length > maxSeats) {
            for (let i = maxSeats; i < selectedSeats.length; i++) {
                $(selectedSeats[i]).removeClass('selected-seat');
            }
        }

        // seatInfo 업데이트
        updateSeatInfo();
    });

    $(".seat").click(function(){
        let currentSelected = $('.selected-seat').length;

        if (!$(this).hasClass('selected-seat') && currentSelected >= maxSeats) {
            alert('최대 인원을 초과할 수 없습니다.');
            return;
        }

         // 배경색 변경
         $(this).toggleClass('selected-seat');

         // seatInfo 업데이트
         updateSeatInfo();
     });
});

function updateSeatInfo() {
    let selectedSeatValues = [];
    $('.selected-seat').each(function() {
      selectedSeatValues.push($(this).data('hidden-value'));
    });

    $('#seatInfo').text(selectedSeatValues.join(', '));
}