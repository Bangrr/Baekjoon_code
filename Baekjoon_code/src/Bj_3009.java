import java.util.Scanner;

public class Bj_3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int [4];
		int[] y = new int [4];
		for (int i=0; i<3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		if (x[0] != x[1]) {
			if (x[1] == x[2]) {
				x[3] = x[0];
			} else {
				x[3] = x[1];
			}
		} else {
			x[3] = x[2];
		}
		
		if (y[0] != y[1]) {
			if (y[1] == y[2]) {
				y[3] = y[0];
			} else {
				y[3] = y[1];
			}
		} else {
			y[3] = y[2];
		}
		System.out.println(x[3] + " " + y[3]);
		sc.close();
	}
}
