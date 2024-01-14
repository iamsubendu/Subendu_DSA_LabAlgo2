package paymoney.dailytarget;

import java.util.Scanner;

public class DailyTargetDeterminator {

	Integer[] transactionsList;

	Integer dailyTarget;
	
	Scanner input;
	
	public DailyTargetDeterminator() {
		input = new Scanner(System.in);
	}
	
	void collectTransactionValues(){
		
		System.out.println("Transactions List: ");
		
		System.out.println("Enter the Transactions-List Size");
		
		Integer transactionsListSize = input.nextInt();
		
		transactionsList = new Integer[transactionsListSize];
		
		for (int index = 0; index < transactionsListSize; index ++) {
			
			
			System.out.printf("Transaction Value : %d / %d", 
					(index + 1), transactionsListSize);
			System.out.println();
			
			transactionsList[index] = input.nextInt();
		}
	}
	
	void collectDailyTarget() {
		
		System.out.println("Daily Target : ");
		
		dailyTarget = input.nextInt();
		
	}
	
	
	void determine() {		
		
		boolean dailyTargetAchieved = false;
		Integer overallSumOfTransactionValues = 0;
		int transactionInstancesCounter = 0;
		
		for (int index = 0; index < transactionsList.length; index ++) {
			
			
			transactionInstancesCounter ++;
			
			Integer trasactionValue = transactionsList[index];
			
			overallSumOfTransactionValues =
					overallSumOfTransactionValues + trasactionValue;
			
			if (overallSumOfTransactionValues >= dailyTarget) {
				
				dailyTargetAchieved = true;
				break;
			}
		}
		
		if (dailyTargetAchieved) {
			System.out.println("Daily Target is achieved");
			System.out.printf("Achieved after %d Instances",
				transactionInstancesCounter);
			
		}else {
			System.out.println("Daily Target not achieved");
		}
		

	}
}