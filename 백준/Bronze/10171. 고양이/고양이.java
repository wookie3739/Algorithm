import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("\\    /\\\n")
        .append(" )  ( ')\n")
        .append("(  /  )\n")
        .append(" \\(__)|");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
