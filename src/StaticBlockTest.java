/*
����� �ʱ�ȭ�� ���� �迭 arr�� �����ϰ�, Ŭ���� �ʱ�ȭ ���� �̿��ؼ� �� ��ҵ��� random()�� ����ؼ� ������ ������ ä�쵵�� �ߴ�.
��ó�� �迭�̳� ����ó���� �ʿ��� �ʱ�ȭ������ ����� �ʱ�ȭ�����δ� ������ �ʱ�ȭ�۾��� �� �� ����. 
�̷� ��쿡 �߰������� Ŭ���� �ʱ�ȭ ���� ����ϵ��� �Ѵ�.
�� ����: �ν��Ͻ������� ������ �ʱ�ȭ�� ������ �Ǵ� �ν��Ͻ��ʱ�ȭ ���� ����Ѵ�. ��
*/
class StaticBlockTest 
{
	static int[] arr = new int[10];

	static {
		for(int i=0;i<arr.length;i++) {
			// 1�� 10������ ������ ���� �迭 arr�� �����Ѵ�.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String args[]) {
		for(int i=0; i<arr.length;i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}