package assignment;

public class partyContactDO {
	String partyContactSeq;
	String contactType;
	String contactNum;
	public String getPartyContactSeq() {
		return partyContactSeq;
	}
	public void setPartyContactSeq(String partyContactSeq) {
		this.partyContactSeq = partyContactSeq;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	@Override
	public String toString() {
		return "partyContactDO [PartyContactSeq()=" + partyContactSeq
				+ ", getContactType()=" + contactType
				+ ", getContactNum()=" + contactNum + "]";
	}
	
	
}
