package AdapterPattern;
import java.util.*;

public class EmployeeDetails {
	public List<String> GetEmployees() {
		List<String> employees = new ArrayList<>();
		employees.add("1-ABC-SDE1-6982117631");
		employees.add("2-DEF-SDE2-8502481686");
		employees.add("3-PQR-HR-9220006791");
		employees.add("4-LMN-Manager-9584500618");
		employees.add("5-XYZ-Business Analyst-9080122333");
		employees.add("6-GHI-Architect-9835555005");
		return employees;
	}
}
