package assignment;

import java.util.LinkedHashMap;

import java.util.Map;

import java.util.Scanner;

public class AgentWiseSalesData {
    public static void AgentSumassured(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter agentid: ");
    	String agent=sc.next();
    	double sum=0;
    	
    	for(Map.Entry<String,LinkedHashMap<String, BasicPolicy>> agenpolicies:PolicyMap.policy.entrySet())
    	{
    		LinkedHashMap<String,BasicPolicy> eachuserpolicy=agenpolicies.getValue();
    		for(Map.Entry<String,BasicPolicy> user1:eachuserpolicy.entrySet())
    		{
    			if(user1.getValue() instanceof TermInsuranceDO)
				{
					if(((TermInsuranceDO)user1.getValue()).agentopt.equals(agent))
					{
						sum += ((TermInsuranceDO)user1.getValue()).getSumassured(); 
					}
					
				}
				else if(user1.getValue() instanceof HealthInsuranceDO)
				{
					if(((HealthInsuranceDO)user1.getValue()).agentopt.equals(agent))
					{
						 sum += ((HealthInsuranceDO)user1.getValue()).getSumassured();
					}
				 
				}
    		}
    	}
    	System.out.println("Total sumassured");
    	System.out.println(sum);
    }
}
