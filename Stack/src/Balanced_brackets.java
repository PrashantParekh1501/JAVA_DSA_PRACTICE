import java.util.*;
//apprpch
//using stack if i see open bracket then push ans when close bracket comes then pop
//is stack emepty then yes else no tc=sc=O(n)
class Solution{
    public void balancedBrackets(String s, int n) {
        // write code here
      Stack<Character>st = new Stack<>();
      for(int i=0;i<s.length();i++){
          char c = s.charAt(i);
          if(c=='('){
              st.push(c);
          }
          else if(c=='['){
              st.push(c);
          }
          else if(c=='{'){
              st.push(c);
          }
          else if(!st.isEmpty() && c==')' && st.peek()=='('){
              st.pop();
          }
          else if(!st.isEmpty() && c==']' && st.peek()=='['){
              st.pop();
          }
          else if(!st.isEmpty() && c=='}' && st.peek()=='{'){
              st.pop();
          }
      }

      if(st.isEmpty()){
          System.out.print("YES");
          return;
      }
      System.out.print("NO");
    }
}

public class Balanced_brackets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}