package logic;

import java.util.List;
import java.util.ArrayList;

public class Arena {
	private List<Novice> novices;
	public Arena(){
		novices = new ArrayList<Novice>();
	}
	public Novice fight(Novice first,Novice second){
		while(true){
			first.action(second);
			if (second.isDefeated()){
				novices.remove(second);
				first.restoreHp();
				return first;
			}
			second.action(first);
			if (first.isDefeated()){
				novices.remove(first);
				second.restoreHp();
				return second;
			}
		}
		
	}
	public void listNovices(){
		for(Novice x: novices){
			System.out.println(x.toString());
		}
	}
	public void addNovice(Novice n){
		novices.add(n);
	}
	public Novice getNovice(int number){
		if(novices.size()<number-1){return null;}
		else{return novices.get(number-1);}
	}
	public boolean canFight(){
		boolean x=true;
		if(novices.size()<2){x=false;}
		return x;
	}
}
