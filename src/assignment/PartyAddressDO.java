package assignment;

public class PartyAddressDO {
	String addressType;
	String partySeq;
	String partyAddressSeq;
	String countryCd;
	String stateCd;
	String primaryAddress;
	
	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getPartySeq() {
		return partySeq;
	}

	public void setPartySeq(String partySeq) {
		this.partySeq = partySeq;
	}

	public String getPartyAddressSeq() {
		return partyAddressSeq;
	}

	public void setPartyAddressSeq(String partyAddressSeq) {
		this.partyAddressSeq = partyAddressSeq;
	}

	public String getCountryCd() {
		return countryCd;
	}

	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}

	public String getStateCd() {
		return stateCd;
	}

	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}

	public String getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}

	public String toString(){
		return "[ addressType : "+ addressType +"\n"+ "partySeq :" + partySeq +"\n"+"partyAddressSeq :" +partyAddressSeq +"\n"+  "countryCd :"+countryCd +"\n"+ "stateCd :"+stateCd +"\n"+ "primaryAddress :"+primaryAddress+"]";
	}
	
}
