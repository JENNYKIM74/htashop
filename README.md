# htashop
# Semi-project ( 남여공용 의류 쇼핑몰)
![htashop 로고](https://user-images.githubusercontent.com/94974378/155485363-4bd72aac-0473-4f63-a3d8-3a9a02af27f4.PNG)

![수행작업](https://user-images.githubusercontent.com/94974378/155485738-9416e324-c1c9-433a-ab37-4a17f637cb3a.PNG)

## MVC Model1 기반으로 작업 진행
### 작업 환경
- 운영체제: windows 10
- IDE: eclipse 2021-06 (4.20.0)
- 데이터베이스:  Oracle Database(개인db)
- 웹애플리케이션 서버: Tomcat 9.0.56, Tomcat 10.0.14
- SQL 개발툴: Oracle SQL Developer 
- 형상관리도구 : Git, SourceTree
- 백엔드 개발: JAVA, JSP, SQL, JavaScript
- 프론트엔드 개발: HTML, CSS, Bootstrap

## 기술스택
<img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white">
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">
<img src="https://img.shields.io/badge/html-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">

### ERD
![erdcloud](https://user-images.githubusercontent.com/94974378/155486939-2e34f2c0-d42e-4de5-a4fc-e0156a8e6cf0.PNG)


### 맡은 역할
- 상품 상세 페이지의 장바구니담기 기능 구현
- 장바구니 페이지 
    장바구니 속 상품의 이미지, 상품명, 상품가격, 수량,  예상적립금, 결제금액, 총주문금액, 보유포인트를 조회.
    상품수량 변경, 사용할 포인트 입력 구현
- 주문하기 페이지
  회원정보(이름, 등급, 전화번호, 주소),주문할 상품, 결제금액, 총 사용할 포인트 조회
- 주문완료 페이지
![장바구니 주문하기페이지](https://user-images.githubusercontent.com/94974378/155488691-6ad455a0-32c2-44f7-99a7-ee317f29442e.PNG)


### 구현 목적
0. model1방식의 웹사이트 구현
1. singleton객체를 사용하여, 메모리 효율성을 높임
2. CRUD 구현 
3. 부트스트랩과 기본 HTML,CSS로 구현

### 작업 후기
이번 세미프로젝트는 처음으로 하는 프로젝트이다보니, 처음에는 팀원들 모두 무엇부터 해야할지 갈피를 못잡는 상황이었다.
하지만, 팀원들 모두 다같이 한단계씩 알아가면서 , Figma, 스프레드시트, ErdCloud, ERModelDiagram 등의 다양한 툴을 통해 프로젝트를 진행해나갈 수 있었다. 
이번프로젝트에서는 수업시간에 배웠던 Model1 방식, CRUD 구현, Singleton객체 활용을 직접 구현해보는 것이 목적이었는데, 그 목적을 달성할 수 있었다.
DB설계를 직접해보는 것이 다들 처음이라, 부족한 부분이 있었지만, 이를 계기로 파이널때는 더 나은 실력으로 DB설계를 진행할 수 있을 것이라고 생각된다.
팀원 모두들 자신이 맡은 역할을 열심히 해주고, 서로 부족한 부분들을 도와가며 프로젝트를 진행했기에, 프로젝트가 잘 마무리할 수 있었던 것 같다.

