import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int a = Integer.parseInt(str);

        int[] numbers = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int min = numbers[0];
        for(int i = 1; i < a; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        int max = numbers[0];
        for (int i = 1; i < a; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.print(min + " " + max);


    }
}
