public class Warlock extends Character{
    Warlock (String inpName, int inpHealthpoints, int inpLevel, int inpMana){
        super(inpName, inpHealthpoints, inpLevel, inpMana);
    }

    public void demonSlash(Character enemyCharacter){
        if (super.manaPoints >= 20){
            System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Demon Slash (Damage - 35)");
            int damagePoints = 35;
            super.manaPoints -= 20;
            damageTarget(enemyCharacter, damagePoints);
        } else {
            System.out.println("Not enough Mana Points");
        }
    };
    
    public void energize(){
        System.out.println(super.characterName + " used Energize (+25 Manapoints)");
        super.manaPoints += 25;
        super.showChar();
    };
}
