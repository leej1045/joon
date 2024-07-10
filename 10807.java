
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int c = 0;
        int[] arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());;

        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                c++;
            }
        }
        System.out.println(c);

        br.close();
        bw.flush();
        bw.close();
    }
}
