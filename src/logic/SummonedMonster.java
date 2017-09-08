package logic;

public class SummonedMonster {
	private int attackbuff, defensebuff, lifetime;
	public SummonedMonster(){
		this.attackbuff =  8;
		this.defensebuff = 8;
		this.lifetime = 3;
	}
	public void decreseLifeTime(){
		this.lifetime -=1;
	}
	public int getlifetime(){
		return lifetime;
	}
	public int getattackbuff(){
		return attackbuff;
	}
	public int getdefensebuff(){
		return defensebuff;
	}
}
