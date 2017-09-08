package logic;

public class Mage extends Novice{
	public Mage(String name, int hp, int attack, int defense){
		super(name,hp,attack,defense);
	}
	public void action(Novice opponent){
		super.action(opponent);
		super.action(opponent);
	}
}
