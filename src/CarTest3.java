/*
5.5 생성자를 이용한 인스턴스의 복사
하나의 클래스로부터 생성된 모든 인스턴스의 메서드와 클래스변수는 서로 동일하기 때문에
인스턴스 간의 차이는, 인스턴스마다 각기 다른 값을 가질 수 있는 인스턴스 변수 뿐이다.

*/
//class Car {
//	String color;		// 색상
//	String gearType;    // 변속기 종류 - auto(자동), manual(수동)
//	int door;			// 문의 개수
//
//	Car() {
//		this("white", "auto", 4);
//	}
//
//	Car(Car c) {	// 인스턴스의 복사를 위한 생성자.
//		color    = c.color;
//		gearType = c.gearType;
//		door     = c.door;
//	}
//
//	Car(String color, String gearType, int door) {
//		this.color    = color;
//		this.gearType = gearType;
//		this.door     = door;
//	}
//}
//class CarTest3 {
//	public static void main(String[] args) {
//		Car c1 = new Car();
//		Car c2 = new Car(c1);	// c1의 복사본 c2를 생성한다.
//		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
//		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
//
//		c1.door=100;	// c1의 인스턴스변수 door의 값을 변경한다.
//		System.out.println("c1.door=100; 수행 후");
//		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
//		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
//	}
//}
/*
c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만, 서로 독립적으로 메모리공간에 존재하는 별도의 인스턴스이므로 c1의 값들이  변경되어도 c2는 영향을 받지 않는다.
(Car c)를 매개변수로 받는 생성자의 경우 기존의 코드를 활용할 수 있다. 어떻게 활용 가능할까?

인스턴스를 생성할 때에는
어떤 클래스의 인스턴스를 생성할지, 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 지 결정해야한다.

InitTest
 */
