import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class main{
	public static void main(String[] args)throws IOException{
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 	
    
	int a = Integer.parseInt(br.readLine());
	StringTokenizer st;
    
	for(int i = 1 ; i <= a; i++) {
    
		st = new StringTokenizer(br.readLine()," ");
		
    int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
	  int d = b + c;
		
    bw.write("Case #" + i +": " + d + "\n");
		}
	bw.close();
	}
}
