/*
 * Step 1: Represent Account Holder details in below
 * Step 2: Create a Java Class with name as TableName and Variables as column names.
 * Step 3: Create another class where we will create objects for Account Holder class.
 * Step 4: Create objects for Tom, Henry and Sarah and provide details as below.
 * Step 5: Run and Validate
 * 
 * ---> Account Holder
 * First Name, Last Name, Age, Account Balance, Eligible for Credit Card
 * Tom, Smith, 21, 10000 
 * Henry, Hill, 31, 20000 
 * Sarah, Miller, 41, 30000 
 * Eligibility for Credit Card: 
 * 	--> Age > 25, 
 *  --> Account Balance >= 2000
 */


package oopsConcepts;

public class AccountHolder {
	
	String firstName, lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;
	
	public void testEligibilityForCreditCard() {
		
		if(age > 25 && accountBalance >= 2000) {
			eligibleForCreditCard=true;
		}
	}

}
