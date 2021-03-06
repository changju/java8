# The Java8
## 2부 함수형 인터페이스와 람다 표현식
### 3. 자바에서 제공하는 함수형 인터페이스

  - Java가 기본으로 제공하는 함수형 인터페이스
    - [java.util.function 패키지](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
    - 자바에서 미리 정의해둔 자주 사용할만한 함수 인터페이스
    - Function<T,R>
    - BiFunction<T,U,R>
    - Consumer<T>
    - Supplier<T>
    - Predicate<T>
    - UnaryOperator<T>
    - BinaryOperator<T>
  - Function<T,R>
    - T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
      - R apply(T t)
    - 함수 조합용 메소드
      - andThen
      - compose
  - BiFunction<T, U, R>
    - 두 개의 값(T,U)를 받아서 R 타입을 리턴하는 함수 인터페이스
      - R apply(T t, U u)
  - Consumer<T>
    - T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
      - void Accept(T t)
    - 함수 조합용 메소드
      - andThen
  - Supplier<T>
    - T 타입의 값을 제공하는 함수 인터페이스
      - T get()
  - Predicate<T>
    - T 타입을 받아서 boolean 을 리턴하는 함수 인터페이스
      - boolean test(T t)
    - 함수 조합용 메소드
      - And
      - Or
      - Negate
  - UnaryOperator<T>
    - Function<T, R> 의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
  - BinaryOperator<T>
    - BiFunction<T, U, R> 의 특수한 형태로, 동일한 타입의 입력 값 두개를 받아 리턴하는 함수 인터페이스