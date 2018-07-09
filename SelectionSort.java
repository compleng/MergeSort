
public class SelectionSort {
	
	public static int [] selectionsort(int [] arr)
	{
		int tmp=0;
		int minvalue=0;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			minvalue =i;
			
			for (int j = i; j < arr.length; j++) {
				
				if (arr[j] < arr[minvalue]) {
					
					minvalue = j;
					
				}
			}
			
			tmp = arr[i];
			arr[i] = arr[minvalue];
			arr[minvalue] = tmp;
			
		}
		
		
		
		return arr;
		
	}
	
	
	public static void main(String [] args ){
		
		int [] arr = {3,8,4,6,1,7,9,2,15,10};
		
		
		System.out.print("Unsorted:");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int [] result = selectionsort(arr);
		
		System.out.print("Sorted:");
		for (int i = 0; i < result.length; i++) {
			
			System.out.print(result[i] + " ");
		}
		
		
	}

}
