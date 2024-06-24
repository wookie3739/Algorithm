import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        int original = N; // 원래 수 저장
        int count = 0; // 사이클 길이를 세는 변수
        
        do {
            // 주어진 수가 10보다 작으면 앞에 0을 붙여 두 자리 수로 만든다
            if (N < 10) {
                N = N * 10 + N;
            } else {
                int tens = N / 10; // 십의 자리 수
                int units = N % 10; // 일의 자리 수
                int sum = tens + units; // 각 자리의 숫자를 더함
                N = units * 10 + sum % 10; // 새로운 수를 만듦
            }
            count++; // 연산 횟수 증가
        } while (N != original); // 원래의 수로 돌아올 때까지 반복
        
        System.out.println(count); // 사이클의 길이 출력
    }
}