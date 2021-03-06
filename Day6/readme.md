# 2017년 5월 16일 강의내용

## 다형성

    같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질.
    다향성을 위해 자바는 부모 클래스로 타입 변환을 허용하여 객체의 부품화를 가능하게 한다.
    (=부모 타입에 모든 자식 객체가 대입될 수 있다.)

### 왜 다형성을 쓰는가?
    타입을 대체함으로서 핵심 기능만 사용할 수 있도록 해주기 때문.


### 용례

    (부모 클래스 : Father, 자식 클래스 : Son 호출 시)
    '''java
    Father son = new Son();
    son.setName("쥬니어");

    -> Son에만 반영됨.

    부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근 가능.
    단, 메소드가 자식 클래스에서 오버라이딩 되었다면 자식 클래스의 메소드가 대신 호출.

## POJO 클래스

  Plain Old Java Object(평범한 자바 객체)의 약자. 간단한 자바 오브젝트.

### POJO 클래스의 특징

   1. 클래스의 상속을 강제하지 않는다.
   2. 인터페이스 구현을 강제하지 않는다.
   3. 어노테이션 사용을 강제하지 않는다.

### POJO 클래스의 필수요소

    1. 가볍게(Light-weight)
    2. 유연하게(Flexible)
    3. 간단하고 명료하게(Simple)


## 예외와 예외처리


### 예외

  프로그램이 강제종료 되는 것을 오류라고 하며, 이런 실행시간 오류들 중에 JVM에서 유형이 이미 정의되어 있는 모든 유형을 예외라고 한다.

### 오류

  JAVA에 정의되어 있지 않은 모든 오류 (예외를 제외한 모든 오류)

### 예외처리

    1. try와 catch
    try문 안의 수행 문장에서 예외 발생하면 catch 수행

    try{    
    } catch(예외 1){
      //TODO
    } catch(예외 2){
      //TODO
    }

    2. finally
    예외가 있더라도 반드시 실행되어 결과값을 제출

    finally {
      //TODO
    }







### 기타
  전역변수를 지역변수보다 우선적으로 가리키기 때문에 this 예약어를 사용함.
