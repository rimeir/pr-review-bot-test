import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Stack<String> stack = new Stack<>(); //스택 이용
        int answer = 0;

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] arr = str.split("");
            for (String s : arr) {
                if (!stack.empty() && s.equals(stack.peek())) stack.pop();
                else stack.push(s);
            }
            if(stack.isEmpty()) answer++;
            stack.clear();
        }
        System.out.print(answer);
    }
}