package d1;

public class Time {

	public static void main(String[] args) {
		
		int[] arr = new int[9];
		
		for(int i=0;i<9;i++)
		{
			arr[i] = i+1;
		}
		
		frameWork(arr);
		
		multiples(arr);
	}

	private static void frameWork(int[] arr) {
		System.out.print("* | ");
		
		for(int i:arr)
			System.out.print(i+ " ");
		
		System.out.println();
		for(int i=0;i<22;i++)
			System.out.print("-");
		System.out.println();
	}

	private static void multiples(int[] arr) {
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" | ");
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[i]*arr[j] + " ");
			}
			System.out.println();
		}
	}

}
