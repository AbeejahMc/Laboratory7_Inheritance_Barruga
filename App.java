public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        Wizard Piper = new Wizard ("Piper", 80, 12, 50);

        Warlock Oscar = new Warlock ("Oscar", 100, 8, 50);

        Piper.showChar();       // Character Status Check

        Oscar.showChar();       // Character Status check

        Piper.fireStorm(Oscar); // Action of Wizard
        
        Oscar.demonSlash(Piper); // Action of Warlock

        Piper.revitalize(); // Recovery Skill of Wizard

        Oscar.demonSlash(Piper); // Action of Wizard

        Piper.iceSpikes(Oscar); // Action of Wizard
    }
}
