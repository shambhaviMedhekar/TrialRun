package RandomCode;


public class CheckIslands {
	static final int ROW = 5, COL = 5; 
	public static void main(String[] args) {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
			{ 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 1 }, 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 0, 1, 0, 1 } }; 
			CheckIslands I = new CheckIslands(); 
			System.out.println("Number of islands is: " + I.countIslands(M)); 	

	}

	private int countIslands(int[][] m) {
		boolean visited[][]=new boolean[ROW][COL];
		int count=0;
		for(int i=0;i<ROW;i++)
			for(int j=0;j<COL;j++) {
				if(m[i][j]==1 && !visited[i][j]) {
					DFS(m,i,j,visited);
					count++;
				}
			}
		return count;
	}

	private void DFS(int[][] m, int i, int j, boolean[][] visited) {
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        visited[i][j]=true;
        for(int k=0;k<8;k++) {
        	if(isSafe(m,i+rowNbr[k],j+colNbr[k],visited)) {
        		DFS(m,i+rowNbr[k],j+colNbr[k],visited);
        	}
        }
		
	}

	private boolean isSafe(int[][] m, int i, int j, boolean[][] visited) {
		if(i>=0 && i<ROW && j>=0 && j<COL && (m[i][j]==1 && !visited[i][j]))
			return true;
		return false;
	}

}
