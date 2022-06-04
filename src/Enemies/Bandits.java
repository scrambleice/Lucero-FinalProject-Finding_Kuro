package Enemies;

/**
 * @author Icyl Kate Lucero
 * This class inherits members of SuperEnemy superclass
 */
public class Bandits extends SuperEnemy{
	
	public Bandits(){
		setName();
		setHp(10);
		setAttack();
	}

	@Override
	public void setName() {
		this.name = "Bandits";
		
	}

	@Override
	void setAttack() {
		this.attack = 8;
		
	}
}
