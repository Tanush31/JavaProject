package assignment;

public class SingletonSequenceGenerator {
	int partySequence;
	int partyAddressSeq;
	int policySeq;
	static SingletonSequenceGenerator sequenceData;
	
	private SingletonSequenceGenerator(){
		this.partySequence=1;
		this.partyAddressSeq=1;
		this.policySeq=1;
	}
	public static SingletonSequenceGenerator getInstance(){
		if(sequenceData==null){
			sequenceData=new SingletonSequenceGenerator();
			return sequenceData;
		}
		else{
			return sequenceData;
		}
	}
}
