import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//직사각형네개의합집합의면적구하기_2669_구현
public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] arr = new boolean[100][100];

        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            extent(arr, x1, y1, x2, y2);
        }
        System.out.println(count);
    }
    public static void extent(boolean[][] arr, int x1, int y1, int x2, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                if(arr[i][j]){
                    continue;
                }
                arr[i][j] = true;
                count++;
            }   
        }
    }
}
