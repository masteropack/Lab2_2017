package logic;

public class Summoner extends Novice{
	private int cooldown;
	private static final int MAX_COOL_DOWN=8;
	private SummonedMonster summonedMonster;
	
	public Summoner(String name, int hp, int attack, int defense){
		super(name,hp,attack,defense);
		this.cooldown = 0;
	}
	public void action(Novice opponent){
		if(summonedMonster != null){
			summonedMonster.decreseLifeTime();
			if(summonedMonster.getlifetime() == 0){this.desummon();}
		}
		if(summonedMonster == null && cooldown ==0){
			this.summon();
		}
		super.action(opponent);
		if(cooldown > 0){cooldown-=1;}
	}
	public SummonedMonster getSummonedMonster(){
		return summonedMonster;
	}
	public void summon(){
		summonedMonster = new SummonedMonster();
		this.attack += summonedMonster.getattackbuff();
		this.defense += summonedMonster.getdefensebuff();
		this.cooldown = MAX_COOL_DOWN;
	}
	private void desummon(){
		this.attack -= summonedMonster.getattackbuff();
		this.defense -= summonedMonster.getdefensebuff();
		summonedMonster = null;
	}
}
