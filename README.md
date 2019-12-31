# Delivery Service
시니어(노인)가 백화점 물품을 배달 서비스해주는 중개 플랫폼 서버 입니다.  
시니어 백화점 물품 배달 서비스를 계획하게된 이유는  
- 소비자에게 옷 수선이나 사이즈 변경, 단순 물품(식료품 제외) 구매 등 간단한 주문을 값싸게 물품 전달해줄 사람이 필요하며,  
- 시니어 분들의 경우 하나의 사업장에서 현장 접수 받고 이동하는 것이 아니라 중개 플랫폼을 활용함으로써 효율적인 시간관리가 가능하게 만들기 위함입니다.  
</br>  

## 프로젝트 주요 기능
- 고객 및 배달원 매칭
  - 고객이 물품에 대한 출발지(백화점) 및 도착지 주소를 등록 후 배달원과 매칭될 수 있도록 시스템 개발
- 배달 거리에 따라 배달 금액 설정
  - 고객이 신청한 배달 거리에 따라 금액 변동
- 배달원 정산 시스템 구축
  - 배달원들의 실시간 정산 시스템 구축
- 배달현황 안내
  - 배달 상황에 따라 안내 내용 전달(ex. 배달 준비중 -> 배달 출발 -> 배달 완료)
</br>  

## 사용 기술
Spring Boot, Maven, Mybatis, Redis, Java8  
</br>  

## 기술적인 집중 요소
- 무분별한 코드 작성이 아닌 의미 있는 코드 작성 지향. '이펙티브 자바' 내용 참고
- 라이브러리 및 기능 추가 시 이유있는 선택과 사용 목적 고려
