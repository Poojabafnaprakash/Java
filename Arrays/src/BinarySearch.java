import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]){
	
		int arr[] = new int[11];
		Scanner element = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i] = element.nextInt();
		}
	
		System.out.println("Enter the number to be searched");
		int num = element.nextInt();
		int position;
		position = binarySearch(num,arr);
		System.out.println("Position " + (position+1));
		
	}
	
	public static int binarySearch(int num,int arr[]){
		
		int mid,start,end;
		start = 0;
		end = arr.length - 1;
		
		while(start<=end){
			mid = (start + end)/2;
			if (num < arr[mid]){
				end = mid - 1;
			}
			else if(num > arr[mid]){
				start = mid + 1;
			}
			else
				return mid;	
		}
		return -1;
	}

}
