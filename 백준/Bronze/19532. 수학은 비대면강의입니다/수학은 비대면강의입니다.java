import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//수학은 비대면 강의입니다.
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int d = Integer.parseInt(str[3]);
        int e = Integer.parseInt(str[4]);
        int f = Integer.parseInt(str[5]);

        int x = (c*e - b*f)/(a*e - b*d);
        int y = (c*d - a*f)/(d*b - a*e);

        bw.write(x + " " + y + "\n");
        bw.close();
        br.close();

    }
}
