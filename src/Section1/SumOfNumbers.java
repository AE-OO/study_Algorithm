package Section1;

import java.util.Scanner;

/**
 * 문제001. 숫자의 합 구하기
 * 백준 11720
 */

public class SumOfNumbers {
    public void sumOfNumbers(){
        int result = 0;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        number = Integer.parseInt(sc.nextLine());

        for(int i = 0; i< Integer.parseInt(N); i++){
            result += number % 10;
            number = number / 10;
        }

        System.out.println(result);
    }
    
    public void sumOfNumbersLecture(){
        // 문제의 조건에 N은 1과 100 사이의 수라고 주어져 있음 => 100자리의 수를 int 또는 long으로 받을 수 없음
        // N자리의 수를 String형으로 받아와서 char 배열에 한자리씩 넣음
        // char와 숫자의 아스키코드는 48이 차이남

        int result = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String number = sc.next();
        char[] numbers = number.toCharArray();

        for(int i = 0; i < numbers.length; i++){
            result += numbers[i] - 48;
        }

        System.out.println(result);
    }
}
