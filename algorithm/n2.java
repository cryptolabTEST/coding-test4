package ssafy.codingtest;

public class n2 {
	public static void main(String[] args) {
		// call methods
		Solution s = new Solution();
		
		// case 1
		s.searchMatrix(new int[][] {
						{1,4,7,11,15},
		            	{2,5,8,12,19},
		            	{3,6,9,16,22},
		            	{10,13,14,17,24},
		            	{18,21,23,26,30}}, 5);
		
		// case 2
		s.searchMatrix(new int[][] {
						{1,4,7,11,15},
			        	{2,5,8,12,19},
			        	{3,6,9,16,22},
			        	{10,13,14,17,24},
			        	{18,21,23,26,30}}, 20);
	}
	
	static class Solution {
	    public boolean searchMatrix(int[][] matrix, int target) {
	        
	    	// 재귀로 짜면 금방 해결될 것 같은데,, 생각보다 배열이 별로로 나오네  
	    	// 깔끔한 직사각형 배열이었으면 분할정복 가능할텐데. 
	    	
	    	// 각 행, 열은 오름차순으로 정렬
	    	// 각 행과 열의 가운데 수 값을 확인한 다음, 해당 값보다 작거나 크면 제외하는 식으로 풀어볼까?
	    	
	    	// 가운데 기준으로 다음 탐색할 방향 기록하자. 
	    	// 만약 2차원 배열로 방문 여부 체크할거면 완탐이나 다름 없다.
			
	    	int M = matrix.length;
	    	int N = matrix[0].length; // 직사각형 행렬이니까 길이가 같음.
	    	
	    	boolean[] row = new boolean[M];
	    	
	    	// y 값 변화시키면서 탐색 
	    	for (int i = 0; i < M; i++) {
				if (target == matrix[i][N / 2]) return true;
				else if (target > matrix[i][N / 2]) {
					row[i] = true;
				} else {
					row[i] = false;
				}
			}

	    	return recursive(matrix, target, row);
	    }

		private boolean recursive(int[][] matrix, int target, boolean[] row) {
			if (matrix.length > 0) return false;
			
	    	int M = matrix.length;
	    	int N = matrix[0].length;
	    	
	    	// start, end point를 잘 관리했으면 풀었겠다.
	    	// 배열의 크기도 인수로 넘겼어야 됐겠다. 현재 배열의 크기 (M / 2인지, M / 4인지 ..)
	    	
	    	int start = 0, end = 0;
	    	
	    	// set start, end point
	    	for (int i = 0; i < row.length; i++) {
				if (row[i]) start = M / 2;
				else start = (M / 2) / 2;
			}
	    	
	    	// find target
	    	for (int i = start; i < M; i++) {
				if (target == matrix[i][N / 2]) return true;
				else if (target > matrix[i][N / 2]) {
					row[i] = true;
				} else {
					row[i] = false;
				}
			}
	    	
	    	recursive(matrix, target, row);
			
	    	return false;
		}
	}
}



//# 2번 문제
// `m x n` 매트릭스에서 `target` 을 찾는 효율적인 알고리즘을 작성해주세요. 해당 매트릭스는 다음과 같은 속성을 가집니다.
//Input: matrix = [
//	[1,4,7,11,15],
//	[2,5,8,12,19],
//	[3,6,9,16,22],
//	[10,13,14,17,24],
//	[18,21,23,26,30]
//], target = 5
//Output: true
//
//Input: matrix = [
//	[1,4,7,11,15],
//	[2,5,8,12,19],
//	[3,6,9,16,22],
//	[10,13,14,17,24],
//	[18,21,23,26,30]], 
//	target = 20
//Output: false

//제약사항
//- `m == matrix.length`
//- `n == matrix[i].length`
//- `1 <= n, m <= 300`
//- `10^-9 <= matrix[i][j] <= 10^9`
//- 각 행의 모든 정수는 오름차순으로 정렬되어 있습니다.
//- 각 열의 모든 정수는 오름차순으로 정렬되어 있습니다.
//- `10^-9 <= target <= 10^9`