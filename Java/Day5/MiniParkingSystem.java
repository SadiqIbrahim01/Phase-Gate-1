//collect integer input from user to perfeorm action
//if user enters 1, user will enter slot to park in if not occupied
//if user enters 2, user will leave slot except if empty already
//if user enters 3, slot status will show based on current actions
//if user enters 4, application exits smoothly

import java.util.Scanner;

public class MiniParkingSystem{
	private int[] carSlots = new int[20];
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		MiniParkingSystem slotManager = new MiniParkingSystem();
		int action;
		int slot;

		do {
			System.out.println("Welcome. Select an option to perform actions");
			System.out.println();

			System.out.println("1. Enter parking slot");
			System.out.println();

			System.out.println("2. Leave parking slot");
			System.out.println();

			System.out.println("3. Show slot status");
			System.out.println();

			System.out.println("4. Exit application");
			System.out.println();
		
			System.out.print("Enter an action: ");
			action = input.nextInt();
			System.out.println();

			
			if (action == 1){
				System.out.print("Enter slot to fill: ");
				slot = input.nextInt();
				slotManager.enterParkingSlot(slot);
			}
			else if (action == 2){
				System.out.print("Enter slot number to leave slot: ");
				slot = input.nextInt();
				slotManager.leaveParkingSlot(slot);
			}
			else if (action == 3){
				System.out.println("Current parking status is...");
				slotManager.showParkingStatus();
			}
			else if (action == 4){
				System.out.println("Exiting app...please wait!");
			}
		}
		while (action != 4);
		input.close();
		
	}

		public void enterParkingSlot(int slot){
			if (slot < 1 || slot > 20){
				System.out.println("Invalid slots have a range of only 1 - 20");
			}
			else if (carSlots[slot] != 0){
				System.out.println("Slot " + slot + " is already occupied.");
			}
			else {
				carSlots[slot] = slot;
				System.out.println("Slot " + slot + " entered successfully");
			}
			System.out.println();
		}

		public void leaveParkingSlot(int slot){
			if (slot < 1 || slot > 20){
				System.out.println("Invalid slots have a range of only 1 - 20");
			}
			else if (carSlots[slot] == 0){
				  System.out.println("Slot " + slot + " is already empty.");
			}
			else {
				carSlots[slot] = 0;
				System.out.println("Slot " + slot + " left successfully");
			}
			System.out.println();
		}
		
		public void showParkingStatus(){
			boolean allEmpty = true;
			for (int availableSlots = 1; availableSlots < carSlots.length; availableSlots++){
				if (carSlots[availableSlots] != 0){
					allEmpty = false;
					break;
				}
			}
			if (allEmpty){
				System.out.println("All slots are empty");
			}
			else {
				for (int number = 1; number < carSlots.length; number++){
					System.out.println("Slot " + number + " is " + (carSlots[number] == 0 ? "available" : "occupied"));
				}
			}
			System.out.println();
		}




}

