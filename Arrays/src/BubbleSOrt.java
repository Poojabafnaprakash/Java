
public class BubbleSOrt {
	public static void main(String args[]){
		int[] arr = {5,3,6,1,2,8,2,6,3,110,0,0};
		int flag;
		for(int i=0;i<arr.length-1;i++){
			
			// flag is needed to avoid redundant swaps when array is sorted.
			flag = 0;
			
			// the loop runs till n - i - 1 as after first sort, the elements are sorted. so needn't repeat the elements that are sorted.
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) break;
		}
		System.out.println("sorted array");
		for( int i=0;i<arr.length;i++)
			System.out.println(arr[i] + "\t");
		
	}

}
