import java.util.Scanner;

public class MainProgram {

	public static void main(String args[]){
		Friends frnd = new Friends();
		Scanner name = new Scanner(System.in);
		System.out.printf("Enter the name of the girl:", name);
		String Tempfrnd = name.nextLine();
		frnd.setName(Tempfrnd);
		frnd.display();
	}
	
	
}
