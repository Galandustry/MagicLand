package creatures;

public class Battle {
	//crea1的回合
	public void round(Creature crea1,Creature crea2) {
		int num1=crea1.getAttack()-crea2.getDefense();
		if (num1>0) {
			crea2.nowHealthAdd(num1);
			System.out.println(crea2.getName()+"-"+num1);
		} else {
			System.out.println(crea2.getName()+"-0");
			System.out.println(crea2.getName()+"生命值:"+crea2.getNowhealth());
			System.out.println();
		}
	}
	
	public void normalBattle(Creature crea1,Creature crea2) {
		while(crea1.isAlive()&&crea2.isAlive()){
			round(crea1,crea2);
			round(crea2,crea1);
		}
		if (crea1.isAlive()){
			System.out.println(crea1.getName()+"赢了");
		} else {
			System.out.println(crea2.getName()+"赢了");
		}
	}
}
