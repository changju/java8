# Java8
## 7부 CompletableFuture
### 18. CompletableFuture 2

  - 조합하기
    - thenCompose(): 두 작업이 서로 이어서 실행하도록 조합
    - thenCombine(): 두 작업을 독립적으로 실행하고 둘 다 종료 했을 때 콜백 실행
    - allOf(): 여러 작업을 모두 실행하고 모든 작업 결과에 콜백 실행
    - anyOf(): 여러 작업 중에 가장 빨리 끝난 하나의 결과에 콜백 실행

  - 예외처리
    - exeptionally(Function)
    - handle(BiFunction)

  - 참고
    - https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ForkJoinPool.html
    - https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
