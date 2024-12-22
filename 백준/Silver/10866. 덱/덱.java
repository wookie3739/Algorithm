import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            switch (command) {
                case "push_front":
                    int num1 = Integer.parseInt(st.nextToken());
                    deque.addFirst(num1);
                    break;

                case "push_back":
                    int num2 = Integer.parseInt(st.nextToken());
                    deque.addLast(num2);
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.removeFirst() + "\n");
                    }
                    break;

                case "pop_back":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.removeLast() + "\n");
                    }
                    break;

                case "size":
                    bw.write(deque.size() + "\n");
                    break;

                case "empty":
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                    break;
            }
        }
        
        bw.flush();
        bw.close();
    }
}
