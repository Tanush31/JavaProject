package assignment;

import java.util.Scanner;

public class updateData {
	public void BasicInfo(PartyDO abc){
		System.out.println("What do you want to update from basicinfo");
		System.out.println("\n1.partyTypeCD \n2.partSeq \n3.title \n4.firstName \n5.lastName \n6.genderCd");
		Scanner sc=new Scanner(System.in);				
		String option=sc.nextLine();
		if("1".equalsIgnoreCase(option)){
			System.out.println("Enter PartyType \n1.Individual \n2.Organization ");
			String select=sc.next();
			if (select.equals("1")) {
				abc.setPartyTypeCd("Individual");
			} else {
				abc.setPartyTypeCd("Organization");
			}
			System.out.println("Upadte done successfully");
		}
		else if("2".equalsIgnoreCase(option)){
			String partseq=sc.next();
			abc.setPartySeq(partseq);
			System.out.println("Upadte done successfully");
		}
		else if("3".equalsIgnoreCase(option)){
			String title=sc.nextLine();
			if (title.equals("1")) {
				abc.setTitle("Mr");
			} else if (title.equals("2")) {
				abc.setTitle("Ms");
			} else {
				abc.setTitle("Mrs");
			}
			System.out.println("Upadte done successfully");
		}
		else if("4".equalsIgnoreCase(option)){
			System.out.println("Enter firstname :");
			String newpartytype=sc.nextLine();
			abc.setPartyTypeCd(newpartytype);
			System.out.println("Upadte done successfully");
		}
		else if("5".equalsIgnoreCase(option)){
			String lastName=sc.next();
			abc.setLastName(lastName);
		}
		else{
			String gender=sc.next();
			if (gender.equals("1")) {
				abc.setGenderCd("Male");
			} 
			else if (gender.equals("2")) {
				abc.setGenderCd("Female");
			} 
			else {
				abc.setGenderCd("Transgender");
			}
		
		}
	}
}
