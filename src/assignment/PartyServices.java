package assignment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PartyServices {
	
	updateData upd=new updateData();
	PartyAddressInfo addressinfo=new PartyAddressInfo();
	UpdatePolicy update=new UpdatePolicy();
		public void removeData(LinkedHashMap<String,PartyDO> userData)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter partySeq you want to delete: ");
			String partySeq = sc.next();
			
			if(userData.containsKey(partySeq))
			{
				userData.remove(partySeq);
				System.out.println("partySeq" + partySeq + "Deleted");
			}
			else
			{
				System.out.println("Entered partySeq doesn't exists");
			}
			
		}
		public void searchUser(LinkedHashMap<String,PartyDO> userData)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("What do you want to Search?? \n1.User Data \n2.Policy Data");
			String search=sc.next();
			if("1".equalsIgnoreCase(search)){
				System.out.println("Enter partySeq you want to search: ");
				String partySeq = sc.next();
				if(userData.containsKey(partySeq))
				{
					System.out.println("party details :" + userData.get(partySeq) + "");
				}
				else
				{
					System.out.println("Entered partySeq doesn't exists");
				}
			}
			else if("2".equalsIgnoreCase(search))
			{
				System.out.println("Enter partySeq you want to search: ");
				String partySeq = sc.next();
				if(!PolicyMap.policyData.containsKey(partySeq)){
					System.out.println("Enter a valid partySeq");
				}
				else{
					System.out.println("What do you want to search : \n1.TermInsurance \n2.HealthInsurance \n3.Both");
					String ans=sc.next();
					if("1".equalsIgnoreCase(ans)){
						for(Map.Entry<String,BasicPolicy> entry :PolicyMap.policyData.entrySet()){
							BasicPolicy ab=entry.getValue();
							if(ab instanceof TermInsuranceDO)
							{
								TermInsuranceDO terminsurance=(TermInsuranceDO)ab;
								System.out.println(terminsurance);
							}
						}
					
					}
					else if("2".equalsIgnoreCase(ans)){
						for(Map.Entry<String,BasicPolicy> entry :PolicyMap.policyData.entrySet()){
							BasicPolicy ab=entry.getValue();
							if(ab instanceof HealthInsuranceDO)
							{
								HealthInsuranceDO healthinsurance=(HealthInsuranceDO)ab;
								System.out.println(healthinsurance);
							}
						}
					}
					else{
						for(Map.Entry<String,BasicPolicy> entry :PolicyMap.policyData.entrySet()){
							BasicPolicy ab=entry.getValue();
							if(ab instanceof TermInsuranceDO)
							{
								TermInsuranceDO terminsurance=(TermInsuranceDO)ab;
								System.out.println(terminsurance);
							}
						}
						for(Map.Entry<String,BasicPolicy> entry :PolicyMap.policyData.entrySet()){
							BasicPolicy ab=entry.getValue();
							if(ab instanceof HealthInsuranceDO)
							{
								HealthInsuranceDO healthinsurance=(HealthInsuranceDO)ab;
								System.out.println(healthinsurance);
							}
						}
					}
					
				}
			}
		}
		public void downloadUser(LinkedHashMap<String,PartyDO> userData){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter partySeq you want to download: ");
			String partySeq = sc.next();
			
			if(userData.containsKey(partySeq))
			{
				try {
					FileUtil.createFile("C:\\Users\\Tanush.shetty\\Documents\\Demo", "user.text", userData.get(partySeq).toString());
					System.out.println("File Downloaded Successfully");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Download Failed");
				}
			}
			else
			{
				System.out.println("Entered partySeq doesn't exist ");
			}
		}
		public void updateUser(LinkedHashMap <String,PartyDO> userData){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter partySeq you want to upgrade: ");
			String partySeq = sc.next();
			System.out.println("What do you want to upgrade ?");
			PartyDO obj=userData.get(partySeq);
			if(userData.containsKey(partySeq)){
				
//				\n2.partSeq \n3.title \n4.firstName \n5.lastName \n6.genderCd
				System.out.println("\n1.BasicInfo \n2.PartyAddressDOInfo \n3.BasicPolicy  ");
				String chooseoption=sc.next();
				
				while(true){
					
					if(chooseoption.equalsIgnoreCase("1")){
						upd.BasicInfo(obj);
						break;
					}
					else if(chooseoption.equalsIgnoreCase("2")){
						addressinfo.addrupdate(obj);
					break;
					}
					else if(chooseoption.equalsIgnoreCase("3")){
						update.updPolicy();
						break;
					}
					else{
						System.out.println("choose correct option");
					}
				}
				
			}
		}
		public void Buypolicy(LinkedHashMap <String,PartyDO> lhm){
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter PartySeq :");
			String PartySeq =sc.next();
			while(true){
				
				if(lhm.containsKey(PartySeq)){
					System.out.println("Enter \n1.TermInsuranceDO \n2.HealthInsuranceDO");
					String a=sc.next();
					System.out.println("Enter sumassured :");
					double sumassured=sc.nextDouble();
					System.out.println("Choose agent");
					for(String key:PolicyMap.agentspolicy.keySet()){
						System.out.println(key+ ":"+PolicyMap.agentspolicy.get(key).getAgentname());
					}
					String agentopt =sc.next();
				    if("1".equalsIgnoreCase(a)){
			
				    	TermInsuranceDO termInsurance=new TermInsuranceDO(PartySeq,sumassured,agentopt);
//				
				    	termInsurance.setPremiumAmt(Calculations.premiumCalculationTerm(sumassured));
				    	System.out.println(termInsurance.getPremiumAmt());
				    	
				    	PolicyMap.policyData.put(termInsurance.getPolicySeq(),termInsurance);
				    	System.out.println(PolicyMap.policyData);
				    	
				    	System.out.println("Agent Information");
				    	System.out.println(PolicyMap.agentspolicy.get(agentopt));
				
				    }
				    else{
				    	
						HealthInsuranceDO healthInsurance=new HealthInsuranceDO(PartySeq,sumassured,agentopt);
//			
						healthInsurance.setPremiumAmt(Calculations.premiumCalculationHealth(sumassured));
						healthInsurance.setHealthcare(0.05*sumassured);
						
						PolicyMap.policyData.put(healthInsurance.getPolicySeq(), healthInsurance); 
						System.out.println(PolicyMap.policyData);
						
						System.out.println("Agent Details");
						System.out.println(PolicyMap.agentspolicy.get(agentopt));
				    }
				}
				else{
					System.out.println("Invalid PartySeq");
				}
				
				System.out.println("Do you want to continue \n1.yes \n2.No");
				String ans=sc.next();
				if("2".equalsIgnoreCase(ans)){
					break;
				}
			}
			PolicyMap.policy.put(PartySeq, PolicyMap.policyData);
			System.out.println(PolicyMap.policy);	
			System.out.println("Thanks for buying policy");
			
		}

}
