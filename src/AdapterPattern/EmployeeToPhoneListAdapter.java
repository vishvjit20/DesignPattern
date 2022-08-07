package AdapterPattern;
import java.util.*;

public class EmployeeToPhoneListAdapter implements IPhoneListSource {
	public EmployeeDetails employeeDetails;
	public EmployeeToPhoneListAdapter(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	@Override
	public List<String> GetPhoneNumbers() {
		List<String> employees = this.employeeDetails.GetEmployees();
		List<String> phoneNos = new ArrayList<>();
		
		for (String employee : employees) {
			String[] details = employee.split("-");
			String phone = details[3];
			phoneNos.add(phone);
		}
		
		return phoneNos;
	}
}
