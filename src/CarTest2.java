/* 
5.4생성자에서 다른 생성자 호출하기 - this(),this 
 
같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자간에도 서로 호출이 가능하다.
- 생성자 이름으로 클래스이름 대신 this를 사용한다.
- 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.

생성자에서 다른 생성자를 첫 줄에서만 호출이 가능핟록 한 이유는 생성자 내에서 초기화 작업도중에 다른생성자를 호출하게 되면,
호출된 다른 생성자 내에서도 멤버변수들의 값을 초기화할 것이므로 다른 생성자를 호출하기 이전의 초기화 작업이 무의미해질 수 있기 때문이다.
*/

//class Car {
//	String color;		// 색상
//	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
//	int door;			// 문의 개수
//
//	Car() {
//		this("white", "auto", 4);	
//	}
//
//	Car(String color) {
//		this(color, "auto", 4);
//	}
//	Car(String color, String gearType, int door) {
//		this.color    = color;
//		this.gearType = gearType;
//		this.door     = door;
//	}
//}
//
//class CarTest2 {
//	public static void main(String[] args) {
//		Car c1 = new Car();	
//		Car c2 = new Car("blue");
//
//		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
//		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
//	}
//}

/*
같은 클래스 내의 생성자들은 일반적으로 서로 관계가 깊은 경우가 많아서 
이처럼 서로 호출하도록 하여 유기적으로 연결해주면 더 좋은 코드를 얻을 수 있다.

Car생성자에 this.color는 인스턴스변수이고, color는 생성자의 매개변수로 정의된 지역변수로 서로 구별 가능하다.
이처럼 생성자의 매개변수로 인스턴스변수들의 초기값을 제공받는 경우가 많이 때문에 매개변수와 인스턴스 변수의 이름이 일치하는 경우가 자주 있다.
그 때는 매개변수이름을 다르게 하는 것보다 'this'를 사용해서 구별되도록 하는 것이 좋다.

'this'는 참조변수로 인스턴스 자신을 가리킴
'this'를 사용할 수 있는 것은 인스턴스멤버뿐
static메서드에서는 인스턴스멤버들을 사용할 수 없는 것처럼 'this'역시 사용 불가
왜냐면 인스턴스를 생성하지 않고도 static은 호출될 수 있으므로 
static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수도 있기 때문

사실 생성자를 포함한 인스턴스메서드에는 자신이 관련된 인스턴스를 가리키는 참조변수 'this'가 지역변수로 숨겨진 채 존재함
일반적으로 인스턴스메서드는 특정 인스턴스와 관련된 작업을 하기 때문에 자신과 관련된 인스턴스의 정보가 필요하지만,
static메서드는 인스턴스와 관련이 없는 작업을 하기 때문에 인스턴스에 대한 정보가 필요없다.
*/
