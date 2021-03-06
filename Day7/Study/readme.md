# 2017년 5월 17일 스터디
*github(github.com/kdh7337)에서 안되는 소스코드는 고쳐서 쓸 것(테스트 안하고 업로드 됨.)*

## 자료구조
  알고리즘을 효율적으로 만들기 위함.
  회사 면접에서 필수(자료구조 구현, 사전적 알고리즘문제 풀이)

  알고리즘의 선행구조. 자료구조를 알면 저장이 가능하기 때문.

## 자료구조를 공부하려면

  스텍, 큐, 덱, 리스트 같은 자료구조를 무조건 넣고 문제를 풀어볼 것.(ex : 코드파이트)
  재귀도 많이 써보고, 많이 생각해볼 것.
  강사님이 알려주는 코드는 많이 쳐보자.

## 기본 자료구조

  1. 선형 자료구조 : 배열 등
  2. 비선형 자료구조

## 선형 자료구조   

  1. 순차적 자료배열 : 기본적 자료배열
    - 물리적 공간과 논리적 공간이 같다.

##링크드 리스트(Linked List) : 연결자료구조

      하나의 원소가 자기와 연결된 원소의 주소를 가지고 있다.
      노드 : 원소의 주소를 갖는 단위구조.
      물리적 공간이 논리적 공간과 달라질 수 있음.
      유연성을 갖고 있음.
      뒤에서 몇번째라는 개념을 갖고 있으며, 검색의 속도가 단방향으로 했을 때보다 훨씬 빠르다.

## 제네릭

  치환과정을 없애려고 짜는 것.

## Garbage Collector 활동

    시스템 자원상 최적상태를 감지하여 활동하기 떄문에 정확한 활동시간은 알 수 없다.


## 스택

### 스택의 특징

  후입선출 구조(Last-In-First-Out) -> 가장 위의 값을 저장함.

### 스택의 종류

  1. 고정길이 스택 : 순차 자료구조로 구현 가능
  2. 가변길이 스택 : 연결리스트로 구현 가능

### 스택의 용례

  소스코드가 실행되는 구조가 스택구조.(시스템 스택)
  페어나 역순 검사(예 : 괄호 검사.)


## 큐(Queue)

  Rear로 들어와 Front로 나간다. -> Front와 Rear를 가리키고 있음.
  선입선출 방식(First-In-First-Out)

## 덱

  스택과 큐의 모든 성질을 가지고 있다.
  Front와 Rear 모두에서 추가할 수 있다.
  push(), pop(), enQueue(), deQueue() 모두를 구현하면 된다.


## 래퍼클래스(Wrapper Class)
    기본형(int 등)을 감싸고 있는 자료형(Integer 등)

    제네릭 사용시 기본형을 쓸 수 없음.


##     
