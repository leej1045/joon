import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int [] arr = new int[10];
		
		for(int i = 1; i < 10; i++ ) {
			arr[i] = sc.nextInt();	
		}
		
		int max = arr[0];
		int a = 0;
		
		for(int i =1; i < 10; i++) {
			if(arr[i] > max) {
				max = arr[i];
				a = i;
			}
		
		}
		System.out.print(max + "\n");
		System.out.print(a+"\n");
	}
}
