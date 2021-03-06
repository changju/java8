# Java8
## 4부 Stream
### 9. Stream API

  - 걸러내기
    - Filter(Predicate)
    - 예) 이름이 3글자 이상인 데이터만 새로운 스트림으로
  - 변경하기
    - Map(Function) 또는 FlatMap(Function)
    - 예) 각각의 Post 인스턴스에서 String title 만 새로운 스트림으로
    - 예) List<Stream<String>> 을 String의 스트림으로
  - 생성하기
    - generate(Supplier) 또는 Iterate(T seed, UnaryOperator)
    - 예) 10부터 1씩 증가하는 무제한 숫자 스트림
    - 예) 랜덤 int 무제한 스트림
  - 제한하기
    - limit(long) 또는 skip(long)
    - 예) 최대 5개의 요소가 담긴 스트림을 리턴한다.
    - 예) 앞에서 3개를 뺀 나머지 스트림을 리턴한다.

*** 
  - 스트림에 있는 데이터가 특정 조건을 만족하는지 확인
    - anyMatch(), allMatch(), nonMatch()
    - 예) k로 시작하는 문자열이 있는지 확인한다. (true또는 false를 리턴한다.)
    - 예) 스트림에 있는 모든 값이 10보다 작은지 확인한다.
  - 개수 세기
    - count()
    - 예) 10보다 큰 수의 개수를 센다.
  - 스트림을 데이터 하나로 뭉치기
    - reduce(identity, BiFunction), collect(), sum(), max()
    - 예) 모든 숫자 합 구하기
    - 예) 모든 데이터를 하나의 List또는 Set에 옮겨 담기
    