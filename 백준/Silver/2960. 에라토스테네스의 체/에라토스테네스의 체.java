import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

//에라토스테네스의체_2960
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //2 ~ N
        // 7 3일 경우
        // 2 3 4 5 6 7에서 소수를 지움 그리고 배수를 지움 2, 4, 6 즉 6 출력

        //15 12일 경우
        // 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        // 2, 4, 6, 8, 10, 12, 14, 3, 9, 15, 5, 7 12번째는 7 출력

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new LinkedList<>();

        for(int i = 2; i <= N; i++){
            list.add(i);
        }

        int count = 0;
        //K번째에 해당하는 값이 나올 때까지 반복
        while(!list.isEmpty()){
            int prime = list.get(0); // 리스트의 첫 번째 요소는 무조건 소수임.
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) % prime == 0){
                    count++;
                    int removed = list.remove(i);
                    //ConcurrencyModifiException 회피
                    i--;
                    if(count == K){
                        System.out.println(removed);
                    }
                }
            }
        }
     }
}
