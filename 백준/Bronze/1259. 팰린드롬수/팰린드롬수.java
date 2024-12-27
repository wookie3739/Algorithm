import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팰린드롬수_1259
public class Main {    
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            String input = br.readLine();

            if(input.equals("0")){
                break;
            }

            String reversed = new StringBuilder(input).reverse().toString();

            if(input.equals(reversed)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
     }
}
