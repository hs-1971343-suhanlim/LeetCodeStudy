class Solution2 {
    public boolean isPalindrome(String s) {
       int i=0, j=s.length()-1;
       char begin, end;
       while(i<j) {
    	   begin = s.charAt(i);
    	   end = s.charAt(j);
    	   if(begin>='A'&&begin<='Z') {
    		   begin -='A'-'a';
    	   }
    	   if(end>='A'&&end<='Z') {
    		   end -='A'-'a';
    	   }
    	   if( !(begin>='a' && begin<='z') && !( begin>='0' && begin<='9' ) ){
               begin++;
               continue;
           }
           if( !(end>='a' && end<='z') && !( end>='0' && end<='9' ) ){
               end--;
               continue;
           }
           if(begin!=end) {
        	   return false;
           }
           begin++;
           end--;
       }
       return true;
    }
}
public class ValidPalindrome {

}
