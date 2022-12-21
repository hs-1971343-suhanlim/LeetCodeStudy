import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> sol = new ArrayList<String>();
        for(int h=0;h<12;h++)
            for(int m=0;m<60;m++)
                if(Integer.bitCount(64*h+m)==turnedOn)
                    sol.add(String.format("%d:%02d",h,m));
        return sol;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.readBinaryWatch(1);
    }
}