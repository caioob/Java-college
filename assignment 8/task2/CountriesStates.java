package task2;

import java.util.HashMap;
import java.util.Map;

public class CountriesStates {
	Map<String, String> stateCapital = new HashMap<>();
	
	CountriesStates(){
		stateCapital.put("ontario", "Toronto");
		stateCapital.put("quebec", "Quebec City");
		stateCapital.put("nova scotia", "Halifax");
		stateCapital.put("new brunswick", "Fredericton");
		stateCapital.put("manitoba", "Winnipeg");
		stateCapital.put("british columbia", "Victoria");
		stateCapital.put("prince edward island", "Charlottetown");
		stateCapital.put("saskatchewan", "Regina");
		stateCapital.put("alberta", "Edmonton");
		stateCapital.put("newfoundland and labrador", "St. John's");
	}
	
	public String findCapital(String state) {
		return stateCapital.get(state.toLowerCase());
	}
}
