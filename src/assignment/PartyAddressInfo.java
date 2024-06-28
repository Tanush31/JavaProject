package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PartyAddressInfo{
	public void addrupdate(PartyDO obj){
		System.out.println("Enetr PartyAddressSeq :");
		Scanner sc=new Scanner(System.in);
		String PartAddressSeq=sc.next();
		System.out.println("What do you want to upgrade ");
		
		for(PartyAddressDO addr: obj.addresslist){
			if(addr.getPartyAddressSeq().equals(PartAddressSeq)){
			while(true){
				
					System.out.println("\n1.partySeq \n2.partyAddressSeq \n3.addressType \n4.countryCd \n5.stateCd \n6.primaryAddress");
					String option=sc.next();
					if(option.equals("1")){
						String Seq=sc.nextLine();
						addr.setPartySeq(Seq);
						System.out.println("Upadte done successfully");
						break;
					}
					else if(option.equals("2")){
						String addrseq=sc.next();
						addr.setPartyAddressSeq(addrseq);
						System.out.println("Upadte done successfully");
						break;
					}
					else if(option.equals("3")){
						String addtype=sc.next();
						if (addtype.equals("1")) {
							addr.setAddressType("Residential");
						} else {
							addr.setAddressType("Office");
						}
						System.out.println("Upadte done successfully");
						break;
					}
					else if(option.equals("4")){
						System.out.println("Enetr country :");
						String country=sc.next();
						CountryStateOptions stateoptions=new CountryStateOptions();
						addr.setCountryCd(country);
						ArrayList<String> availablestates=stateoptions.getStatesByCountryName(addr.getCountryCd());
						for(String state : availablestates ){
							System.out.println(state);
						}
						System.out.println("Enter State :");
						String state=sc.next(); 
						addr.setStateCd(state);
						System.out.println("Upadte done successfully");
						break;
					}
					else if(option.equals("5")){
						String state=sc.next(); 
						addr.setStateCd(state);
						System.out.println("Upadte done successfully");
						break;
					}
					else if(option.equals("6")){
						System.out.println("Enter Primary :");
						int choice = sc.nextInt();
						if (choice == 1) {
							addr.setPrimaryAddress("Yes");
						} else {
							addr.setPrimaryAddress("No");
						}
						System.out.println("Upadte done successfully");
						break;
					}
					else{
						System.out.println("Upadte unsuccessful");
					}
					
				}
				
			}	
			
		}
				
		}
			
			
	
}
