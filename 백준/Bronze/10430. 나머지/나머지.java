import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        StringBuilder sb = new StringBuilder();

        sb.append((A+B)%C).append('\n');
        sb.append(((A%C) + (B%C))%C).append('\n');
        sb.append((A*B)%C).append('\n');
        sb.append(((A%C) * (B%C))%C);
        
        System.out.println(sb);
    }
}