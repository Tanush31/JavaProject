package assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchByPartyType {
	public static void PatyType(LinkedHashMap<String, PartyDO> user){
		for(Map.Entry<String,PartyDO> partType:user.entrySet()){
			PartyDO userData=partType.getValue();
			if("Individual".equalsIgnoreCase(userData.getPartyTypeCD())){
				System.out.println(userData);
			}
		}
	}
}

