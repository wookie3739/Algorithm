import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int members = Integer.parseInt(br.readLine().trim());

        Member[] memberArr = new Member[members];

        for(int i = 0; i < memberArr.length; i++){
            String[] strArr = br.readLine().split(" ");
            int age = Integer.parseInt(strArr[0]);
            String name = strArr[1];
            int order = i;
            memberArr[i] = new Member(age, name, order); 
        }
        Arrays.sort(memberArr, (s1, s2) ->{
            if(s1.age == s2.age){
                return Integer.compare(s1.order, s2.order);
            }else{
                return Integer.compare(s1.age, s2.age);
            }
        });
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < memberArr.length; i++){
            sb.append(memberArr[i].age + " " + memberArr[i].name + "\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

class Member{
    int age;
    String name;
    int order;

    Member(int age, String name, int order){
        this.age = age;
        this.name = name;
        this.order = order;
    }
}
