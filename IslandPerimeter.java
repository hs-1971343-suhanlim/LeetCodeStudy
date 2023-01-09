class Solution {
    private int getPerimeterDFS(int [][]grid,boolean isVisit[][],int i,int j){
        // 종료 조건: 범위를 벗어나면 끝
        if(i<0||i>= grid.length||j<0||j>grid[0].length)
            return 1;
        // 종료 조건2: 해당 위치가 물이라면 끝
        if(grid[i][j]==0)
            return 1;
        // 종료 조건3: 이미 방문한 타일이면 끝
        if(isVisit[i][j])
            return 0;
        // 방문 여부 표시
        isVisit[i][j] = true;
        // 재귀를 통한 주변 타일 탐색
        int count = getPerimeterDFS(grid,isVisit,i-1,j)
                + getPerimeterDFS(grid,isVisit,i,j-1)
                + getPerimeterDFS(grid,isVisit,i+1,j)
                + getPerimeterDFS(grid,isVisit,i,j+1);
        return count;
    }
    public int islandPerimete2(int[][] grid) {
        // 방문 여부를 체크하는 변수
       boolean isVisit[][] = new boolean[grid.length][grid[0].length];
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[i].length;j++){
               if(grid[i][j]==1)
                   return getPerimeterDFS(grid,isVisit,i,j);
           }
       }
       return 0;
    }
    // 위에 타일 각각의 둘레를 구하는 점근 에서 전체적인 땅의 둘레를 구하는 접근으로 봐야 함
    // 시간 복잡도 O(n^2) 공간 복잡도 O(1)
    public int islandPerimete1(int[][] grid) {
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                // 어차피 반복을 통해 모든 오른쪽 아래 경우를 검사 함
                if(grid[i][j]==1){
                    ans+=4;
                    // 위쪽에 땅이랑 이어진 경우 각자의 면에서 하나씩 사라지기 때문에 -2
                    if(i>0&&grid[i-1][j]==1)
                        ans-=2;
                    // 왼쪽에 땅이랑 이어진 경우 각자의 면에서 하나씩 사라지기 때문에 -2
                    if(j>0&&grid[i][j-1]==1)
                        ans-=2;

                }
            }
        }
        return ans;
    }
    private int getSurroundLandCount(int [][]grid, int i,int j){
        int land=0;
        if(i-1>=0)
            if(grid[i-1][j]==1) land++;
        if(j-1>=0)
            if(grid[i][j-1]==1) land++;
        if(j+1<= grid[i].length-1)
            if(grid[i][j+1]==1) land++;
        if(i+1<=grid.length-1)
            if(grid[i+1][j]==1) land++;
        return land;
    }
    // 시간 복잡도 O(n^2) 공간 복잡도 O(1)
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1)
                    ans+=4-getSurroundLandCount(grid,i,j);
            }
        }
        return ans;
    }
}
public class IslandPerimeter {
    public static void main(String[] args) {
        Solution s = new Solution();
        int tmp[][] = {{1,1}};
        s.islandPerimeter(tmp);
        System.out.println("Hello world!");
    }
}