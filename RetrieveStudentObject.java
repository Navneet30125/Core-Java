package Assign_20_02_serialization_deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveStudentObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		var fin = new FileInputStream("G:\\new\\Student.txt");
		var ois = new ObjectInputStream(fin);
		
		try(ois; fin)
		{
			 Student emp = null;
			 
			 while((emp = (Student)ois.readObject()) !=null)
			 {
				 System.out.println(emp);
			 }	
		}
		catch(java.io.EOFException e)
		{
			System.err.println("End of file is reached!!!!");
			
		}
		
		
	}

}
