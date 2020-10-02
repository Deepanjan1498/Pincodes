import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode {

	public static void main(String[] args) {
		List<String> pincodes = new ArrayList<String>();

		pincodes.add("400 088");

		String regex = "^[1-9]{1}[0-9]{2}[' ']{1}[0-9]{3}$";

		Pattern pattern = Pattern.compile(regex);

		for (String pin : pincodes) {
			Matcher matcher = pattern.matcher(pin);
			System.out.println(matcher.matches());
		}
	}
}
