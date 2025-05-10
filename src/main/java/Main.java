import creatures.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int playerLevel = rand.nextInt(100) + 1;
		Creature player = new Creature(playerLevel);
		System.out.println("玩家等级:" + playerLevel);
		Battle battle = new Battle();
		Scanner scan = new Scanner(System.in);
		while (true) {
			Creature enemy = new Creature(50);
			battle.normalBattle(player, enemy);
			System.out.println("是否继续？");
			String str1 = scan.nextLine();
		}
	}
}
