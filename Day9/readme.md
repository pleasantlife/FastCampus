# 2017년 5월 19일

## 안드로이드 스튜디오

### 설치 및 환경설정 (2.3.2기준)

  0. 자바는 당연히 설치했을거라 믿는다.
  1. https://developer.android.com/studio/index.html?hl=ko 에서 안드로이드 스튜디오 다운
  2. 설치 후 실행 되면 업데이트 꼭 해주기!(SDK가 업데이트 됨.)

### 에뮬레이터 설치 방법

      1. 롤리팝(5.0)과 마시멜로우(6.0)간 환경 차이가 크기 때문에 에뮬레이터는 6.0으로 세팅할 것을 추천
          (마시멜로우와 누가(7.0)간의 환경 차이는 크지 않다고 함.)
      2. 안드로이드 버전 이미지 다운로드시 HAXM이 설치되지 않았다고 창 하단부에 뜨는데,
         HAXM 설치 후 안드로이드 스튜디오를 재시작할 때까지 표시가 사라지지 않으니 꼭 재시작할 것!


## 안드로이드 스튜디오 트러블슈팅  

### 안드로이드 스튜디오 레이아웃 프리뷰 한글깨짐

  안드로이드 스튜디오 설치시 폰트폴더(윈도우 폰트폴더 아님)에 나눔고딕폰트 파일이 설치되어있으나,
  폰트를 설정하는 파일은 fonts.xml파일에는 한국어를 NotoSans로 매칭시킴.
  그런데, 안드로이드 스튜디오는 NotoSans폰트를 설치하지 않음...(묵념)

  안드로이드설치폴더/plugins/android/lib/layoutlib/data/fonts/fonts.xml에서 ko로 검색하여

  <family lang="ko">
  <font weight="400" style="normal" index="1">NotoSansCJK-Regular.ttc</font>

  위에서 NotoSansCJK-Regular.ttc를 NanumGothic.ttf로 변경해준다.


### 안드로이드 스튜디오 재설치 또는 기존 프로젝트 재오픈시 Gradle 생성 오류 대처법

  안드로이드 스튜디오를 재설치할 경우 build.gradle이 엉키며
  compile 'com.android.support.constraint:constraint-layout:1.0.2'
  을 찾을 수 없다는 에러와 함께 앱이 구동되지 않을 수 있음.

  File>Setting>(sdk 검색)>SDK Tools탭 클릭>목록 맨 아래에 Support Repository가 있는데,
  해당 항목에 있는 것들이 전부 설치되도록 체크표시 활성화해주고 OK누르면 해결!


## 안드로이드 스튜디오 프로젝트 시작

  1. 맨 처음 뜨는 화면을 만들려면 Activity 생성시 Launch Activity에 체크.
  2. 프로젝트 생성시 Target Android Devices 단계에서 Phone and Tablet 탭 아래에 'Help me choose'
      를 누르면, 버전별 점유율과 사용가능한 기술이 나옴!


### 안드로이드 레이아웃

  1. constraint : 가장 기본적인 레이아웃. 높은 자유도에 비례하는 불편함.
  2. Relative : 버튼, 텍스트 등 각 구성이 연계성을 가지는 레이아웃.
  3. Linear : 화면에 맞춰 정렬해주는 레이아웃. 기준을 가로/세로로 선택 가능.
  4. Grid : 표(또는 행렬) 방식으로 정렬해주는 레이아웃.
  5. 각 레이아웃은 한 Activity에서 동시 사용 가능.

## 계산기 레이아웃 만들기

  1. 레이아웃 프리뷰(XML) : 그리드 레이아웃 -> 텍스트뷰 2개 + 버튼 16개 삽입 -> 개체별 id 할당
  2. MainActivity(Java) : MainActivity.java에서 버튼 선언-> 버튼별 onClickListener 할당 -> 각 리스너별 행동케이스 작성  
