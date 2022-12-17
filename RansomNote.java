import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public boolean canConstructOtimal(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            if(map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))+1);
            }else{
                map.put(ransomNote.charAt(i),1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                if(map.get(magazine.charAt(i))==1){
                    map.remove(magazine.charAt(i));
                }else{
                    map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
                }
                if(map.isEmpty()){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        String all[] = magazine.split("");
        String part[] = ransomNote.split("");
        Arrays.sort(all);
        Arrays.sort(part);
        int a=0; int p=0;
        while(p<part.length&&a<all.length){
            if(all[a].equals(part[p])){
                a+=1;
                p+=1;
            }
            else{
                a+=1;
            }
        }
        if(p==part.length-1) return true;
        else return false;
    }
}
public class RansomNote {
}
