package com.jia.chapter.ch01;

/**
 * 旋转N*N矩阵，
 * @author Administrator
 *
 */
public class Pro1_6 {
	public void rotate(int[][] matrix, int n) {
		printArray(matrix);
		for(int layer = 0; layer < n / 2; ++layer) {
			int first = layer;
			int last = n - 1 - layer;
			
			for(int i = first; i < last; ++i) {
				int offset = i - first;
				//存储上边
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		printArray(matrix);
	}
	
	private void printArray(int[][] matrix) {
		int len = matrix[0].length;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix  = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		new Pro1_6().rotate(matrix, 3);
	}
}
