import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//토너먼트
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 2, 3 4, 5 6, 7 8, 9 10, 11 12, 13 14, 15 16
    //      1    2    3    4    5      6      7      8
    //      1    4    5    8
    //         1        2 (4번) 8,9일 때

    String[] str = br.readLine().split(" ");

        int round = Integer.parseInt(str[0]);  
        int jimin = Integer.parseInt(str[1]);  
        int hansu = Integer.parseInt(str[2]);  

        int count = 0;

        // 1000, 35000일 때
        // 500 250 125 63 32 16 8 4 2
        // 17500 8750 4374 2196 1048 524 262 130 65 33 17 9 5 3 2 1

        while(jimin != hansu){
            
            jimin = jimin/2 + jimin%2;
            hansu = hansu/2 + hansu%2;
            count++;

        }
        bw.write(count + "\n");
        bw.close();
        br.close();

    }
}
