# 요구 사항 분석

다중 통화를 지원하는 보고서

## 기능 명세 사항

- ~~**환율 변환 기능**~~
- 환율의 비율에 따른 환전기능
- ~~**Dollor 클래스 문제 사항**~~
  - Dollor객체를 가지고 테스트를 진행할경우 현재상황에선 자기생성자를 통해주입받는순간 그 초기값으로 고정되어버리는 문제발생
  - 이를 해결하기 위해 인터페이스화 시킨다.

## 책에서 말하는 요구 사항

- $5 + 10CHF = 10$

- $5 * 2 = 10$

- 인스턴스 변수 private으로 생성

- ~~**Dollor 클래스의 부작용**~~

- Money = 환율 반올림?

- **equals()**