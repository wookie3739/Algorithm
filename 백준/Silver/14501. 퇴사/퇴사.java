import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//퇴사
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine().trim());

        int[] T = new int[num + 1];
        int[] P = new int[num + 1];
        // 현재의 값으로 미래의 값을 구해야하기 때문에 + 1
        int[] dp = new int[num + 2];

        for (int i = 1; i <= num; i++) {
            String[] strArr = br.readLine().split(" ");
            T[i] = Integer.parseInt(strArr[0]);
            P[i] = Integer.parseInt(strArr[1]);

        }
        // 다이나믹 프로그래밍(DP)
        // 뒤에서부터 구함 -> 왜 그런지는 모름
        for (int i = num; i > 0; i--) {
            // 만약 num이 7이라면
            // dp[7]에 해당하는 T가 2이므로 값은 0을 리턴시켜줌
            // dp[6]에 해당하는 T는 4이므로 값은 0을 리턴시켜줌
            // dp[5]에 해당하는 T는 2이므로 값은 더해주게 됨
            // 현재 날짜에 시간을 더해야한다. 현재 날짜는 i이고 걸리는 날짜는 T[i]임.
            // 만약 현재 날짜에 걸리는 날짜를 더했을 때 초과된다면 값은 0을 리턴시켜줘야한다. 일을 할 수 없으니까
            if (i + T[i] > num + 1) {
                dp[i] = dp[i + 1]; // 값이 0이 됨. 예를 들어 i가 7이라면 7 + 2 > 9이기 때문에 dp[7]에 dp[8]의 값인 0을 대입해준다. case1
                // i가 6이라면 6 + 2 > 8이기 때문에 dp[6] = dp[7](0임) 을 대입해준다. case2
            } else {
                // i가 5라면 5 + 2 < 8 이기 때문에 값을 구하러가야함. case3
                // i가 5라면 i가 6일 경우의 값을 가져오고(0임), dp[5 + 2]를 가져오고(0임) + P[i] 값을 더해서 넣어준다.(15임) 즉
                // dp[5]에는 15이 들어가게 된다.
                // i가 4라면 (i + T[i])의 값이 5가 되고(T[5]의 값이 1이기 때문) else문이 실행된다 case4
                // 즉 dp[4] = Math.max(dp[5], dp[5] + P[5])를 비교하게 되는데 여기서 dp[5]는 값이 10이니까 (15, 15
                // + P[4](20))이 된다. 즉 값은 35가 dp[4]에 들어가게 된다.
                // i가 3이라면 (i + T[i])의 값이 4가 되고 else문을 실행하게 된다.
                // 즉 dp[3] = Math.max(dp[4], dp[4] + P[3]);이 되는데 dp[4]의 값은 35이고 P[3]의 값은 10이므로
                // 45가 dp[3]에 들어가게 된다.
                // i가 2라면 (i + T[i])의 값이 7이 돼서 실행이 된다.
                // 즉 dp[2] = Math.max(dp[3], dp[7] + P[2])가 되는데 dp[3]의 값은 45이고, dp[7]의 값은 0이고
                // P[2]의 값은 20이므로 45가 들어가게 된다.
                // i가 1이라면 (i + T[i])의 값이 4가 되고 else문을 실행하게 된다.
                // 즉 dp[1] = Math.max(dp[2], dp[4] + P[1])이 되는데 dp[2]의 값은 45이고, dp[4]의 값은 35,
                // P[1]의 값은 10이므로 45,45가 되어 45가 출력이 된다.
                dp[i] = Math.max(dp[i + 1], dp[i + T[i]] + P[i]);
            }

            // dp[4]에 해당하는 T는 1이므로 값은 dp[4] + dp[5]가 됨
            // dp[3]에 해당하는 T는 1이므로 값은 dp[3] + dp[4]가 됨
            // dp[2]에 해당하는 T는 5으므로 값은 dp[?] + dp[3]이 됨

        }

        System.out.println(dp[1]);

    }
}
