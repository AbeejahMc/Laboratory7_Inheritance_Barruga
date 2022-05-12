public class Wizard extends Character{
    Wizard (String inpName, int inpHealthpoints, int inpLevel, int inpMana){
        super(inpName, inpHealthpoints, inpLevel, inpMana);
    }
    
    public void fireStorm(Character enemyCharacter){
        if (super.manaPoints >= 30){
            System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
            int damagePoints = 50;
            super.manaPoints -= 30;
            damageTarget(enemyCharacter, damagePoints);
        } else {
            System.out.println("Not enough Mana Points");
        }
    };

    public void iceSpikes(Character enemyCharacter){
        if (super.manaPoints>=25){
            System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Ice Spikes (Damage - 50)");
            int damagePoints = 50;
            super.manaPoints -= 25;
            damageTarget(enemyCharacter, damagePoints);
        } else {
            System.out.println("Not enough Mana Points");
        }
    };
    
    public void revitalize(){
        System.out.println(super.characterName + " used Revitalize (+50 Manapoints)\n");
        super.manaPoints += 50;
        super.showChar();
    };
}
