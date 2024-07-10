//한수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws Exception{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(findSequence(num)));

        bw.close();
        br.close();
        

    }

    public static int findSequence(int num){


        if(num <= 99){

            return num;
        }else{
            count = 99;
            
            for(int i = 100; i <= num; i++){
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if((hun - ten) == (ten - one)){
                    count++;
                }
            }
        }
        return count;
    }
}
