package assign_17_05_Hospital;

import java.util.Arrays;
public class HospitalFinder {
    public static void main(String[] args) {
        // Create a HospitalService object
        HospitalService hospitalService = new HospitalService();

        // Adding hospitals to the service
        int hospitalCode1 = hospitalService.addHospital(
                "YASHODA",
                Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"),
                "MATHEWS",
                "9848222222",
                "Sec"
        );
        
        int hospitalCode2 = hospitalService.addHospital(
                "APOLLO",
                Arrays.asList("Cardiac", "Neurology", "Orthopedics"),
                "SMITH",
                "9848222223",
                "North City"
        );
        
        // Get list of hospitals
        System.out.println("Hospitals:");
        hospitalService.getHospitals().forEach((code, name) -> System.out.println("Code: " + code + ", Name: " + name));

        // Fetching hospital details using hospital code
        Hospital hospitalDetails1 = hospitalService.getHospitalDetails(hospitalCode1);
        if (hospitalDetails1 != null) {
            System.out.println("\nDetails of Hospital Code " + hospitalCode1 + ":");
            System.out.println(hospitalDetails1);
        } else {
            System.out.println("\nHospital not found with code " + hospitalCode1);
        }
   
     // Fetching another hospital details
        Hospital hospitalDetails2 = hospitalService.getHospitalDetails(hospitalCode2);
        if (hospitalDetails2 != null) {
            System.out.println("\nDetails of Hospital Code " + hospitalCode2 + ":");
            System.out.println(hospitalDetails2);
        } else {
            System.out.println("\nHospital not found with code " + hospitalCode2);
        }
    }
}