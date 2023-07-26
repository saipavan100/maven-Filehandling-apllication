package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class view {
	Scanner sc = new Scanner(System.in);
	controller c = new controller();
	view v = new view();
	public void displaycommands(File obj) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 to create a new file");
		System.out.println("Enter 2 to update the file");
		System.out.println("Enter 3 to display the filecontent");
		System.out.println("Enter 4 to delete the current working file");
		System.out.println("Enter 5 to exit");

		while(true)
		{
			int c1 = sc.nextInt();
			if(c1==1)
			{
				c.createnewfile();
			}
			else if(c1==2)
			{
				c.updatefile(obj);
			}
			else if(c1==3)
			{
				v.displaycontent(obj);
			}
			else if(c1==4)
			{
				c.deleteFile(obj);
			}
			else if(c1==5)
			{
				System.exit(c1);
			}
		}
	}
	private void displaycontent(File obj) {
		// TODO Auto-generated method stub
		
	}
	
}
