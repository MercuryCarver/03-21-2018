import java.util.Scanner;
public class Scannerarrayfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] array = new String[3];
System.out.println("Put in 3 names");
Scanner input = new Scanner(System.in);
for(int i=0; i<=array.length-1;i++) {
	array[i]=input.nextLine();
}
for(int b = 0; b<=array.length-1; b++) {
	System.out.println(array[b]);
}
	}

}
