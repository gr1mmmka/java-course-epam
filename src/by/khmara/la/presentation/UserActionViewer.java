package by.khmara.la.presentation;

public class UserActionViewer {

	public static String loginationAnswer(boolean result) {

		String response;
		if (result) {
			response = "0 User hello";
		} else {
			response = "1 erro";
		}
		
		return response;
	}
}
