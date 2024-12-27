import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//열개씩끊어출력하기_11721
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(count % 10 == 0 && count > 0){
                System.out.println();
            }
            System.out.print(input.charAt(i));
            count++;
        }
        br.close();
     }
}
