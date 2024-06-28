package assignment;

public class AgentDO {
	String agentID;
	String agentname;

	public AgentDO(String agentID,String agentname){
		this.agentID=agentID;
		this.agentname=agentname;
	
	}
	public String getAgentID() {
		return agentID;
	}
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

	public String getAgentname() {
		return agentname;
	}
	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}
public String toString(){
	return "AgentID :"+agentID+"        Agent Name : "+agentname; 
}
	
	
}
