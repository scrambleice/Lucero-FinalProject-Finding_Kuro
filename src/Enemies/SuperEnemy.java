package Enemies;

/**
 * Contains all the enemies in the game
 * @param hp is the hit points of the enemy
 * @param attack is the attack damage of the enemy
 */
public abstract class SuperEnemy {
	
	protected String name;
	private int hp;
	protected int attack;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	abstract void setName();
	
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	
	abstract void setAttack();
	
	
}
