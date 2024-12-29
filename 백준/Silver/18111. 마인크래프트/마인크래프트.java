import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 마인크래프트_18111
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가로 N, 세로 M 크기의 집터(0,0 시작)
        // 첫째 줄에 N(가로), M(세로), B(인벤토리에 B개의 블록이 들어있음)
        // 블록을 제거해서 인벤토리에 넣을 경우 2초가 걸림
        // 인벤토리에서 블록을 가져와서 1초가 걸림
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        // 배열에 데이터 넣기
        int maxBlock = Integer.MIN_VALUE;
        int minBlock = Integer.MAX_VALUE;
        int totalBlockCount = 0;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                totalBlockCount += arr[i][j];  // 전체 블록 수 계산
                maxBlock = Math.max(maxBlock, arr[i][j]);
                minBlock = Math.min(minBlock, arr[i][j]);
            }
        }

        int remainBlock = B;
        int count = Integer.MAX_VALUE;
        int resultHeight = 0;  // 최적 높이를 기록할 변수

        // 최소 높이부터 최대 높이까지 모든 경우에 대해 검사
        for (int targetHeight = minBlock; targetHeight <= maxBlock; targetHeight++) {
            int removeBlock = 0;
            int addBlock = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[i][j] > targetHeight) {
                        removeBlock += arr[i][j] - targetHeight;  // 블록 제거
                    } else if (arr[i][j] < targetHeight) {
                        addBlock += targetHeight - arr[i][j];  // 블록 추가
                    }
                }
            }

            // 인벤토리에 블록이 충분한지 체크
            if (removeBlock + remainBlock >= addBlock) {
                int time = removeBlock * 2 + addBlock;  // 제거는 2초, 추가는 1초 걸림
                if (time <= count) {
                    count = time;  // 최소 시간 업데이트
                    resultHeight = targetHeight;  // 최적 높이 저장
                }
            }
        }

        System.out.println(count + " " + resultHeight);
        br.close();
    }
}
