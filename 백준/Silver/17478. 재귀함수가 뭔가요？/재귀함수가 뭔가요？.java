import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//재귀함수가뭔가요_17478
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        solve(0, N); // 재귀 시작
    }

    public static void solve(int depth, int N) {
        // 현재 depth에 맞는 "____" 문자열을 만들어줍니다.
        String underline = "____".repeat(depth);

        // 기저 조건: depth가 N에 도달하면 더 이상 재귀하지 않고 답변을 출력
        if (depth == N) {
            System.out.println(underline + "\"재귀함수가 뭔가요?\"");
            System.out.println(underline + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(underline + "라고 답변하였지.");
            return;
        } else {
            System.out.println(underline + "\"재귀함수가 뭔가요?\"");
            System.out.println(underline + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(underline + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(underline + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

            // 재귀적으로 다음 깊이로 들어감
            solve(depth + 1, N);

            // 재귀에서 돌아오면 이 부분이 출력됨
            System.out.println(underline + "라고 답변하였지.");
        }
    }
}
