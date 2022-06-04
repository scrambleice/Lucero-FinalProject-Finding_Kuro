package Weapons;

/**
 * @author Icyl Kate Lucero
 *This class inherits members in SuperWeapon superclass
 *Award of player from Evergreen Town after defeating bandits
 */
public class Claymore extends SuperWeapon{
    public Claymore(){
        setName();
        setDamage();
    }

	@Override
	void setName() {
		this.name = "Claymore";
		
	}

	@Override
	void setDamage() {
		this.damage = 15;
		
	}
}
