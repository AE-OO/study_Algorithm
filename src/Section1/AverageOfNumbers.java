package Section1;

import java.util.Scanner;

/**
 * 문제002. 평균 구하기
 * 백준 1546
 */

public class AverageOfNumbers {
    public void AverageOfNumbers(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];
        int maxScore = 0;
        int sum = 0;

        for(int i = 0; i < scores.length; i++){
            scores[i] = Integer.parseInt(sc.next());
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
            sum += scores[i];
        }

        System.out.println((float) sum / maxScore * 100 / N);
    }

}
