package patient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Patient {
	 int patientId;
	 String lastName,firstName,dateOfbirth,sex;
public  Patient(String lastName,String firstName) {
	this.lastName=lastName;
	this.firstName=firstName;
}

List<Patient> listPatient=new ArrayList<Patient>();

	
	Patient[] sortPatients(Patient[] patients) {
		listPatient.add(new Patient(lastName, firstName));
		for(int i=0;i<listPatient.size();i++) {
			patients[i]=new Patient(lastName, firstName);
		}
		
		Arrays.sort(patients);
		return patients;
	
	}
}
