package _S_05_02_FireFox_Options;

import org.openqa.selenium.firefox.FirefoxOptions;

public class _Private {

	public static void main(String[] args) {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--width=1280");
		options.addArguments("--height=800");
		options.addArguments("--private");  // Launch in private mode
	}
}