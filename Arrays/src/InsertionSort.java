
public class InsertionSort {
	
	public void InsertSort (int[] arr){
		int value,hole;
		for(int i=1;i<arr.length;i++){
			hole = i;
			value = arr[i];
			while(hole>0 && arr[hole-1]>value){
				arr[hole] = arr[hole-1];
				hole = hole - 1;
			}
			arr[hole] = value;
		}
		
	}
	public static void main(String args[]){
		int[] arr = { 0, 1, 10, 0, 5, 5, 2};
		InsertionSort s=new InsertionSort();
		s.InsertSort(arr);
		System.out.println("Sorted Elements\n");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		
	}


	
}
