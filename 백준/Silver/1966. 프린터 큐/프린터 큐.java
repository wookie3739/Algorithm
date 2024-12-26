import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 프린터 큐 1966
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            Queue<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            // N -> 문서의 개수, M -> 몇 번째에 있는지
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                q.add(new int[]{arr[j], j}); // [우선순위, 인덱스] 형태로 저장
            }

            //잘 들어가있는지 확인해보자
            // for(int[] check : q){
            //     System.out.println(Arrays.toString(check));
            // }

            int count = 0;

            while (!q.isEmpty()) {
                int[] current = q.poll(); // 큐의 맨 앞 문서 확인
                boolean hasHigherPriority = false;

                // 현재 문서보다 우선순위가 높은 문서가 있는지 확인
                for(int[] doc : q) {
                    if (doc[0] > current[0]) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if(hasHigherPriority) {
                    q.add(current); // 우선순위 높은 문서가 있으면 맨 뒤로 보냄
                }else{
                    count++;
                    if (current[1] == M) { // 출력한 문서가 우리가 찾는 문서인지 확인
                        bw.write(count + "\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
