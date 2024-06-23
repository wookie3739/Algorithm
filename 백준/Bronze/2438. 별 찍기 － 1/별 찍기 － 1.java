import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//별 찍기
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        Stack<String>[] stacks = new Stack[N];
        for (int i = 0; i < N; i++) {
            stacks[i] = new Stack<>();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                stacks[i].push("*");
            }
        }

        for (int i = 0; i < N; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print(stacks[i].pop());
            }
            System.out.println();
        }
    }
}