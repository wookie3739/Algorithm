
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//좌표 정렬하기
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        // 배열이 두 개씩 n개
        int[] a = new int[n];

        int[][] b = new int[a.length][2];

        for (int i = 0; i < a.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                // 이제 두 개씩 다섯 개 배열 들어감
                b[i][0] = Integer.parseInt(st.nextToken());
                b[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b, (s1, s2) ->{
            if(s1[0] == s2[0]){
                return Integer.compare(s1[1], s2[1]);
            }else{
                return Integer.compare(s1[0], s2[0]);
            }
        });
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a.length; i++){
            sb.append(b[i][0] + " ").append(b[i][1] + "\n");
        }
        System.out.println(sb);
    }
}