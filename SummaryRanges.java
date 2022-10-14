import java.util.List;
import java.util.Vector;

class Solution {
    public List<String> summaryRanges(int[] nums) {
    	List<String> list = new Vector<String>();
    	if(nums.length==0) return list;
    	if(nums.length==1) {
    		list.add(Integer.toString(nums[0]));
    		return list;
    	}
    	// startNum endNum을 int로 선언시 null로 표현이 안되서 Integer 객체로 선언
    	Integer startNum=null, endNum=null;
    	for(int i=0;i<nums.length-1;i++) {
    		// 만약 다음 수와 연속적인 관계라면 
    		if(nums[i]+1==nums[i+1]) {
    			// 만약 둘다 empty 상태라면 startNum endNum 최신화
    			if(startNum==null) {
    				startNum = nums[i];
    				endNum = nums[i+1];
    			}
    			// 둘다 full 상태 라면 endNum 만 최신화
    			else
    				endNum=nums[i+1];
    		}
    		// 연속적이지 않은 상태에서 둘다 empty 상태거나 endNum이랑 지금의 값이 다르다면 "i" 식으로 넣기
    		else if(endNum==null||endNum!=nums[i]) {
    			list.add(Integer.toString(nums[i]));	
    		}
    		// 연속적이지 않은 상태에서 둘다 full 상태고 endNum이랑 지금의 값이 같다면 "i->j" 식으로 넣고 null로 초기화  
    		else if(startNum!=null) {
				String tmp = Integer.toString(startNum);
				tmp+="->";
				tmp+=Integer.toString(endNum);
				list.add(tmp);
				endNum=startNum=null;
			}
    	}
    	// 마지막 인덱스 추가 관리
    	 if(startNum!=null) {
				String tmp = Integer.toString(startNum);
				tmp+="->";
				tmp+=Integer.toString(endNum);
				list.add(tmp);
				endNum=startNum=null;
			}
    	 else {
    		 list.add(Integer.toString(nums[nums.length-1]));	
    	 }
    	 // 정답 반환
    	return list;
    }
}

public class SummaryRanges {

}
