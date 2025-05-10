package creatures;

import java.util.Random;

public class Creature {
	private String name;
	private Backpack backpack;
	private int level;
	private int health;
	private int attack;
	private int defense;
	private int nowHealth;

	//构造器——————————————————
	public Creature() {
		name = randomName();
		backpack = new Backpack();
		level = 1;
		health = 10;
		attack = 3;
		defense = 1;
	}
	
	public Creature(int level) {
		this();
		this.level=level;
		health=level*10;
		attack=level*3;
		defense=level;
	}

	//方法———————————————————
	//其他方法
	public String randomName() {
		String[] firstNames = {"John", "Michael", "David", "William", "James", "Robert", "Joseph", "Thomas", "Charles", "Christopher"};
		String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};
		Random random = new Random();
		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];
		return firstName + " " + lastName;
	}
	//展示方法
	public void showName() {
		System.out.println("名称:" + name+"(lv."+level+")");
	}

	public void show() {
		showName();
		backpack.showResourceNums();
	}
	//判定方法
	public boolean isAlive() {
		if (nowHealth > 0) {
			return true;
		} else {
			return false;
		}
	}
	//得到方法
	public String getName() {
		return name;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}
	
	public int getNowhealth() {
		return nowHealth;
	}
	//改变方法
	public void nowRetrieve() {
		nowHealth = health;
	}

	public void nowHealthAdd(int num1) {
		nowHealth += num1;
	}

	//子类———————————————————
	private class Backpack {
		int length = Resource.values().length;
		Resource[] resources = new Resource[length];
		int[] nums = new int[length];

		Backpack() {
			for (int i = 0; i < length; i++) {
				nums[i] = 0;
			}
		}

		public void showResourceNums() {
			for (int i = 0; i < length; i++) {
				if (nums[i] > 0) {
					System.out.println(resources[i].name + ":" + nums[i]);
				}
			}
		}

	}

}
