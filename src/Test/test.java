package Test;

import java.util.*;

public class test {
    public static String solution(String[] seoul) {
        String answer = "";
        
        int x = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 "+x+"에 있다.";
        
        return answer;
    }
	
	public static void main(String[] args) {
		String ans;
		String [] a = {"Jane", "Kim"};
		ans = solution(a);
		
		System.out.print(ans);
	}
}