
public class MergeSort {
	
	 private int[] list;

	   
	    public MergeSort(int[] listToSort) {
		list = listToSort;
	    }

	   
	    public int[] getList() {
		return list;
	    }

	   
	    public void sort() {
		list = sort(list);
	    }
	
	private int[] sort(int [] array_to_sort)
	{
		if(array_to_sort.length==1)
			return array_to_sort;
		else{
		
		int [] left_arr=new int[array_to_sort.length/2];
		
		System.arraycopy(array_to_sort, 0, left_arr, 0, left_arr.length);
		
		
		int [] right_arr= new int[array_to_sort.length-left_arr.length];
		System.arraycopy(array_to_sort, left_arr.length, right_arr, 0, right_arr.length);
	
		left_arr=sort(left_arr);
		right_arr=sort(right_arr);
		
		merge(left_arr,right_arr,array_to_sort);
		
		return array_to_sort;
		
		
	
		}
		
	}
	

	private  void merge(int[] left_arr, int[] right_arr, int[] result) {
		
		int x=0;
		int y=0;
		int k=0;
		while(x<left_arr.length && y<right_arr.length)
		{
			if(left_arr[x]<right_arr[y])
				{
					result[k]=left_arr[x];
					x++;
				
				}
			else
				{
				result[k]=right_arr[y];
				y++;
				}
			k++;
		}
		
		int[] rest;
		int restIndex;
		if (x >= left_arr.length) {

		    rest = right_arr;
		    restIndex = y;
		}
		else {

		    rest = left_arr;
		    restIndex = x;
		}

		for (int i=restIndex; i<rest.length; i++) {
		    result[k] = rest[i];
		    k++;
		}
		
		
	}


	public static void main(String [] args )
	{
		int[] arr={3,2,5,1,4,8,9};
		System.out.println("Unsorted:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println();
		MergeSort sortObject= new MergeSort(arr);
		sortObject.sort();
		
		
		System.out.println("Sorted:");
        int [] sorted = sortObject.getList();

        for(int i = 0;i< sorted.length ; i++){
            System.out.print(sorted[i] + " ");
        }

	
	}
}
