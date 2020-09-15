package day1;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<ArrayList<Integer>> pasl = new ArrayList<ArrayList<Integer>>(10);
		
		int[][] pasl = new int[10][10];
		
		
		 
		int val = 10;
		
		for(int i=0;i<val;i++) {
			//ArrayList<Integer> a = new ArrayList<>();
			for(int j=0;j<=i;j++)
			{
				if(i==0)
				{
					pasl[i][0] = 1;
				}
				else if(i==1) {
					pasl[i][0] = 1;
					pasl[i][1] = 1;
				}
				else if(j==0) {
					pasl[i][j] = 1;
				}
				else if(i==j){
					pasl[i][j] = 1;
				}
				else {
					pasl[i][j] = pasl[i-1][j-1] + pasl[i-1][j];
				}
				
				
			}
		}
		for(int i=0;i<val;i++)
		{
			for(int j=0;j<val;j++)
			{
			    if(pasl[i][j] == 0) {
			    	break;
			    }
			    else
				System.out.print(pasl[i][j]);
			}
			System.out.println();
		}
			
		
	}

}
