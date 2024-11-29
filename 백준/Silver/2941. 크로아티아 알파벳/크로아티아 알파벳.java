import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        input = input.replace("c=", "a")
                     .replace("c-", "a")
                     .replace("dz=", "a")
                     .replace("d-", "a")
                     .replace("lj", "a")
                     .replace("nj", "a")
                     .replace("s=", "a")
                     .replace("z=", "a");
      bw.write(input.length() + "\n");
      bw.flush();
      bw.close();
      br.close();
     }
}
