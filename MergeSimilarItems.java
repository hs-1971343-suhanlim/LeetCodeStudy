import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

class Solution {
	private void arraySort(int list[][]) {
		int j=0;
		int tmp[];
		for(int i=1;i<list.length;i++) {
			tmp = list[i];
			for(j=i-1;j>=0&&(list[j][0]>tmp[0]);j--)
				list[j+1] = list[j];
			list[j+1]=tmp;
		}
	}
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Vector<List<Integer>> sol = new Vector<List<Integer>>();
        arraySort(items1);
        arraySort(items2);
        Set<Integer> size = new HashSet<Integer>();
        for(int i=0;i<items1.length;i++) {
        	size.add(items1[i][0]);
        }
        for(int i=0;i<items2.length;i++) {
        	size.add(items2[i][0]);
        }
        int j=0,t=0;
        System.out.println("cut");
        for(int i=0;i<size.size();i++) {
        	sol.add(new Vector<Integer>());
        	if(items1[j][0]<items2[t][0]) {
        		sol.get(i).add(items1[j][0]);
        		sol.get(i).add(items1[j++][1]);
        	}
        	else if(items1[j][0]>items2[t][0]) {
        		sol.get(i).add(items2[t][0]);
        		sol.get(i).add(items2[t++][1]);
        	}
        	else {
        		sol.get(i).add(items2[t][0]);
        		sol.get(i).add(items2[t++][1]+items1[j++][1]);
        	}
        	if(j>=items1.length||t>=items2.length)
        		break;
        }
        if(j<items1.length) {
        	for(int i=j;i<items1.length;i++) {
        		sol.add(new Vector<Integer>());
        		sol.get(sol.size()-1).add(items1[i][0]);
        		sol.get(sol.size()-1).add(items1[i][1]);
        	}
        }
        else {
        	for(int i=t;i<items2.length;i++) {
        		sol.add(new Vector<Integer>());
        		sol.get(sol.size()-1).add(items2[i][0]);
        		sol.get(sol.size()-1).add(items2[i][1]);
        	}
        }
        return sol;
    }
    /* TreeMap에 객체를 저장하면 자동으로 정렬되는데, 키는 저장과 동시에 자동 오름차순으로 정렬되고 숫자 타입일 경우에는 값으로,
     *  문자열 타입일 경우에는 유니코드로 정렬합니다. 
    class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (var item : items1)
            map.put(item[0], item[1]);

        for (var item : items2) {
            map.putIfAbsent(item[0], 0);
            map.put(item[0], map.get(item[0]) + item[1]);
        }

        for (var item : map.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(item);
            list.add(map.get(item));
            result.add(list);
        }

        return result;
    }
}
     */
}
public class MergeSimilarItems {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp1[][]= {{1,1},{4,5},{3,8}};
		int tmp2[][]= {{3,1},{1,5}};
		s.mergeSimilarItems(tmp1, tmp2);
	}
}
