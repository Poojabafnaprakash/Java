
public class MergeSort {

	public static int[] merge(int[] arr){
		
		
		
		if(arr.length <=1){
		return arr;
		}
		
		int mid;
		mid = arr.length/2;
		int[] right;
		int[] left = new int[mid];
		int[] result;
		
		if(arr.length % 2 == 0){
			 right = new int[mid];
		}
		else {
			right = new int[mid+1];
		}	
		for(int i=0;i<mid;i++){
			left[i] = arr[i];
		}
		int x=0;
		for(int j=mid;j<arr.length;j++){
			if(x < right.length){
				right[x] = arr[j];
				x++;
			}
			
		}
		
		left = merge(left);
		right = merge(right);
		result = sort(left,right);
		return result;
		
	}
	
	public static int[] sort(int[] left,int[] right){
		
		int i=0, j=0,k=0;
		int result[]=new int[left.length+right.length];
		
		while(i < left.length || j < right.length)
		{
			if(i < left.length && j < right.length)
			{
				if(left[i] < right[j])
				{
					result[k] = left[i];
					i++;
				}
				else
				{
					result[k] = right[k];
					j++;
				}
				k++;
			}
			else if(i < left.length)
			{
				result[k] = left[i];
				i++;
				k++;
			}
			else if(j < right.length)
			{
				result[k] = right[j];
				j++;
				k++;
			}
		}
		return result;
		
	}
	public static void main(String args[]){
		
		int arr[]={2,0,6,8,8,10};
		arr = merge(arr);
		System.out.println("SOrted Array by Merge sort\n");
		for(int i=0;i < arr.length; i++)
			System.out.println(arr[i]);
		
	
		
		
	}
}
