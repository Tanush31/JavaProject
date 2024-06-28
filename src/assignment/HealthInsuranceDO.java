package assignment;

public class HealthInsuranceDO extends BasicPolicy{
	String policySeq;
	String agentopt;
	double premiumAmt;
	double sumassured;
	double healthcare;
	
	
	public HealthInsuranceDO(String partySeq,double sumassured,String agentopt) {
		// TODO Auto-generated constructor stub
		super(partySeq);
		this.policySeq=Integer.toString(SingletonSequenceGenerator.getInstance().policySeq++);
		this.premiumAmt=Calculations.premiumCalculationHealth(sumassured);
		this.sumassured=sumassured;
		this.healthcare =(5/100)*sumassured;
		this.agentopt=agentopt;
	}
	public String getPolicySeq() {
		return policySeq;
	}
	public void setPolicySeq(String policySeq) {
		this.policySeq = policySeq;
	}
	public double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	public double getSumassured() {
		return sumassured;
	}
	public void setSumassured(double sumassured) {
		this.sumassured = sumassured;
	}
	public double getHealthcare() {
		return healthcare;
	}
	public void setHealthcare(double healthcare) {
		this.healthcare = healthcare;
	}
	public String toString(){
		return "HealthInsurance : \n PolicSeq : "+policySeq+"       Premium Amount :"+premiumAmt+"      sumassured :"+sumassured+    "HealthCare: "+healthcare;
	}
}
