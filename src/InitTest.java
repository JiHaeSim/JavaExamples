/*
6.1 변수의 초기화
멤버변수는 초기화를 하지 않아도 자동적으로 변수의 자료형에 맞는 기본값으로 초기화가 이루어지므로 초기화하지 않고 사용해도 되지만,
지역 변수는 사용전에 반드시 초기화해야 한다.

아래 코드에서 x,y는 인스턴스 변수이고, i,j는 지역 변수이다.
몇 번째 줄에서 에러가 발생할까?

멤버변수(클래스변수와 인스턴스변수)와 배열의 초기화는 선택적이지만, 지역변수의 초기화는 필수적이다.

<변수의 초기화>
- 같은 타입의 변수는 콤마(,)를 사용해서 함께 선언하거나 초기화 할 수 있다.
- 먼저 초기화된 변수를 다른 변수의 초기화에 사용할 수 있다.

<멤버변수의 초기화방법>
- 명시적 초기화
- 생성자
- 초기화 블럭(인스턴스 초기화 블럭, 클래스 초기화 블럭)

CarInitTest
 */

//public class InitTest {
//	int x;
//	int y = x;
//	
//	void method1() {
//		int i;
//		int j=i;
//	}
//}
