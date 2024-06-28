package assignment;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CountryStateOptions {
	LinkedHashMap<String,ArrayList<String>> countrymap =new LinkedHashMap<String,ArrayList<String>>();
		public CountryStateOptions() {
			
			ArrayList<String> statesinIndia=new ArrayList<String>();
			statesinIndia.add("Maharsahtra");
			statesinIndia.add("Uttar Pradesh");
			statesinIndia.add("Kerala");
			statesinIndia.add("Karnataka");
			statesinIndia.add("Rajasthan");
			
			ArrayList<String> statesinUSA=new ArrayList<String>();
			statesinUSA.add("California");
			statesinUSA.add("Florida");
			statesinUSA.add("Georgia");
			statesinUSA.add("Tennessee");
			statesinUSA.add("Texas");
			
			countrymap.put("India", statesinIndia);
			countrymap.put("USA", statesinUSA);
	    }
		public ArrayList<String> getStatesByCountryName(String countryName){
			return this.countrymap.get(countryName);
		}
		
		
}
