package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Registration {

	public void registerNewUser(PartyDO obj) throws ParseException {

		System.out.println("Enter PartyType \n1.Individual \n2.Organization ");
		Scanner sc = new Scanner(System.in);
		if (sc.nextLine().equals("1")) {
			obj.setPartyTypeCd("Individual");
		} else {
			obj.setPartyTypeCd("Organization");
		}

		System.out.println("Enter PartySeq");
		obj.setPartySeq(Integer.toString(SingletonSequenceGenerator.getInstance().partySequence++));
		System.out.println(obj.getPartySeq());
//		String sequence=sc.nextLine();
//		

		System.out.println("Enter Tiltle \n1. Mr \n2. Ms \n3. Mrs :");
		String option = sc.nextLine();
		if (option.equals("1")) {
			obj.setTitle("Mr");
		} else if (option.equals("2")) {
			obj.setTitle("Ms");
		} else {
			obj.setTitle("Mrs");
		}

		System.out.println("Enter firstName :");
		String firName = sc.nextLine();
		boolean checkname = Fname(firName);
		if (!checkname) {
//			obj.setFirstName(firName);
			while (true) {
				System.out.println("Please enter correct name");
				firName = sc.nextLine();
				checkname = Fname(firName);
				if (checkname) {
					break;
				}
			}
		}
		obj.setFirstName(firName);

		System.out.println("Enter lastName :");
		obj.setLastName(sc.nextLine());

		System.out.println("Enter date :");
		String datastr = sc.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setLenient(false);
		Date date=null;
		Date today=new Date();
		try{
			date=format.parse(datastr);
			
		}catch(ParseException e){

		}
		if(date==null || date.compareTo(today)>0){
			while(true){
				try{
					System.out.println("invalid date! please type a valid date");
					datastr=sc.nextLine();
					date=format.parse(datastr);
					if(date.compareTo(today)<=0){
						break;
					}
				}catch(ParseException e){
					System.out.println("invalid date!");
				}
				
				
			}
		}
		obj.setAge(DateUtilAge.getAge(date, today));

		System.out.println("Enter gendercd \n1. Male \n2. Female \n3. Transgender");
		String gender=sc.nextLine();
		if (gender.equals("1")) {
			obj.setGenderCd("Male");
		} 
		else if (gender.equals("2")) {
			obj.setGenderCd("Female");
		} 
		else {
			obj.setGenderCd("Transgender");
		}

		while (true) {
			PartyAddressDO addr = new PartyAddressDO();

			System.out.println("Enter Details: ");
			System.out.println("Enter AddressType: \n1. Residential \n2. Office");
			if (sc.nextLine().equals("1")) {
				addr.setAddressType("Residential");
			} else {
				addr.setAddressType("Office");
			}
			
			System.out.println("Enter PartySeq: ");
//			if(addr.getPartySeq().contains(seq)){
//				while(true){
//					System.out.println("Eneter a unique sequence ");
//					seq=sc.nextLine();
//					if(!addr.getPartySeq().contains(seq)){
//						break;
//					}
//				}
//			}
			addr.setPartySeq(obj.getPartySeq());
			System.out.println(addr.getPartySeq());
//			addr.setPartySeq(obj.getPartySeq());

			System.out.println("Enter PartyAddressSeq: ");
			addr.setPartyAddressSeq(Integer.toString(SingletonSequenceGenerator.getInstance().partyAddressSeq++));
			System.out.println(addr.getPartyAddressSeq());
		

			System.out.println("Enter CountryCd India/USA: ");
			addr.setCountryCd(sc.next());
			CountryStateOptions stateoptions=new CountryStateOptions();
			ArrayList<String> availablestates=stateoptions.getStatesByCountryName(addr.getCountryCd());
			for(String state : availablestates ){
				System.out.println(state);
			}

			System.out.println("Enter State code from above mentioned list: ");
			addr.setStateCd(sc.next());

			System.out.println("Your PrimaryAddress ? \n1.Yes \n2.No: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				addr.setPrimaryAddress("Yes");
			} else {
				addr.setPrimaryAddress("No");
			}

			obj.getAddresslist().add(addr);
			System.out.println("Do u want to add more address ?");
			String ans = sc.next();
			if (ans.equals("no")) {
				boolean checkp = checkPrime(obj);

				if (checkp == false) {
					setPrimarySeq(obj);
					break;
				} else
					break;
			}
//			partyContactDO contact=new partyContactDO();
//			System.out.println("Enter Contact seq :");
//			contact.setPartyContactSeq(sc.nextLine());
//			
//			System.out.println("Enter contact number :");
//			contact.setContactType(sc.nextLine());
//			
//			System.out.println("Enter Contact Number :");
//			contact.setContactNum(sc.nextLine());
//			
		}
		System.out.println(obj);
	}

	public void setPrimarySeq(PartyDO obj) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(obj);
			System.out.println("which addres do you want to make it primary?  Enter the seq number");
			String parseq = sc.nextLine();
			Boolean flag = false;
			for (PartyAddressDO ab : obj.getAddresslist()) {
				if (parseq.equals(ab.getPartyAddressSeq())) {
					ab.setPrimaryAddress("yes");
					flag = true;
				}

			}
			if (flag)
				break;
			else
				System.out.println("please enter a valid party sequence");

		}
	}

	public boolean checkPrime(PartyDO obj) {
		boolean foundprimary = false;
		for (PartyAddressDO ab : obj.getAddresslist()) {
			if ("Yes".equals(ab.getPrimaryAddress())) {
				foundprimary = true;
			}
		}
		return foundprimary;
	}

	public boolean Fname(String Firname) {
		boolean flag = false;
		if (Pattern.matches("[a-zA-Z]+", Firname) && !Firname.equals(" ")) {
			flag = true;
		}
		return flag;
	}
}
