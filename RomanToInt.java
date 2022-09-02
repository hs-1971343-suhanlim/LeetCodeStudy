class RomanChar{
	private int value;
	private boolean flag;
	public RomanChar(char r){
		switch(r){
        case 'I': value=1; break;
        case 'V': value=5; break;
        case 'X': value=10; break;
        case 'L': value=50; break;
        case 'C': value=100; break;
        case 'D': value=500; break;
        case 'M': value=1000; break;
        }
		flag = false;
	}
	public void setFlag() {
		flag = true;
	}
	public boolean getFlag() {
		return flag;
	}
	public int getValue() {
		return value;
	}
}
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        RomanChar array[] = new RomanChar[s.length()];
        for(int i=0;i<s.length();i++) {
        	array[i] = new RomanChar(s.charAt(i));
        	if(i>0) {
        		if(array[i-1].getValue()<array[i].getValue()) 
        			array[i].setFlag();
        		
        	}
        }
        for(int i=0;i<s.length();i++){
           if(!array[i].getFlag())
        	   sum+=array[i].getValue();
           else {
        	   sum-=array[i-1].getValue();
        	   sum+=array[i].getValue()-array[i-1].getValue();
           }
        } 
        return sum;
    }
}

public class intRomanToIntEx {
	public static void main(String args[]) {
		Solution a = new Solution();
		int sum = a.romanToInt("III");
		System.out.println(sum);
	}
}
