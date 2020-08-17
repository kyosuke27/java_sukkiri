package lesson07_08;

import java.util.Random;


public class Cleric {
	String name;
	int hp=50,mp=10;
	final int MAX_HP=50,MAX_MP=10;
	
	public void selfAid() {
		System.out.println(this.name+"はセルフエイドを唱えた！");
		mp-=5;
		hp=MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int time) {
		System.out.println(this.name+"は"+time+"秒間祈った！");
		int recover=new Random().nextInt(3)+time;
		System.out.println("MPが"+recover+"回復した");
		return  recover;
	}
}
