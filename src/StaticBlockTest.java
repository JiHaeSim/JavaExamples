/*
명시적 초기화를 통해 배열 arr을 생성하고, 클래스 초기화 블럭을 이용해서 각 요소들을 random()을 사용해서 임의의 값으로 채우도록 했다.
이처럼 배열이나 예외처리가 필요한 초기화에서는 명시적 초기화만으로는 복잡한 초기화작업을 할 수 없다. 
이런 경우에 추가적으로 클래스 초기화 블럭을 사용하도록 한다.
※ 참고: 인스턴스변수의 복잡한 초기화는 생성자 또는 인스턴스초기화 블럭을 사용한다. ※
*/
class StaticBlockTest 
{
	static int[] arr = new int[10];

	static {
		for(int i=0;i<arr.length;i++) {
			// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String args[]) {
		for(int i=0; i<arr.length;i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}