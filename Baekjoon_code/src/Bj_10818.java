import java.util.Scanner;

public class Bj_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		
		for(int i=0; i<n; i++) {
			if (max < array[i]) {
				max = array[i];
			} else if (min > array[i]){
				min = array[i];
			}
		}
		System.out.printf("%d %d", min, max);
		sc.close();
	}
}