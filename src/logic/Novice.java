package logic;

public class Novice {
	protected String name;
	protected int maxhp,hp,attack,defense;
	
	public Novice(String name,int maxhp,int attack,int defense){
		this.name = name;
		this.maxhp = (maxhp<1)? 1:maxhp;
		this.hp = this.maxhp;
		this.attack = (attack<1)? 1:attack;
		this.defense = (defense<1)? 1:defense;
	}
	public String toString(){
		return this.name+" | HP : "+this.maxhp+" | Atk : "+this.attack+" | Def : "+this.defense;
	}
	public void action(Novice opponent){
		opponent.takeDamage(this.attack-opponent.defense);
	}
	public void takeDamage(int damage){
		if(damage<1){damage = 1;}
		this.hp = this.hp - damage;
		if (this.hp<0){this.hp=0;}
	}
	public boolean isDefeated(){
		boolean x = true;
		if(this.hp==0){x = false;}
		return x;
	}
	public void restoreHp(){
		this.hp = this.maxhp;
	}
	public String getName(){
		return name;
	}
	public int gethp(){
		return hp;
	}
	public int getAttack(){
		return attack;
	}
	public int getdefense(){
		return defense;
	}
}
