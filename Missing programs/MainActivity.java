import java.util.Scanner;
public class MainActivity{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("For first matrix");
		System.out.println("Enter number of rows:");
		int row=in.nextInt();
		System.out.println("Enter number of columns:");
		int col=in.nextInt();
		MatrixOperations matrixOperations=new MatrixOperations();
		int[][] a=matrixOperations.readMatrix(row,col);
		
		System.out.println("For second matrix");	
		System.out.println("Enter number of rows:");
		row=in.nextInt();
		System.out.println("Enter number of columns:");
		col=in.nextInt();
		int[][] b=matrixOperations.readMatrix(row,col);
		int choice;
		do{
			System.out.printf("1.Addition\n2.Subtraction\n3.Multiplication\n4.Exit\nEnter your choice:");
			choice=in.nextInt();
			switch(choice){
				case 1:
					int[][] addition=matrixOperations.addMatrix(a,b);
					matrixOperations.displayMatrix(addition);
					break;
				case 2:
					int[][] subtract=matrixOperations.subtractMatrix(a,b);
					matrixOperations.displayMatrix(subtract);
					break;
				case 3:
					int [][] multiply=matrixOperations.multiplyMatrix(a,b);
					matrixOperations.displayMatrix(multiply);
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid choice.");

			}

		}while(choice!=4);
	}
}

class MatrixOperations{
	public int[][] readMatrix(int row, int col){
		Scanner in=new Scanner(System.in);
		int[][] matrix =new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				matrix[i][j]=in.nextInt();

		return matrix;
	}
	public int[][] addMatrix(int[][] a,int[][] b){
		if(a.length==b.length && a[0].length==b[0].length){
			int[][] res=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++)
				for(int j=0;j<a[0].length;j++)
					res[i][j]=a[i][j]+b[i][j];
			return res;
		}
		else
		{
			System.out.println("Addition not possible.");
			return null;
		}
	}

	public int[][] subtractMatrix(int[][] a,int[][] b){
		if(a.length==b.length && a[0].length==b[0].length){
			int[][] res=new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++)
				for(int j=0;j<a[0].length;j++)
					res[i][j]=a[i][j]-b[i][j];
			return res;
		}
		else
		{
			System.out.println("Subtraction not possible.");
			return null;
		}
	}

	public int[][] multiplyMatrix(int[][] a,int[][] b){
		if(a[0].length==b.length)
		{
			int[][] res=new int[a.length][b[0].length];
			for(int i=0;i<a.length;i++)
				for(int j=0;j<b[0].length;j++)
					for(int k=0;k<b.length;k++)
						res[i][j]+=a[i][k]*b[k][j];
			return res;
		}
		else
		{
			System.out.println("Multiplication not possible.");
			return null;
		}
	}

	public void displayMatrix(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println("");
		}

	}
}
