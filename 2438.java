import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String sr = "*";
		for (int i = 1 ; i <= a; i++) {
			
			bw.write(sr + "\n");
			sr= sr +"*"; 
		}
		bw.close();
	}
}
