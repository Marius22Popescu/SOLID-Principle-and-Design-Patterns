package org.FactoryMethod;

//Creates an instance of several derived classes. Define an interface for creating a single obje ct, but let subclasses 
//decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
public class PlanFactory {
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if (planType.contentEquals("ResidentialPlan")) {
			return new ResidentialPlan();
		}
		if (planType.contentEquals("CommercialPlan")) {
			return new ComercialPlan();
		}
		if (planType.contentEquals("StateGovernament")) {
			return new StateGovernament();
		}
		return null;
	}
}
