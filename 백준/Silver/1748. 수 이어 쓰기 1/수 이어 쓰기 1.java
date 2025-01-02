import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//수이어쓰기_1748_구현
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //메모리 초과 코드
        // StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // for(int i = 1; i <= N; i++){
        //     sb.append(i);
        // }
        // System.out.println(sb.toString().length());

        int length = 0; // 전체 길이
        int start = 1; // 시작 숫자
        int digit = 1; // 자릿수

        while(start <= N){
            int end = (start * 10) - 1;

            if(end > N){
                end = N;
            }

            length += (end - start + 1) * digit;

            //다음 자릿수로 넘어가기
            start *= 10;
            digit++;
        }
        System.out.println(length);
    }
}