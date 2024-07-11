import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] age = new int[9];

        for (int i = 0; i < age.length; i++) {
            age[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        // 7개의 난쟁이 합이 100
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - age[i] - age[j] == 100) {
                    List<Integer> list = new ArrayList<>();
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            list.add(age[k]);
                        }
                    }
                    Collections.sort(list);
                    for (int result : list) {
                        bw.write(result + "\n");
                    }
                    bw.close();
                    br.close();
                    return;
                }
            }
        }
    }
}
