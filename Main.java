import java.util.ArrayList;
import java.util.Scanner;
//
public class Main
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String name;
		int vit, str, dex, spd, atk;
		Being player = null;
		Being enemy = null;
		Weapon pWeapon = null;
		Weapon eWeapon = null;
		Combat c;
		Being dPlayer = new Being("Human", 50, 3, 5, 1, 0, 0, 0, 0, 0, null);
		Being dEnemy = new Being("Orc", 50, 5, 3, 1, 0, 0, 0, 0, 0, null);
		Weapon dPWeapon = new Weapon("sword", 0, 0, 0, 5);
		Weapon dEWeapon = new Weapon("dagger", 0, 0, 0, 3);
		
		System.out.println("Welcome to -insert game name here-!");
		while(true)
		{
			System.out.println("");
			System.out.println("Please select an operation by entering its numerical value and pressing Enter.");
			System.out.println("1: Create a player");
			System.out.println("2: Create a weapon");
			System.out.println("3: Create an enemy");
			System.out.println("4: Create an enemy weapon");
			System.out.println("5: Initiate combat between created objects");
			System.out.println("6: Initiate combat between default objects");
			System.out.println("7: Close");
			int input;
			input = scan.nextInt();
			switch(input)
			{
			case 1:
				System.out.println("Enter your player name: ");
				name = scan.next();
				scan.nextLine();
				System.out.println("Enter you player's Health as a whole number: ");
				vit = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your player's Strength as a whole number: ");
				str = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your player's Dexterity as a whole number: ");
				dex = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your player's Speed as a whole number: ");
				spd = scan.nextInt();
				scan.nextLine();
				player = new Being(name, vit, str, dex, spd, 0, 0, 0, 0, 0, null);
				System.out.println("Success! " + player.getName() + "has been created!");
				break;
				
			case 2:
				System.out.println("Enter your weapon name: ");
				name = scan.next();
				scan.nextLine();
				System.out.println("Enter your weapon's Attack as a whole number: ");
				atk = scan.nextInt();
				scan.nextLine();
				pWeapon = new Weapon(name, 0, 0, 0, atk);
				System.out.println("Success! " + pWeapon.getName() + "has been created!");
				break;
				
			case 3:
				System.out.println("Enter your enemy's name: ");
				name = scan.next();
				scan.nextLine();
				System.out.println("Enter you enemy's Health as a whole number: ");
				vit = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your enemy's Strength as a whole number: ");
				str = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your enemy's Dexterity as a whole number: ");
				dex = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your enemy's Speed as a whole number: ");
				spd = scan.nextInt();
				scan.nextLine();
				enemy = new Being(name, vit, str, dex, spd, 0, 0, 0, 0, 0, null);
				System.out.println("Success! " + enemy.getName() + "has been created!");
				break;
				
			case 4:
				System.out.println("Enter your enemy's weapon name: ");
				name = scan.next();
				scan.nextLine();
				System.out.println("Enter your enemy's weapon's Attack as a whole number: ");
				atk = scan.nextInt();
				scan.nextLine();
				eWeapon = new Weapon(name, 0, 0, 0, atk);
				System.out.println("Success! " + eWeapon.getName() + "has been created!");
				break;
				
			case 5:
				if(player == null)
				{
					System.out.println("Please create a player!(Enter 1)");
					break;
				}
				if(enemy == null)
				{
					System.out.println("Please create an enemy!(Enter 2)");
					break;
				}
				if(pWeapon == null)
				{
					System.out.println("Please create a weapon for your player!(Enter 3)");
					break;
				}
				if(eWeapon == null)
				{
					System.out.println("Please create a weapon for your enemy!(Enter 4)");
					break;
				}
				c = new Combat(player, pWeapon, enemy, eWeapon);
				String cont;
				while(true)
				{
					System.out.println("/////////////////////////////////////////////////////");
					System.out.println("Your player:");
					System.out.println(player.getName());
					System.out.println("Health: " + player.getVit());
					System.out.println("Strength: " + player.getStr());
					System.out.println("Dexterity: " + player.getDex());
					System.out.println("Speed: " + player.getSpd());
					System.out.println("Weapon: " + pWeapon.getName() + " (" + pWeapon.getAtk() + " attack)");
					System.out.println("");
					System.out.println("Your enemy:");
					System.out.println(enemy.getName());
					System.out.println("Health: " + enemy.getVit());
					System.out.println("Strength: " + enemy.getStr());
					System.out.println("Dexterity: " + enemy.getDex());
					System.out.println("Speed: " + enemy.getSpd());
					System.out.println("Weapon: " + eWeapon.getName() + " (" + eWeapon.getAtk() + " attack)");
					System.out.println("//////////////////////////////////////////////////////");
					System.out.println("");
					c.battle();
					System.out.println("");
					System.out.println("Continue? Y/N");
					cont = scan.next();
					scan.nextLine();
					if(cont.equals("Y") || cont.equals("y"))
					{
						continue;
					}
					else if(cont.equals("N") || cont.equals("n"))
						break;
					else
					{
						System.out.println("Invalid input. Exiting battle.");
						break;
					}
				}
				System.out.println("");
				System.out.println("Would you like to restore the fighters' health? Y/N");
				cont = scan.next();
				scan.nextLine();
				if(cont.equals("Y") || cont.equals("y"))
				{
					int health;
					System.out.println("Enter a whole number to set your player's health at.");
					health = scan.nextInt();
					player.setVit(health);
					System.out.println("Enter a whole number to set your enemy's health at.");
					health = scan.nextInt();
					enemy.setVit(health);
				}
				else if(cont.equals("N") || cont.equals("n"))
					break;
				else
				{
					System.out.println("Invalid input. Fighters will not be healed.");
					break;
				}
				break;
								
			case 6:
				c = new Combat(dPlayer, dPWeapon, dEnemy, dEWeapon);
				String cont2;
				while(true)
				{
					System.out.println("/////////////////////////////////////////////////////");
					System.out.println("Your player:");
					System.out.println(dPlayer.getName());
					System.out.println("Health: " + dPlayer.getVit());
					System.out.println("Strength: " + dPlayer.getStr());
					System.out.println("Dexterity: " + dPlayer.getDex());
					System.out.println("Speed: " + dPlayer.getSpd());
					System.out.println("Weapon: " + dPWeapon.getName() + " (" + dPWeapon.getAtk() + " attack)");
					System.out.println("");
					System.out.println("Your enemy:");
					System.out.println(dEnemy.getName());
					System.out.println("Health: " + dEnemy.getVit());
					System.out.println("Strength: " + dEnemy.getStr());
					System.out.println("Dexterity: " + dEnemy.getDex());
					System.out.println("Speed: " + dEnemy.getSpd());
					System.out.println("Weapon: " + dEWeapon.getName() + " (" + dEWeapon.getAtk() + " attack)");
					System.out.println("//////////////////////////////////////////////////////");
					System.out.println("");
					c.battle();
					System.out.println("");
					System.out.println("Continue? Y/N");
					cont2 = scan.next();
					scan.nextLine();
					if(cont2.equals("Y") || cont2.equals("y"))
					{
						continue;
					}
					else if(cont2.equals("N") || cont2.equals("n"))
						break;
					else
					{
						System.out.println("Invalid input. Exiting battle.");
						break;
					}
				}
				System.out.println("");
				System.out.println("Would you like to restore the fighters' health? Y/N");
				cont2 = scan.next();
				scan.nextLine();
				if(cont2.equals("Y") || cont2.equals("y"))
				{
					dPlayer.setVit(50);
					dEnemy.setVit(50);
					System.out.println("Fighters' health restored to default.");
				}
				else if(cont2.equals("N") || cont2.equals("n"))
					break;
				else
				{
					System.out.println("Invalid input. Fighters will not be healed.");
					break;
				}
				break;
				
			case 7:
				System.exit(0);
				
			default:
				System.out.println("Invalid input. Please enter a whole number corresponding to one of the listed cases.");
				break;
			}
		}
	}
}
