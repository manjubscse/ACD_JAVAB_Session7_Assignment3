import java.util.Scanner;
public class ClassBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	     // initialize the StringBuffer object
        StringBuffer sb = new StringBuffer("");
        System.out.println("Initial Capacity is "+sb.capacity());
        // ask for user input
        System.out.print("Please enter any input:");
        Scanner s = new Scanner(System.in);
        sb.append(s.nextLine());
        // print the length of string buffer contents      
        System.out.println("capapcity after user input:"+sb.capacity());   
        // Append the below text
        sb.append(" Java Class");
        //Print the String after appending string.
        System.out.println(sb);
        //Print the new capacity of string buffer
        System.out.println("New Capacity:"+sb.capacity());
        s.close();
	}
	

}
