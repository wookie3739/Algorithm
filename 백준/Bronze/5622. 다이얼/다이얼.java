import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int sum = 0;

        for(char ch : input.toCharArray()){
            if(ch == 'A' || ch == 'B' || ch == 'C'){
                sum += 3;
            }else if(ch == 'D' || ch == 'E' || ch == 'F'){
                sum += 4;
            }else if(ch == 'G' || ch == 'H' || ch == 'I'){
                sum += 5;
            }else if(ch == 'J' || ch == 'K' || ch == 'L'){
                sum += 6;
            }else if(ch == 'M' || ch == 'N' || ch == 'O'){
                sum += 7;
            }else if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S'){
                sum += 8;
            }else if(ch == 'T' || ch == 'U' || ch == 'V'){
                sum += 9;
            }else{
                sum += 10;
            }
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
