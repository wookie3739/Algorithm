import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strScore = br.readLine();
        int score = Integer.parseInt(strScore);
        StringBuilder sb = new StringBuilder();

        if(score >= 90){
            sb.append('A');
        }else if(score >= 80){
            sb.append('B');
        }else if(score >= 70){
            sb.append('C');
        }else if(score >= 60){
            sb.append('D');
        }else{
            sb.append('F');
        }
        System.out.println(sb);
        br.close();
    }
}