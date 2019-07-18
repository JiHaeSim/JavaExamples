/*
6.3 초기화블럭
초기화 블럭 내에는 메서드 내에서와 같이 조건문, 반복문, 예외처리구문 등을 자유롭게 사용할 수 잇으므로, 
초기화 작업이 복잡하여 명시적 초기화만으로는 부족한 경우 초기화 블럭을 사용한다.

클래스 초기화 블럭은 클래스가 메모리에 처음 로딩될 때 한번만 수행되며, 인스턴스 초기화 블럭은 생성자와 같이 인스턴스를 생성할 때마다 수행된다.
그리고 생성자보다 인스턴스 초기화 블럭이 먼저 수행된다는 사실도 기억해두자.
※ 참고: 클래스가 처음 로딩될 때 클래스 변수들이 자동적으로 메모리에 만들어지고, 곧바로 클래스 초기화블럭이 클래스변수들을 초기화하게 되는 것이다. ※
*/
//public class CarInitTest {
//	int count;
//	int serialNo;
//	String color;
//	String gearType;
//	CarInitTest() {
//		count++;
//		serialNo = count;
//		color = "White";
//		gearType = "Auto";
//	}
//	CarInitTest(String color, String gearType){
//		count++;
//		serialNo = count;
//		this.color = color;
//		this.gearType = gearType;
//	}
//}

//public class CarInitTest {
//	int count;
//	int serialNo;
//	String color;
//	String gearType;
//	{
//		count++;
//		serialNo = count;
//	}
//	CarInitTest() {
//		color = "White";
//		gearType = "Auto";
//	}
//	CarInitTest(String color, String gearType){
//		this.color = color;
//		this.gearType = gearType;
//	}
//}

/*
 이처럼 코드의 중복을 제거하는 것은 코드의 신뢰성을 높여주고, 오류의 발생 가능성을 줄여준다는 장점이 있다.
즉, 재사용성을 높이고 중복을 제거하는 것, 이것이 바로 객체지향 프로그래밍이 추구하는 궁극적인 목표이다.

BlockTest
*/
