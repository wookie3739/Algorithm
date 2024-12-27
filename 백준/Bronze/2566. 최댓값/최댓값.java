import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최댓값 2566
public class Main {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[9][9];
        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.print(max + "\n" + x + " " + y);
        br.close();
    }
}
