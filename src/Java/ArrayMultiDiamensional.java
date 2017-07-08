package Java;

public class ArrayMultiDiamensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] list = {{1,2},{4,5}};
		
		// For row
		for(int i=0;i<2;i++){
			// For column
			for(int j=0; j<2;j++){
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
	}
}