import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//모든 순열
public class Main {
    static int N;
    static int[] arr, res;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        //N이 주어졌을 때 1 ~ N까지의 수로 이루어진 순열을 사전순으로 출력
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine().trim());

        arr = new int[N]; // 1 ~ N까지의 수를 담아줄 배열
        res = new int[N]; // 만들어진 순열을 담아줄 배열
        visited = new boolean[N]; // 방문처리 할 배열

        for(int i = 1; i <= N; i++){
            arr[i - 1] = i;
        }

        //재귀를 써보자.
        perm(0);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
    static void perm(int depth){
        //깊이가 끝에 도달했다면 ex) 1 2 3 호출해주고 종료
        if(depth == N){
          
            for(int i : res){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++){
            //이미 방문했다면 진행
            if(visited[i]){
                continue;
            }

            //방문하지 않았다면 재귀
            if(!visited[i]){
                visited[i] = true;
                res[depth] = i + 1;
                perm(depth + 1);
                visited[i] = false;
            }
        }
    }
}
