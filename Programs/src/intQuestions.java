import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class intQuestions {
	public static void main(String[] args) {
		String name="Govind.20Bhombe(250000000)";
		System.out.println(name);
		// Regular expression to match the value between parentheses
		Pattern pattern = Pattern.compile("\\((.*?)\\)");
		Matcher matcher = pattern.matcher(name);

		// Check if the pattern is found
		if (matcher.find()) {
			// Extract the value between parentheses
			String valueInParentheses = matcher.group(1);
			System.out.println("Value in between parentheses: " + valueInParentheses);
		} else {
			System.out.println("No value found between parentheses.");
		}
	}
}

