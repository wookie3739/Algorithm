import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//참외밭_2477
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 참외 개수
        int N = Integer.parseInt(br.readLine());

        // 방향과 길이를 저장할 배열
        int[] directions = new int[6];
        int[] lengths = new int[6];

        // 입력 받기
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            directions[i] = Integer.parseInt(st.nextToken());
            lengths[i] = Integer.parseInt(st.nextToken());
        }

        // 큰 직사각형의 가로와 세로를 구함
        int maxWidth = 0, maxHeight = 0;
        for (int i = 0; i < 6; i++) {
            if (directions[i] == 1 || directions[i] == 2) { // 가로 방향
                maxWidth = Math.max(maxWidth, lengths[i]);
            } else if (directions[i] == 3 || directions[i] == 4) { // 세로 방향
                maxHeight = Math.max(maxHeight, lengths[i]);
            }
        }

        // 작은 직사각형의 가로와 세로 구하기
        int smallWidth = 0, smallHeight = 0;
        for (int i = 0; i < 6; i++) {
            // 인접한 두 변의 곱이 작은 직사각형의 넓이가 됨
            if (lengths[i] * lengths[(i + 1) % 6] == maxWidth * maxHeight) {
                // 작은 직사각형의 가로와 세로를 결정
                smallWidth = lengths[(i + 3) % 6];
                smallHeight = lengths[(i + 4) % 6];
                break;
            }
        }

        // 넓이 계산
        int result = ((maxWidth * maxHeight) - (smallWidth * smallHeight)) * N;

        System.out.println(result);
        br.close();
    }
}
