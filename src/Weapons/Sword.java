package Weapons;

/**
 * @author Icyl Kate Lucero
 * This class inherits members in SuperWeapon superclass
 * Found if player decides to go to Abandoned Cabin
 */
public class Sword extends SuperWeapon{
	public Sword(){
        setName();
        setDamage();
    }

	@Override
	void setName() {
		this.name = "Sword";
		
	}

	@Override
	void setDamage() {
		this.damage = 10;
		
	}
}
