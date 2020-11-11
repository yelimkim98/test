package Test;

import java.util.*;

public class Test {
    private String solution(String[] seoul) {
        String answer = "";
        
        int x = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 "+x+"에 있다.";
        
        return answer;
    }

    public static void main(String[] args) {
        String [] a = {"Jane", "Kim"};
        String ans = new Test().solution(a);
		
        System.out.print(ans);
    }
}
