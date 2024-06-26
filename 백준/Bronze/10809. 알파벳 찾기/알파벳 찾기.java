import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().trim(); // 단어를 입력받고 양 끝의 공백을 제거

        int[] arr = new int[26]; // 알파벳 소문자의 위치를 저장할 배열

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 배열을 -1로 초기화
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); // 단어의 각 문자를 가져옴

            if (arr[ch - 'a'] == -1) { // 해당 문자가 처음 등장하면
                arr[ch - 'a'] = i; // 배열에 위치를 저장
            }
        }

        for (int var : arr) {
            bw.write(var + " "); // 배열의 값을 출력
        }
        bw.flush(); // 버퍼를 비움
        bw.close(); // BufferedWriter를 닫음
        br.close(); // BufferedReader를 닫음
    }
}
