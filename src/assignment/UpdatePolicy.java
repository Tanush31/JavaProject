package assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class UpdatePolicy {
	public void updPolicy(){
	 for (Map.Entry<String, LinkedHashMap<String, BasicPolicy>> entry : PolicyMap.policy.entrySet()) 
     {
         LinkedHashMap<String, BasicPolicy> policies = entry.getValue();

         for (Map.Entry<String, BasicPolicy> policyEntry : policies.entrySet()) 
         {
        	 BasicPolicy policy = policyEntry.getValue();

             if (policy instanceof TermInsuranceDO)
             {
                 TermInsuranceDO termPolicy = (TermInsuranceDO) policy;
                 double newPremium = termPolicy.getPremiumAmt() * 1.05; 
                 termPolicy.setPremiumAmt(newPremium);
             } 
             else if (policy instanceof HealthInsuranceDO) {
                 HealthInsuranceDO healthPolicy = (HealthInsuranceDO) policy;
                 double newPremium = healthPolicy.getPremiumAmt() * 1.07; 
                 healthPolicy.setPremiumAmt(newPremium);
             }
         }
     }
	}
}
