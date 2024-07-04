import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int m = 0;
    	int j = 0;
    	if(a == b && c == b && a == c){
    		m =+ 10000 + (a * 1000);
    		System.out.println(m);
    	}
    	else if(a == b || b == c || c == a){
    		if(a == b){
    			m =+ 1000 + a * 100;
    			System.out.println(m);
    		}
    		else if(a == c){
    			m =+ 1000 + a * 100;
    			System.out.println(m);
    		}
    		else if(b == c){
    			m =+ 1000 + b * 100;
    			System.out.println(m);
    		}
    	}
    	else {
    		if(a < b && c < b){
    			int m1 = b;
    			int j1 = m1 * 100;
    			System.out.println(j1);
    		}
    		else if(b < c && a < c){
    			int m1 = c;
    			int j1 = m1 * 100;
    			System.out.println(j1);
    		}
    		else if(b < a && c < a){
    			int m1 = a;
    			int j1 = m1 * 100;
    			System.out.println(j1);
    	}

    	}
    }
}
