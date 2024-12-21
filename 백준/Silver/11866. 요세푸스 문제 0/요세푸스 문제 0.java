import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        bw.write("<");
        int index = 0;

        while (!list.isEmpty()) {
            index = (index + K - 1) % list.size(); // 리스트 크기를 고려해 현재 index 계산
            bw.write(list.remove(index).toString()); // 제거된 요소 출력
            
            if (!list.isEmpty()) {
                bw.write(", "); // 리스트에 요소가 남아있으면 쉼표 출력
            }
        }

        bw.write(">");
        bw.flush();
        bw.close();
        br.close();
    }
}
