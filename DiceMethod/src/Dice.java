import java.util.Scanner;

public class Dice {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random randomN = new Random();
		int Dice1;
		int Dice2;
		int Dice3;
		int UserChoice=0;
		int UserPick = 0;
		
		Dice1 = randomN.Dice1();
		Dice2 = randomN.Dice2();
		Dice3 = randomN.Dice3();
		
		
		
		System.out.printf("How many dice do you want to roll? Type 1-3 to chose.");
		UserChoice = input.nextInt();
		
		if(UserChoice == 1){
		
			System.out.printf("I will roll one dice. Chose a number between 1 and 6.");
			UserPick = input.nextInt();
			
	   if(UserPick == Dice1)
		   System.out.printf("You are correct the number was %d .",Dice1);
		
	   else if(Dice1 != UserPick)
			System.out.printf("You were wrong the number was %d .", Dice1);
		}
		
		
	   if(UserChoice == 2){
		
			System.out.printf("I will roll one dice. Chose a number between 2 and 12.");
			UserPick = input.nextInt();
		
	   if (UserPick == Dice2)
		   System.out.printf("You are correct the number was %d .",Dice2);
		
	   else if(Dice2 != UserPick)
			System.out.printf("You were wrong the number was %d .", Dice2);
		
	
	   }
	   
	   
	   if(UserChoice == 3){
		
			System.out.printf("I will roll one dice. Chose a number between 3 and 18.");
			UserPick = input.nextInt();
		
	  if (UserPick == Dice3)
		   System.out.printf("You are correct the number was %d .",Dice3);
		
	  else if(Dice3 != UserPick) 
			System.out.printf("You were wrong the number was %d .", Dice3);
		
		
	   }
		
	}
}
	
		
	


