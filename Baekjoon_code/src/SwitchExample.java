public class SwitchExample {
	public static void main(String[] args) {
		double ran = Math.random();
		int num = (int)(ran*6) + 1;
//		int num = (int)(Math.random()*6)+1;
		
		System.out.println(ran);
		System.out.println(ran*6);
		System.out.println((int)(ran*6));
		System.out.println(num);
		System.out.println();
		
		switch(num) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�");
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�");
			break;
		case 6:
			System.out.println("6���� ���Խ��ϴ�");
			break;	
		}
	}
}