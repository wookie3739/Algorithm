import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//제로 10773
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < K; i++){
            int input = Integer.parseInt(br.readLine());
            if(input != 0){
                stack.push(input);
            }else{
                stack.pop();
            }
        }

        int sum = stack.stream().mapToInt(Integer::intValue).sum();

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
