import java.util.HashSet;

class Solution{
	/*
	public int happyNumberStep1(String array[]) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			int k = Integer.parseInt(array[i]);
			sum+=Math.pow(k, 2);
		}
		return sum;
	}
	public boolean isHappy(int n) {
		String tmp = Integer.toString(n);
		int nextN = happyNumberStep1(tmp.split(""));
		if(nextN==1) return true;
		while(nextN!=Math.pow(n, 2)) {
			if(nextN==1) return true;
			String tmp2 = Integer.toString(nextN);
			String array[] = tmp2.split("");
			nextN = happyNumberStep1(array);
		}
		return false;
	}
	*/
	// 자료구조 set: 데이터를 비순차적(unordered)으로 저장할 수 있는 순열 자료구조 (collection)
	// 언제 사용하면 좋을까?
	// 중복된 값을 골라내야 할때
	// 특정값이 있는지 빠르게 확인해야할때 (look up)
	// 순서가 상관 없을때 https://velog.io/@taeha7b/datastructure-set
	public int getNext(int n) {
		int sum=0;
		while(n!=0){
			int d = n%10;
			n /=10;
			sum += d*d;
		}
		return sum;
	}
	// 생각해야 할 점: 만약 n이 행복한 수 라면 HashSet 클래스의 contains에 걸려버린다.
	public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(!set.contains(getNext(n))) {
        	set.add(getNext(n));
        	n = getNext(n);
        	if(n==1) return true;
        }
        return false;
    }
}
public class HappyNumber {
	public static void main(String args[]) {
		Solution a = new Solution();
		System.out.println(a.isHappy(19));
	}
}
