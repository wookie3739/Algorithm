import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < input.length - 1; i++) {
            int current = Integer.parseInt(input[i]);
            int next = Integer.parseInt(input[i + 1]);

            if (current < next) {
                isDescending = false;
            } else if (current > next) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        br.close();
    }
}
