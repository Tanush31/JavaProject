package assignment;

import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String,PartyDO> lhm=new LinkedHashMap<String,PartyDO>();
//		LinkedHashMap <String,BasicPolicy> userData=new LinkedHashMap <String,BasicPolicy>();
		LinkedHashMap<String,LinkedHashMap <String,BasicPolicy>> policy=new LinkedHashMap<String,LinkedHashMap <String,BasicPolicy>>();
		PartyServices service=new PartyServices();
		
		while(true){
			System.out.println("Enter the operation You want to perform :- " +
					"\n1.Create \n2.Update \n3.Delete \n4.Search \n5.Download \n6.Buy Policy \n7.SearchByPartyType \n8.Sales Data ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			AgentData.agentcreate();
			switch(n){
				case 1 :
					PartyDO user = new PartyDO();
					Registration r=new Registration();
					r.registerNewUser(user);
					lhm.put(user.getPartySeq(), user);
				break;
				case 2:
					service.updateUser(lhm);
					break;
					
				case 3:
					service.removeData(lhm);
					break;
				case 4:
			
					service.searchUser(lhm);
					break;
				case 5:
					service.downloadUser(lhm);
					break;
//				case 6:
//					service.displayuser(lhm);
//					break;
				case 6:
					service.Buypolicy(lhm);
					break;
				case 7:
					SearchByPartyType.PatyType(lhm);
					break;
				case 8:
					AgentWiseSalesData.AgentSumassured();
					break;
				case 9:
					SearchAgentWise.SearchAgent();
					break;
				default:
					System.out.println("Thanks");
					break;
			}
			System.out.println("Do you want to continue ?");
			String ans=sc.next();
			if("no".equalsIgnoreCase(ans)){
				break;
			}
			
		}
//		System.out.println(obj);
		System.out.println("Thank you");
	    
	}

}
