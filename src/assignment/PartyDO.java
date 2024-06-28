package assignment;
import java.util.*;
public class PartyDO {
	String partyTypeCD;
	String partySeq;
	String title;
	String firstName;
	String lastName;
	String genderCd;
	Date dateofbirth;
	int age;
	ArrayList<PartyAddressDO> addresslist = new ArrayList<PartyAddressDO>();
	ArrayList<partyContactDO> contactlist = new ArrayList<partyContactDO>();

	public String getPartyTypeCD() {
		return partyTypeCD;
	}
	public void setPartyTypeCd(String partyTypeCD) {
		this.partyTypeCD = partyTypeCD;
	}
	public String getPartySeq() {
		return partySeq;
	}
	public void setPartySeq(String partySeq) {
		this.partySeq = partySeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGenderCd() {
		return genderCd;
	}
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}
	
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<PartyAddressDO> getAddresslist() {
		return addresslist;
	}
	public void setAddresslist(ArrayList<PartyAddressDO> addresslist) {
		this.addresslist = addresslist;
	}
	public ArrayList<partyContactDO> getContactlist() {
		return contactlist;
	}
	public void setContactlist(ArrayList<partyContactDO> contactlist) {
		this.contactlist = contactlist;
	}
	public String toString(){
		return  "[ Title : " + title + "\n"+"First Name: "+ firstName +"\n"+"Gender :"+genderCd+"\n"+ "AddressList" + addresslist +"partyTypeCD : " + partyTypeCD +"\n" +"partySeq : " + partySeq +"\n"+"Age :" +age+"]" ;
	}
	
}
