//Rock Paper Scissor Game

package MiniProject;
import java.util.Scanner;
import java.util.Random;//importing random class to generate random numbers
class RockPaperScissor {
	public static void main(String[] args) {
		// 0 for Rock
		// 1 for Paper
		// 2 for Scissor
		Random random = new Random();
		int computerInput = random.nextInt(3);//generating random number as computer input
		int compwincount=0;
		int userwincount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("This is best of five.Let's begin!");
		for (int i=0;i<5;i++) {//for loop for attempts
			
			System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
			int userInput = sc.nextInt();
			//conditions
			if (userInput>2) {
				System.out.println("Invalid choice\nyou loose for breaking the rules\n(computer +1 point)");
				compwincount++;
			}
			else {
				if(computerInput==0){
					System.out.println("Computer choice: Rock");
				}
				else if(computerInput==1){
					System.out.println("Computer choice: Paper");
				}
				else if(computerInput==2){
					System.out.println("Computer choice: Scissors");
				}
				if (userInput == computerInput) {
					System.out.println("Draw(Both +1 point)");
					compwincount++;
					userwincount++;
				}
				else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
							|| userInput == 2 && computerInput == 1) {
				System.out.println("Congratualtion!You Win!(You +1 point)");
				userwincount++;
				} else {
				System.out.println("Oops!Computer Win!(Computer +1 point)");
				compwincount++;
				}
			}	   
		}
		System.out.print("computer score : "+compwincount);
		System.out.println("\nyour score : "+userwincount);
		if(compwincount>userwincount) {
			System.out.println("computer won");
		} else if(compwincount==userwincount) {
			System.out.println("Draw");
		} else {
			System.out.println("you won");
		}
	}
}

