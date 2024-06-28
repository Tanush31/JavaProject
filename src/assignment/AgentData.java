package assignment;

public class AgentData {
	public static void agentcreate(){
		AgentDO agent1=new AgentDO("1","Harsh");
		AgentDO agent2=new AgentDO("2","Rishabh");
		AgentDO agent3=new AgentDO("3","Karan");
		AgentDO agent4=new AgentDO("4","Saurabh");
		AgentDO agent5=new AgentDO("5","Laksh");
		
		
		PolicyMap.agentspolicy.put(agent1.agentID, agent1);
		PolicyMap.agentspolicy.put(agent2.agentID, agent2);
		PolicyMap.agentspolicy.put(agent3.agentID, agent3);
		PolicyMap.agentspolicy.put(agent4.agentID, agent4);
		PolicyMap.agentspolicy.put(agent5.agentID, agent5);
	}
}
