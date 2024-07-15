import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
    	
    	int a = Integer.parseInt(st.nextToken());
    	st = new StringTokenizer(br.readLine()," ");
    	
    	int [] arr = new int[a];
    
    	for(int i = 0; i < a; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	int max = arr[0];
    	int min = arr[0];
    	
    	for (int i = 0; i < arr.length; i++) {
    		if(arr[i] > max) {
    			max = arr[i];
    		}
    		if (arr[i] < min) {
    			min = arr[i];	
    		}   	
    	}
    	bw.write(min+" "+max);
    	
        br.close();
        bw.flush();
        bw.close();
    }
}
