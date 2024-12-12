//분수찾기 1193

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int line = 0; // 몇 번째 대각선인지 파악
        int maxNum = 0; // 그 대각선의 최대값이 몇?

        // 1. 몇 번째 대각선(line)인지 찾기
        while(maxNum < X){
            line++;
            maxNum += line; // 1, 3, 6, 10, 15, 21 ....
        }

        // 2. 몇 번째 대각선의 몇 번째 숫자인지 찾기(인덱스)
        int indexLine = X - (maxNum - line); // 해당 대각선의 몇 번째 숫자인지? X = 6일 경우 maxNum = 6, line = 3, indexLine = 3(3번 째 인덱스)
        
        // 3. 홀수인지 짝수인지 찾고 계산
        int numerator, denominator;
        if(line % 2 == 1){
            numerator = line - indexLine + 1;
            denominator = indexLine;
        }else{
            numerator = indexLine;
            denominator = line - indexLine + 1;
        }
        bw.write(numerator + "/" + denominator);
        bw.flush();
        bw.close();
        br.close();
    }
}
