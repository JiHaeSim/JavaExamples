/*실행 결과가 어떻게 출력될 지 예상해보자*/
//ProductTest

class BlockTest {

	static { //클래스 초기화 블럭
		System.out.println("static { }");
	}

	{		// 인스턴스 초기화 블럭
		System.out.println("{ }");
	}

	public BlockTest() {     
		System.out.println("생성자");
	}

	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}