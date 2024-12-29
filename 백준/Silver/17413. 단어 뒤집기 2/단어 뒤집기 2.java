import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//단어뒤집기2_17413
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        boolean isTag = false;

        String input = br.readLine();        
        StringBuilder sb = new StringBuilder();

        //<open>tag<close>일 때
        for(char c : input.toCharArray()){
            if(c == '<'){
                isTag = true;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(c);
            }else if(c == '>'){
                isTag = false;
                sb.append(c);
            }else{
                //만약 태그안에 있는거라면?
                if(isTag){
                    sb.append(c);
                }else{
                    if(c == ' '){
                        while(!stack.isEmpty()){
                            sb.append(stack.pop());
                        }
                        sb.append(c);
                    }else{
                        stack.push(c);
                    }
                }
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
