import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String num1 = input[0];
        String num2 = input[1];

        int reversedNum1 = reverseNumber(num1);
        int reversedNum2 = reverseNumber(num2);

        bw.write(String.valueOf(Math.max(reversedNum1, reversedNum2)));
        br.close();
        bw.flush();
        bw.close();
    }

    private static int reverseNumber(String num) {
        StringBuilder reversed = new StringBuilder(num).reverse();
        return Integer.parseInt(reversed.toString());
    }
}
