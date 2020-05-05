package com.Sriwork;

public class ConditionalOperators {

	public static void main(String[] args) {
		int x = 1, y = 2;
		
		System.out.println(x <= y);
		
		//logical Operators &&
		int temperature = 20;
		boolean isWarm = temperature >= 20 || temperature <30;
		System.out.println(isWarm);
		
		//logical Operator ||
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
		System.out.println(isEligible);
	}
}
