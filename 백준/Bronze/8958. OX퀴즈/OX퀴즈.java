import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            String input = br.readLine();
            int score = 0;
            int consecutive = 0;

            for (char ch : input.toCharArray()) {
                if (ch == 'O') {
                    consecutive++;
                    score += consecutive;
                } else {
                    consecutive = 0;
                }
            }

            bw.write(score + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
