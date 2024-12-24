import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {  
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] points = new int[3][2];
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int x = fourth_point(points, 0);
        int y = fourth_point(points, 1);

        bw.write(x + " " + y + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    private static int fourth_point(int[][] points, int index){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] point : points){
            map.put(point[index], map.getOrDefault(point[index], 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
