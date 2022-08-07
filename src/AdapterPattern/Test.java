package AdapterPattern;

public class Test {
	public static void main(String args[]) {
		EmployeeDetails dataSource = new EmployeeDetails();
		EmployeeToPhoneListAdapter adapter = new EmployeeToPhoneListAdapter(dataSource);
		Intranet intra = new Intranet(adapter);
		intra.printPhoneNumbers();
	}
}
