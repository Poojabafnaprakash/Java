

public class diagonalPattern {
	public static void main(String args[]){
		int len = 5;
		int[][] a = new int[len][len];
		int size = a.length;
		System.out.println(size);    
		if(len%2 != 0){
			for(int i=0;i<len;i++)
			{
				
				for (int j=0;j<len;j++)
					{
						if(i==j || j==len-i-1)
						System.out.print("X" + "\t");
	                    else
	                    System.out.print("O" + "\t");      
					}
				System.out.println();
			}
		}
		else
			System.out.println("Not odd");
	}

}


/*
public class diagonalPattern {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        new diagonalPattern().printDiagonals(matrix);
    }

    public void printDiagonals(int[][] matrix) {
        StringBuilder mainDiagonal = new StringBuilder();
        StringBuilder incidentalDiagonal = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                System.out.print("Not square matrix");
                return;
            }

            mainDiagonal.append(matrix[i][i]);
            mainDiagonal.append(' ');

            incidentalDiagonal.append(matrix[i][matrix.length - i - 1]);
            incidentalDiagonal.append(' ');
        }

        System.out.println("main Diagonal: " + mainDiagonal);
        System.out.println("incidental Diagonal: " + incidentalDiagonal);
    }
}
*/