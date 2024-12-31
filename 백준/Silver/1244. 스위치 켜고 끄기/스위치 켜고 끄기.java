import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//스위치켜고끄기_1244
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //스위치 개수
        int N = Integer.parseInt(br.readLine());
        int[] switches = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            //스위치 번호, 상태 넣기
            switches[i] = Integer.parseInt(st.nextToken());
        }

        //학생 수
        int ppl = Integer.parseInt(br.readLine());

        //돌려봐
        for(int i = 0; i < ppl; i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int switch_number = Integer.parseInt(st.nextToken());

            // 남자라면?
            if(gender == 1){
                //그 값의 배수를 구해서 그 스위치 번호 배수에 해당하는 상태를 바꾸기.
                for(int j = switch_number; j <= N; j += switch_number){
                    //0이라면 1, 아니라면 0
                    switches[j] = switches[j] == 0 ? 1 : 0;
                }
            //여자라면?
            }else if(gender == 2){
                //먼저 자기 자신 바꾸기
                switches[switch_number] = switches[switch_number] == 0 ? 1 : 0;

                //왼쪽에 있는 값과 오른쪽에 있는 값이 같다면 바꾸기, 아니라면 자기 자신만임.
                int left = switch_number - 1;
                int right = switch_number + 1;

                // 1보다 크거나 같고 N보다 작거나 같고 left와 right가 같다면?
                while(left >= 1 && right <= N && switches[left] == switches[right]){
                    switches[left] = switches[left] == 0 ? 1 : 0;
                    switches[right] = switches[right] == 0 ? 1 : 0;
                    left--;
                    right++;
                }
            }
        }
        //마지막 스위치가 20개면 줄바꿈
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            sb.append(switches[i]).append(" ");
            if(i % 20 == 0){
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
        br.close();
    }
}
