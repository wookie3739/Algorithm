import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    //메모이제이션
    public static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        int result = rect(n);

        bw.write((String.valueOf(result)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int rect(int n){
        if(n <= 2) return n;
        if(memo.containsKey(n)) return memo.get(n);
        int result = (rect(n - 1) + rect(n - 2)) % 10007;
        memo.put(n, result);
        return result;
    }
}
