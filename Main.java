package file;
import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		controller c = new controller();
		Scanner sc = new Scanner(System.in);
		File obj = new File("C:\\Users\\Vignan\\eclipse-workspace\\file\\input.txt");
		if(obj.exists())
		{
			view v = new view();
			v.displaycommands(obj);
			
		}
	}

}
