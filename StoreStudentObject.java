package Assign_20_02_serialization_deserialization;

import java.io.*;
import java.io.FileOutputStream;
import java.sql.Date;
import java.util.*;
class Student implements Serializable{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	@SuppressWarnings("deprecation")
	public static Student getStudentObject() {
		Scanner s = new Scanner(System.in);
		System.out.println("Student Id: ");
		int id = s.nextInt();
		System.out.println("Student Name: ");
		String name = s.next();
		System.out.println("Student Fees: ");
		double fees = s.nextDouble();
		System.out.println("Student Addmission Date: ");
		System.out.println("Date: ");
		int d = s.nextInt();
		System.out.println("Month: ");
		int m = s.nextInt();
		System.out.println("Year: ");
		int y = s.nextInt();
		return new Student(id, name, fees,  new Date(d, m, y));
	}
}
public class StoreStudentObject {

	public static void main(String[] args) throws IOException {
			var fout = new FileOutputStream("G:\\new\\Student.txt");
			var oos = new ObjectOutputStream(fout);
			try(fout; oos;) {
				Scanner s = new Scanner(System.in);
				System.out.println("How many object you want to store: ");
				int noOgObj = s.nextInt();
				for(int i=1; i<=noOgObj; i++) {
					Student student = Student.getStudentObject();
					oos.writeObject(student);
				}
				System.out.println("Object Data Stored succesfully...");
			}
	        catch (Exception e) {
			e.printStackTrace();
		}
	}

}