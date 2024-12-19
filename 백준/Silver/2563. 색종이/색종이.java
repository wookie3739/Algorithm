import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] paper = new boolean[100][100]; // 도화지의 크기는 100x100 고정

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int totalArea = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int bottom = Integer.parseInt(st.nextToken());

            // 색종이의 범위는 (left, bottom)부터 (left + 9, bottom + 9)까지의 10x10 크기
            for (int x = left; x < left + 10; x++) {
                for (int y = bottom; y < bottom + 10; y++) {
                    if (!paper[x][y]) { // 이전에 색종이가 덮지 않은 영역이라면
                        paper[x][y] = true; // 색종이를 붙였다는 표시
                        totalArea++; // 총 면적에 1을 더함
                    }
                }
            }
        }

        bw.write(String.valueOf(totalArea));
        bw.flush();
        br.close();
        bw.close();
    }
}
