package AdapterPattern;
import java.util.*;

// Data Consumer

public class Intranet {
	IPhoneListSource source;
	public Intranet(IPhoneListSource source) {
		this.source = source;
	}
	public void printPhoneNumbers () {
		List<String> phones = this.source.GetPhoneNumbers();
		System.out.println(phones);
	}
}
