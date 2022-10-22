class Solution {
    // you need treat n as an unsigned value
	// 비트를 뒤집는다는 것은 00010111을 예시로 뒤집는 과정
	// 0001|0111 2개로 나누기-> 0111|0001 순서 바꾸기
	// 01|11|00|01 4개로 나누기 -> 11|01|01|00 순서 바꾸기
	// 1|1|0|1|0|1|0|0 (한 자리가 되게끔) 8개로 나누기 -> 1|1|1|0|1|0|0|0 순서 바꾸기
	// 최종적으로 뒤집힌 비트 완성
    public int reverseBits(int n) {
    	n = ((n & 0xffff0000) >>> 16) | ((n & 0x0000ffff) << 16);// f=1111
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);// f=1111
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);// f=1111
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);//c=1100 3=0011
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);//a=1010 5=0101
    	return n;
    }
    // 제일 오른쪽 비트 부터 차례대로 제일 왼쪾으로 모두 복사 후 리턴
    public int reverseBits2(int n) {
        int res=0;
        for(int i=0;i<32;i++){
    	    res= ( res << 1 ) | ( n & 1 );         
    	    n = n >> 1;                  
        }
    	return res;
    }
}
public class ReverseBits {
	public static void main(String args[]) {
	
	}
}
