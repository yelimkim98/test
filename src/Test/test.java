package Test;

import java.util.*;

public class Test {
    private String solution(String[] seoul) {
        String answer = "";
        
        int x = Arrays.asList(seoul).indexOf("Kim");
        answer = "�輭���� "+x+"�� �ִ�.";
        
        return answer;
    }

    public static void main(String[] args) {
        String [] a = {"Jane", "Kim"};
        String ans = new Test().solution(a);
		
        System.out.print(ans);
    }
}
