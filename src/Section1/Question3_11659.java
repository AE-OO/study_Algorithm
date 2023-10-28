package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제003.구간 합 구하기
 * 백준 11569
 */
public class Question3_11659 {
    public void Anserw3_11659() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] s = new int[n];
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        // 초기값
        s[0] = Integer.parseInt(st.nextToken());
        // 합 배열
        for(int i = 1; i < n; i++){
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int sNum = Integer.parseInt(st.nextToken());
            int eNum = Integer.parseInt(st.nextToken());
            if(sNum == 1){
                sb.append(s[eNum - 1]).append("\n");
            }else{
                sb.append(s[eNum - 1] - s[sNum - 2]).append("\n");
            }
        }

        System.out.println(sb);

    }
}
