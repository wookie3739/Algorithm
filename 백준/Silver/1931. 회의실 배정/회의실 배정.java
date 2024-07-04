import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//회의실 찾기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());


        }
        //끝나는 시간을 기준으로 정렬
        //만약 끝나는 시간이 같다면 시작 시간을 기준으로 정렬
        Arrays.sort(meetings, (s1, s2) -> {
            if(s1[1] == s2[1]){
                return Integer.compare(s1[0], s2[0]);
            }else{
                return Integer.compare(s1[1], s2[1]);
            }
        });

        int count = 0;
        int endTime = 0;

        //현재 회의의 시작 시간이 endTime보다 크면 count++
        //endTime을 다시 갱신
        for(int i = 0; i < n; i++){
            if(meetings[i][0] >= endTime){
                endTime = meetings[i][1];
                count++;
            }
        }
        bw.write(Integer.toString(count));
        bw.close();
        br.close();
    }
}
