import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine().trim());

        int[] numbers = new int[a];

        for(int i = 0; i < numbers.length; i++){

           numbers[i] = Integer.parseInt(br.readLine().trim());

        }

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();

        for(int number : numbers){

            sb.append(number).append("\n");

        }
        bw.write(sb.toString());
        bw.close();
        br.close();




    }
}
