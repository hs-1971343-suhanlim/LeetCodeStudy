import java.util.List;
import java.util.Vector;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new Vector<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0)
                ans.add("FizzBuzz");
            else if(i%3==0)
                ans.add("Fizz");
            else if(i%5==0)
                ans.add("Buzz");
            else
                ans.add(Integer.toString(i));
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}