class Solution {
	private String arrayCopy[];
	private void mySort(String array[]) {
		for(int i=1;i<=array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[j].contains(Integer.toString(i))) {
					String tmp = array[j].substring(0, array[j].length()-1);
					arrayCopy[i-1] = tmp;
				}
			}
		}
	}
    public String sortSentence(String s) {
        String tmp[] = s.split(" ");
        arrayCopy = new String[tmp.length];
        mySort(tmp);
        // join은 문자열 배열의 모든 항목 사이에 원하는 문자열을 추가하여 하나의 문자열로 만들어 리턴 한다
        String result=String.join(" ",arrayCopy);
        return result;
    }
}
public class SortingtheSentence {

}
