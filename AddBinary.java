import java.util.Arrays;
class Solution {
    public String addBinary(String a, String b) {
    	int length = a.length()>b.length()?a.length():b.length();
    	int aMaxIndex = a.length()-1;
    	int bMaxIndex = b.length()-1;
    	if(a.equals("0"))
    		return b;
    	else if(b.equals("0"))
    		return a;
    	int tmp[] = new int[length+1];
    	int carry = 0;
    	while(true) {
    		if(aMaxIndex<0||bMaxIndex<0)
    			break;
    		
    		if(carry != 0) {
    			if(a.charAt(aMaxIndex)=='0'&&b.charAt(bMaxIndex)=='0') {
    				tmp[length]=0+carry;	carry=0;
    				aMaxIndex--;bMaxIndex--;length--;
    			}
    			else if(a.charAt(aMaxIndex)=='1'&&b.charAt(bMaxIndex)=='1') {
    				tmp[length]=0+carry; 
    				aMaxIndex--;bMaxIndex--;length--;
    			}
    			else {
    				tmp[length]=0;
    				aMaxIndex--;bMaxIndex--;length--;
    			}
    		}
    		else {
    			if(a.charAt(aMaxIndex)=='0'&&b.charAt(bMaxIndex)=='0') {
    				tmp[length]=0;
    				aMaxIndex--;bMaxIndex--;length--;
    			}
    			else if(a.charAt(aMaxIndex)=='1'&&b.charAt(bMaxIndex)=='1') {
    				tmp[length]=0;	++carry; 
    				aMaxIndex--;bMaxIndex--;length--;
    			}
    			else {
    				tmp[length]=1;
    				aMaxIndex--;bMaxIndex--;length--;
    			}
    		}
    	}
    	while(aMaxIndex>=0) {
			if(carry != 0) {
				if(a.charAt(aMaxIndex)=='0') {
    				tmp[length]=0+carry;	carry=0;
    				aMaxIndex--;length--;
    			}
    			else {
    				tmp[length]=0;
    				aMaxIndex--;length--;
    			}
    		}
    		else {
    			if(a.charAt(aMaxIndex)=='0') {
    				tmp[length]=0;
    				aMaxIndex--;length--;
    			}
    			else {
    				tmp[length]=1;
    				aMaxIndex--;length--;
    			}
    		}
		}
    	while(bMaxIndex>=0) {
			if(carry != 0) {
				if(b.charAt(bMaxIndex)=='0') {
    				tmp[length]=0+carry;	carry=0;
    				bMaxIndex--;length--;
    			}
    			else {
    				tmp[length]=0;
    				bMaxIndex--;length--;
    			}
    		}
    		else {
    			if(b.charAt(bMaxIndex)=='0') {
    				tmp[length]=0;
    				bMaxIndex--;length--;
    			}
    			else {
    				tmp[length]=1;
    				bMaxIndex--;length--;
    			}
    		}
    	}
		if(carry !=0)
			tmp[length]=1;
		else
			tmp[length]=0;
    	 String str = Arrays.toString(tmp).replace(", ","").replace("[","").replace("]","");
    	 if(str.charAt(0)=='0')
    		 str = str.substring(1, str.length()-1);
    	return str;
    	
    }
    
   }
    
public class AddBinary {
	public static void main(String args[]) {
		String a = "1110110101";
		String b = "1110111011";
		Solution c = new Solution();
		String d = c.addBinary(a, b);
		System.out.println(d);
	}
}
