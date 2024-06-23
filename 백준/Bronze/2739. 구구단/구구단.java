import java.io.BufferedReader;
import java.io.InputStreamReader;

//구구단
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        for(int i = 1; i <= 9; i++){
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}