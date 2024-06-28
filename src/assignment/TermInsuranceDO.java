package assignment;

public class TermInsuranceDO extends BasicPolicy {
	String policySeq;
	String agentopt;
	double premiumAmt;
	double sumassured;
	
	public TermInsuranceDO(String partySeq,double sumassured,String agentopt){
		super(partySeq);
		this.policySeq=Integer.toString(SingletonSequenceGenerator.getInstance().policySeq++);
		this.premiumAmt=Calculations.premiumCalculationTerm(sumassured);
		this.sumassured=sumassured;
		this.agentopt=agentopt;
	}
	public String getPolicySeq() {
		return policySeq;
	}
	public void setPolicySeq(String policySeq) {
		this.policySeq = policySeq;
	}
	public Double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	public Double getSumassured() {
		return sumassured;
	}
	public void setSumassured(Double sumassured) {
		this.sumassured = sumassured;
	}
	public String toString(){
		return " TermInsurance : \n PolicSeq : "+policySeq+"       Premium Amount :"+premiumAmt+"      sumassured :"+sumassured;
	}
	
}
