import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//방번호_1475
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine(); // 방 번호 입력
        int[] count = new int[10];

        //숫자 개수 세기
        for(int i = 0; i < N.length(); i++){
            int digit = N.charAt(i) - '0';
            count[digit]++;
        }
        
        int sixNineCount = (count[6] + count[9] + 1) / 2;
        count[6] = count[9] = sixNineCount;

        int maxSets = 0;
        for(int i = 0; i < 10; i++){
            maxSets = Math.max(maxSets, count[i]);
        }

        System.out.println(maxSets);
    }   
}
