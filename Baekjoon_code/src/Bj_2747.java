import java.util.Scanner;

public class Bj_2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = a+b;
		
		for (int i=2; i<=n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(c);
		sc.close();
	}
}
