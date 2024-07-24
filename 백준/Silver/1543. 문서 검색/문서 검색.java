import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문서 검색
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // ababababa, aba
        // 2번 출력, 중복되지 않게
        String context = br.readLine();
        String words = br.readLine();
        int count = 0;
        int index = 0;

        // index의 시작 위치 조절
        while ((index = context.indexOf(words, index)) != -1) {
            count++;
            index += words.length();
        }

        bw.write(count + "\n");
        bw.close();
        br.close();

    }
}
