import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode {

	public static void main(String[] args) {
		List<String> pincodes = new ArrayList<String>();

		pincodes.add("A400088");

		String regex = "^[0-9]{6}$";

		Pattern pattern = Pattern.compile(regex);

		for (String pin : pincodes) {
			Matcher matcher = pattern.matcher(pin);
			System.out.println(matcher.matches());
		}
	}
}
