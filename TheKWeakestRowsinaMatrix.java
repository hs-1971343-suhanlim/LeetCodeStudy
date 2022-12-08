
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int sol[] = new int[k];
        Map<Integer, Integer> tmap = new HashMap<Integer, Integer>();
        for(int i=0;i<mat.length;i++) {
        	int sum=0;
        	for(int j=0;j<mat[i].length;j++) {
        		sum+=mat[i][j];
        	}
        	tmap.put(i, sum);
        }
        List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(tmap.entrySet());

		// 비교함수 Comparator를 사용하여 오름차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		int i=0;
		for(Entry<Integer, Integer> entry : list_entries) {
			if(i>=k) break;
			sol[i++] = entry.getKey();
		}
        	
        return sol;
    }
}
public class TheKWeakestRowsinaMatrix {

}
