import java.util.Scanner;

public class Bj_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		a += c/60;
		b += c%60;
		if (b >= 60) {
			b -= 60;
			a += 1;
		}
		if (a >= 24) {
			a -= 24;
		}
		
		System.out.println(a + " " + b);
		sc.close();
	}
}
