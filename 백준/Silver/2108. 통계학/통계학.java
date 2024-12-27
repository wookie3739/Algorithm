import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//통계학_2108
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. 산술평균 2.중앙값 3. 최빈값 여러 개시 두 번째로 작은 값 4. 범위 출력
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 고정되어있으니까 인트배열로 가자.

        int sum = 0;
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i]; //산술 평균
        }
        
        double mean = (double) sum / N;
        sb.append(Math.round(mean)).append("\n"); // 산술 평균
        
        //중앙값
        Arrays.sort(arr);
        sb.append(arr[N / 2]).append("\n");

        //최빈값
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxFrequency = 0;

        // 1 3 8 -2 2
        for(int num : arr){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequency.get(num));
        }

        List<Integer> mix = new ArrayList<>();
        for(int key : frequency.keySet()){
            if(frequency.get(key) == maxFrequency){
                mix.add(key); // 1 -2 8 -2 1이면 1이 들어감
            }
        }
        
        Collections.sort(mix);
        int result = mix.size() > 1 ? mix.get(1) : mix.get(0);
        sb.append(result).append("\n");

        sb.append(arr[N - 1] - arr[0]).append("\n");
        System.out.println(sb.toString());
    }
}
