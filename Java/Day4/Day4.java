import java.util.Scanner;
import java.util.ArrayList;

public class Day4{
	private ArrayList<String> groceryList = new ArrayList<>(); 
	
	public void addToList(String item){
		groceryList.add(item);
		System.out.println(item + " has been added to list.");
	}

	public void removeFromList(String item){
		groceryList.remove(item);
		System.out.println(item + " has been removed from the list");
	}

	public void showTheList(){
		if (groceryList.isEmpty()){
			System.out.println("Nothing has been added to your list");
		}
		else {
			for (int list = 0; list < groceryList.size(); list++){
				System.out.println(groceryList.get(list));
			}
		
		}
	}

	public static void main(String[] args){
		Day4 manager = new Day4(); 
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Grocery Manager.");
		System.out.println();

		int choice;

		do {
			System.out.println("Grocery Manager App Menu:");
			System.out.println();

			System.out.println("1. Add item");
			System.out.println();

			System.out.println("2. Remove item");
			System.out.println();

			System.out.println("3. Show all available items");
			System.out.println();

			System.out.println("4. Exit");
			System.out.println();

			System.out.print("Enter your choice to continue: ");
			choice = input.nextInt();
			input.nextLine();

			if (choice == 1){
				System.out.println("Enter items to add...");
				String item = input.nextLine();
				manager.addToList(item);
			}
			else if (choice == 2){
				System.out.println("Enter item to remove: ");
				String item = input.nextLine();
				manager.removeFromList(item);
			}
			else if (choice == 3){
				System.out.println("Items in your current list are...");
				manager.showTheList();
			}
			else if (choice == 4){
				System.out.println("Exiting Grocery Manager...Please wait");
			}
			else {
				System.out.println("Invalid input.");
			}
		}
		while (choice != 4);
		input.close();
	}




}
