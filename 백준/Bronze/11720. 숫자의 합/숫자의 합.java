import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine()); // 숫자 입력 받기

        String input = br.readLine(); // 리터럴 스트링 입력 받기

        int sum = 0;
        // 입력받은 리터럴 스트링에서 각 문자를 숫자로 변환하여 합산
        for (int i = 0; i < num; i++) {
            char ch = input.charAt(i); // 문자열에서 한 글자씩 가져오기
            int number = Character.getNumericValue(ch); // 문자를 숫자로 변환
            sum += number; // 합산
        }

        // 결과 출력
        bw.write(Integer.toString(sum));
        bw.newLine(); // 개행 추가 (필요시)
        
        bw.close();
        br.close();
    }
}