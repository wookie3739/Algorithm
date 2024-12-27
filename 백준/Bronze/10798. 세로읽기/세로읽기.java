import java.io.BufferedReader;
import java.io.InputStreamReader;

//세로읽기_10978
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st;

        char[][] arr = new char[5][15];
        //String[][] arr = new String[5][15];

        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 15; j++){
        //         arr[i][j] = ""; // 공백으로 초기화
        //     }
        // }

        for(int i = 0; i < 5; i++){
            // st = new StringTokenizer(br.readLine());
            // int row = 0;
            // while(st.hasMoreTokens()){
            //     arr[i][row++] = st.nextToken(); arr의 데이터타입은 String[][]
            // } 빈칸이 있는 줄 알고 작성함
            String input = br.readLine();
            for(int j = 0; j < input.length(); j++){
                arr[i][j] = input.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(arr[j][i] != '\0'){ // String[][]일 때는 !arr[j][i].equals(" "); 이었음.
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
