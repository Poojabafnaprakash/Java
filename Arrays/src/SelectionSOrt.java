//Space complexity : o(1)
//Time complexity: o(n^2)
public class SelectionSOrt {
	public static void main(String args[]){
		int[] arr = {5,6,7,7,1,3,2,5,10};
		int min,temp;
		for(int i=0;i<arr.length-2;i++){
			min = i;
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Sorted array\n");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
