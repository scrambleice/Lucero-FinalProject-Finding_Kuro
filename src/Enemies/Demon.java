package Enemies;

/**
 * This class inherits members of SuperEnemy superclass
 * @author Icyl Kate Lucero
 */
public class Demon extends SuperEnemy{
	
	public Demon(){
		setName();
		setHp(25);
		setAttack();
	}

	@Override
	public void setName() {
		this.name = "Demon";
		
	}

	@Override
	void setAttack() {
		this.attack  = 15;
		
	}
	
}
