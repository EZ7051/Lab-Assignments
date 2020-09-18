package d1;

public class Copy {

	public static int[] copyOf(int[] array)
	{
		int[] arr = new int[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			arr[i] = array[i];
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5};
		int[] tmp = new int[arr.length];
		
		tmp = copyOf(arr);
		
		for(int i:tmp)
			System.out.println(i);
	}

}
