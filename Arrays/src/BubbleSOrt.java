
public class BubbleSOrt {
	public static void main(String args[]){
		int[] arr = {5,3,6,1,2,8,2,6,3,110,0,0};
		int flag;
		for(int i=0;i<arr.length-1;i++){
			flag = 0;
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
