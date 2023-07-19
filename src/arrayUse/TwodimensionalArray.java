package arrayUse;

public class TwodimensionalArray {

	public static void main(String[] args) {
		int[][] ar=new int[2][2];
		ar[0][0]=1;
		ar[0][1]=2;
		ar[1][0]=3;
		ar[1][1]=4;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=0;j<=ar.length-1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
