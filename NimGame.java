class Solution {
	/**
	* 상대 턴에 4개가 남게 한다면 무조건 승리
	1 w
	2 w   (1~3) 내턴 + 4 상대 
	3 w
	4 L
	5 w
	6 w
	7 w
	8 L      4+4 L
	9 w -> 1+8 상대가 무조건 지게 되어있다.
	10 w -> 2+8 
	11 w -> 3+8
	12 L 
	.
	.
	.
	 * @param n
	 * @return
	 */ // 결론 4의 배수일 경우 선공이면 패배
    public boolean canWinNim(int n) {
       return n%4==0;
    }
}
public class NimGame {

}
