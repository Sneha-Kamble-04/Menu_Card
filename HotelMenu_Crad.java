package Menu_Card;

import java.util.Scanner;

public class HotelMenu_Crad 
{
	
	public static void main(String[] args) 
	{
		int choice , Item_choice,quantity;
		
		int price=0;
		char ans;
		String Item="";
		Scanner sc = new Scanner(System.in);
		System.out.println("------- Welcome to Sneha's Hotel -----------");
		do
			{
			//Hotel Menus
			System.out.println("This is The Menu Card  :");
			System.out.println("1.Starter :");
			System.out.println("2.Main Course :");
			System.out.println("3.Desert :");
			System.out.println("4.Drinks:");
			choice=sc.nextInt();// Choice from customer fav Menu Item
			switch(choice)
			{
			case 1:
				do
				{
				//Starter for you
				System.out.println("Please Select Your Favourite Starter :");
				System.out.println("1.Panipuri \t\t\t 40/-");
				System.out.println("2.Vadapav  \t\t\t 30/-");
				System.out.println("3.Kachori  \t\t\t 50/-");
				System.out.println("4.Dabeli   \t\t\t 40/-");
				Item_choice = sc.nextInt();//Starter Item Choice from Customer
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();//Item Quantity 
					switch(Item_choice)
					{
					case 1:
						price+=40*quantity;
						Item+="\nPanipuri \t\t\t40Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 2:
						price+=30*quantity;
						Item+="\nVadapav \t\t\t 30Rs"+"\t\t"+quantity+"\n";
						break;
					
					case 3:
						price+=50*quantity;
						Item+="\nKachori \t\t\t 50Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 4:
						price+=40*quantity;
						Item+="\nDabeli \t\t\t 40Rs"+"\t\t"+quantity+"\n";
						break;
					}
					System.out.println("Do You Want To add any item from Starter menu Y/N");
					ans=sc.next().charAt(0);
				}while(ans=='Y'||ans=='y');
				break;
			case 2:
				do
				{
				//Main Course for you
				System.out.println("Please Select Your Favourite Main Course :");
				System.out.println("1.Masala Dosa  \t\t\t 80/-");
				System.out.println("2.Idli Wada    \t\t\t 70/-");
				System.out.println("3.Pulaw        \t\t\t 60/-");
				System.out.println("4.Paw Bhaji    \t\t\t 120/-");
				Item_choice = sc.nextInt();//Main Cousre Item choice from Customer
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();//Item Quantity
					switch(Item_choice)
					{
					case 1:
						price+=80*quantity;
						Item+="\nMasala Dosa \t\t\t 80Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 2:
						price+=70*quantity;
						Item+="\nIdli Wada \t\t\t 70Rs"+"\t\t"+quantity+"\n";
						break;
					
					case 3:
						price+=60*quantity;
						Item+="\nPulaw \t\t\t\t 60Rs"+"\t\t"+quantity+"\n";
						break;
						
					case 4:
						price+=120*quantity;
						Item+="\nPaw Bhaji \t\t\t 120Rs"+"\t\t"+quantity+"\n";
						break;
					}
					System.out.println("Do You Want To add any item from Main Course menu Y/N");
					ans=sc.next().charAt(0);
				}while(ans=='Y'||ans=='y');
			break;
				
			
			case 3:
				do
				{
				//Desert for you
				System.out.println("Please Select Your Favourite Desert :");
				System.out.println("1.MotiChur Laduu \t\t\t 100/-");
				System.out.println("2.Butter Scoatch \t\t\t  90/-");
				System.out.println("3.Modak          \t\t\t  60/-");
				System.out.println("4.Kaju Pista     \t\t\t  90/-");
				Item_choice = sc.nextInt();//Desert Item choice from Customer
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();//Item Quantity
				switch(Item_choice)
				{
				case 1:
					price+=100*quantity;
					Item+="\nMotiChur Laduu \t\t\t 100Rs"+"\t\t"+quantity+"\n";
					break;
					
				case 2:
					price+=90*quantity;
					Item+="\nButter Scoatch \t\t\t 90Rs"+"\t\t"+quantity+"\n";
					break;
				
				case 3:
					price+=60*quantity;
					Item+="\nModak \t\t\t 60Rs"+"\t\t"+quantity+"\n";
					break;
					
				case 4:
					price+=90*quantity;
					Item+="\nKaju Pista \t\t\t 90Rs"+"\t\t"+quantity+"\n";
					break;
				}
				System.out.println("Do You Want To add any item from Desert menu Y/N");
				ans=sc.next().charAt(0);
			}while(ans=='Y'||ans=='y');
			break;
			
			
			case 4:
				do
				{
				//Drinks for you
				System.out.println("Please Select Your Favourite Drinks :"); 
				System.out.println("1.Pepsi    \t\t\t 60/-");
				System.out.println("2.CocaCola \t\t\t 40/-");
				System.out.println("3.Sprite   \t\t\t 50/-");
				System.out.println("4.Thums Up \t\t\t 40/-");
				Item_choice = sc.nextInt();//Drinks Item choice from Customer
				System.out.println("You are Order is Here ="+Item_choice);
				System.out.print("Enter You are quantity =");
				quantity=sc.nextInt();//Item Quantity
				switch(Item_choice)
				{
				case 1:
					price+=60*quantity;
					Item+="\nPepsi\t\t\t 60Rs"+"\t"+quantity+"\n";
					break;
					
				case 2:
					price+=40*quantity;
					Item+="\nCocaCola\t\t 40Rs"+"\t"+quantity+"\n";
					break;
				
				case 3:
					price+=50*quantity;
					Item+="\nSprite \t\t\t 50Rs"+"\t\t"+quantity+"\n";
					break;
					
				case 4:
					price+=40*quantity;
					Item+="\nThums Up \t\t\t 40Rs"+"\t\t"+quantity+"\n";
					break;
				}
				System.out.println("Do You Want To add any item from Drinks menu Y/N");
				ans=sc.next().charAt(0);
			}while(ans=='Y'||ans=='y');
			break;

			default:
				System.out.println("Invalid choice");
				
			}
				System.out.println("Do you want to add another Item Y/N");
				ans=sc.next().charAt(0);
			}
		while(ans=='Y'||ans=='y');
		System.out.println("Thank you for coming \n Have a Good Day");
		System.out.println("\nYou are Billing Details ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("\nYou are orders Items\t\t\t Your Orders Quantities "+Item);
		System.out.println("You are Total Bill is=\t\t\t\t"+price);
	}
}
