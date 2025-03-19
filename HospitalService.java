package assign_17_05_Hospital;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HospitalService {
	private List<Hospital> hospitalList;
    private int hospitalCodeCounter;
    
 // Constructor to initialize the list and code counter
	public HospitalService() {
		super();
		this.hospitalList = new ArrayList<>();
		this.hospitalCodeCounter = 100;
	}

	// Add hospital method
	public int addHospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber, String location) {
		Hospital hospital = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
		hospital.setHospitalCode(hospitalCodeCounter++);
		hospitalList.add(hospital);
		return hospital.getHospitalCode();
		}
	
	 // Get hospitals method
	public Map<Integer, String> getHospitals() {
		Map<Integer, String> hospitalMap = new HashMap<Integer, String>();
        for(Hospital hospital : hospitalList) {
        	hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        }
        return hospitalMap;
	}
	
	// Get hospital details method by code
    public Hospital getHospitalDetails(int hospitalCode) {
        for (Hospital hospital : hospitalList) {
            if (hospital.getHospitalCode() == hospitalCode) {
                return hospital;
            }
        }
        return null;
    }
}
