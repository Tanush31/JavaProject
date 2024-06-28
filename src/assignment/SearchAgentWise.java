package assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchAgentWise {
  public static void SearchAgent(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter agentid: ");
	  String agent=sc.next();
	  int countTermInsurance=0;
	  int counttHealthInsurance=0;
	  for(Map.Entry<String,LinkedHashMap<String,BasicPolicy>> agenpolicies:PolicyMap.policy.entrySet())
	  {
		  LinkedHashMap<String, BasicPolicy>eachuserpolicy=agenpolicies.getValue();
		  for(Map.Entry<String,BasicPolicy>user1:eachuserpolicy.entrySet())
		  {
			  if(user1.getValue() instanceof TermInsuranceDO)
			  {
				  if(((TermInsuranceDO)user1.getValue()).agentopt.equals(agent))
				  {  
//					  System.out.println("For TermInsurance :");
//					  System.out.println(PolicyMap.policy);
					  System.out.println((TermInsuranceDO)user1.getValue());
					  countTermInsurance++;
				  }
			  }
			  else if(user1.getValue() instanceof HealthInsuranceDO)
			  {
					  if(((HealthInsuranceDO)user1.getValue()).agentopt.equals(agent))
					  {
						  System.out.println((HealthInsuranceDO)user1.getValue());
						  counttHealthInsurance++;
					  }
			  }
			  
		  }
	  }
	  System.out.println("TermInsirance :");
	  System.out.println(countTermInsurance);
	  System.out.println("HealthInsirance :");
	  System.out.println(counttHealthInsurance);
  }
}
