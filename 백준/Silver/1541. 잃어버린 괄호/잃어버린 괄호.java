import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//잃어버린 괄호
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // 55 - 50 + 40 -> -35
        String str = br.readLine();

        //55, 50 + 40
        String[] minus= str.split("-");

        int sum = 0;

        for(int i = 0; i < minus.length; i++){
            //1) 0번째에는 +가 없으므로 55이 나옴
            //2) 1번째에는 +가 있으므로 50, 40이 나옴
            String[] plus = minus[i].split("\\+");

            //1) tempnum에는 55
            //2) tempnum에는 50 + 40 = 90
            int tempnum = 0;
            for(String num : plus){
                tempnum += Integer.parseInt(num);
            }

            if(i == 0){
                //sum에는 55
                sum += tempnum;
            }else{
                //sum에는 55 - 90
                sum -= tempnum;
            }

        }
        System.out.println(sum);
    }
}
