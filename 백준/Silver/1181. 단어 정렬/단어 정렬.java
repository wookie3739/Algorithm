import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//단어 정렬 실버5
public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine().trim());

        //순서 x, 중복 x
        Set<String> wordSet = new HashSet<>();

        for(int i = 0; i < num; i++){
            wordSet.add(br.readLine().trim());


        } 
        String[] words = wordSet.toArray(new String[0]);

        Arrays.sort(words, (s1, s2) -> {
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            }else{
                return s1.length() - s2.length();
            }
        });

        for(String word : words){
            bw.write(word + "\n");
        }
        bw.close();
        br.close();
    }
}
