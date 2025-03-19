package assign_17_05_Hospital;
import java.util.List;

public class Hospital {
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments ;
	private String contactNumber;
	private String contactPerson;
	private String location;
	public Hospital(String hospitalName, List<String> listOfTreatments , String contactNumber, String contactPerson,String location) {
		super();
		this.hospitalName = hospitalName;
		this.listOfTreatments  = listOfTreatments ;
		this.contactNumber = contactNumber;
		this.setContactPerson(contactPerson);
		this.location = location;
	}
	public int getHospitalCode() {
		return hospitalCode;
	}
	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public List<String> getListOfNumber() {
		return listOfTreatments ;
	}
	public void setListOfNumber(List<String> listOfNumber) {
		this.listOfTreatments  = listOfNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
				+ listOfTreatments + ", contactNumber=" + contactNumber + ", contactPerson=" + contactPerson
				+ ", location=" + location + "]";
	}
	
	
}
