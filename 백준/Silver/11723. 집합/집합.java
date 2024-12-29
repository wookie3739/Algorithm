import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//집합_11723
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            if(command.equals("all")){
                set.clear();
                for(int j = 1; j <= 20; j++){
                    set.add(j);
                }
            }else if(command.equals("empty")){
                set.clear();
            }else{
                int num = Integer.parseInt(st.nextToken());
                switch(command){
                    case "add":
                        set.add(num); break;
                    case "remove":
                        set.remove(num); break;
                    case "check":
                        if(set.contains(num)){
                            sb.append(1 + "\n");
                        }else{
                            sb.append(0 + "\n");
                        }
                        break;
                    case "toggle":
                    if(set.contains(num)){
                        set.remove(num);
                    }else{
                        set.add(num);
                    }
                    break;
                }
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}
