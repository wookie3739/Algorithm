import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 평점 정보 저장
        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalScore = 0.0; // 학점 × 평점의 총합
        double totalCredits = 0.0; // 유효한 학점의 총합

        // 20개의 입력 처리
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double credit = Double.parseDouble(input[1]); // 학점
            String grade = input[2]; // 평점

            // "P" 평점은 제외
            if (!grade.equals("P")) {
                totalScore += credit * gradeMap.get(grade); // 학점 × 평점 누적
                totalCredits += credit; // 학점 누적
            }
        }

        double average = totalCredits == 0 ? 0.0 : totalScore / totalCredits;

        System.out.printf("%.6f", average);
        br.close();
    }
}
