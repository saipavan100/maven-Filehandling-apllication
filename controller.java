package file;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class controller {
	Scanner sc = new Scanner(System.in);
	public  File updatefile(File obj)
	{
		return obj;
		
 
		
	}

	public void createnewfile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter new file name including path");
		String fname = sc.nextLine();
		new model(fname);
		File o1 = new File(fname);
		o1.createNewFile();
		if(o1.exists())
		{
			System.out.println("File is created");
			System.out.println("Abosolute path"+o1.getAbsolutePath());
		}
	}

	public void deleteFile(File obj) {
		// TODO Auto-generated method stub
		
	}
}
