/*
5.5 �����ڸ� �̿��� �ν��Ͻ��� ����
�ϳ��� Ŭ�����κ��� ������ ��� �ν��Ͻ��� �޼���� Ŭ���������� ���� �����ϱ� ������
�ν��Ͻ� ���� ���̴�, �ν��Ͻ����� ���� �ٸ� ���� ���� �� �ִ� �ν��Ͻ� ���� ���̴�.

*/
//class Car {
//	String color;		// ����
//	String gearType;    // ���ӱ� ���� - auto(�ڵ�), manual(����)
//	int door;			// ���� ����
//
//	Car() {
//		this("white", "auto", 4);
//	}
//
//	Car(Car c) {	// �ν��Ͻ��� ���縦 ���� ������.
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
//		Car c2 = new Car(c1);	// c1�� ���纻 c2�� �����Ѵ�.
//		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
//		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
//
//		c1.door=100;	// c1�� �ν��Ͻ����� door�� ���� �����Ѵ�.
//		System.out.println("c1.door=100; ���� ��");
//		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
//		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
//	}
//}
/*
c2�� c1�� �����Ͽ� ������ ���̹Ƿ� ���� ���� ���¸� ������, ���� ���������� �޸𸮰����� �����ϴ� ������ �ν��Ͻ��̹Ƿ� c1�� ������  ����Ǿ c2�� ������ ���� �ʴ´�.
(Car c)�� �Ű������� �޴� �������� ��� ������ �ڵ带 Ȱ���� �� �ִ�. ��� Ȱ�� �����ұ�?

�ν��Ͻ��� ������ ������
� Ŭ������ �ν��Ͻ��� ��������, ������ Ŭ������ � �����ڷ� �ν��Ͻ��� ������ �� �����ؾ��Ѵ�.

InitTest
 */
