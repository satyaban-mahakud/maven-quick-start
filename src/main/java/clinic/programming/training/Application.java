package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Application {
	public Application() {
		System.out.println("Inside Application");
	}

	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");

		for (String greeting : greetings) {
			System.out.println("Greeting: " + greeting);
		}
	}

	// Returns word count.
	public int countWords(String strInput) {
		String[] words = StringUtils.split(strInput, ' ');
		return (words == null) ? 0 : words.length;
	}

	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application app = new Application();

		// Calling greeting function.
		app.greet();

		// Calling word count function.
		String inputString = "This morning i got up very late.";
		System.out.println(inputString + " contain " + app.countWords(inputString) + "words.");
	}
}