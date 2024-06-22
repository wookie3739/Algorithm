import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

        StringBuilder sb = new StringBuilder();

        sb.append(A + B);
        sb.append('\n');
        sb.append(A - B);
        sb.append('\n');
        sb.append(A * B);
        sb.append('\n');
        sb.append(A / B);
        sb.append('\n');
        sb.append(A % B);
        System.out.print(sb);

        
    }
}
