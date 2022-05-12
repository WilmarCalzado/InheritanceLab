public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    public void thunder(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with thunder strike (Damage - 60)");
        int damagePoints = 60;
        int manaCost = 50;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void Episkey(Character enemyCharacter){
        System.out.println(super.characterName + " use Episkey (Hp +40)(Mana +30)");
        int recover = 40;
        int mana = 30;
        Recovery(enemyCharacter, recover, mana);
    };
    public void IncreaseLevel(Character Winner){
        int levelIncrease = 10;
        Level(Winner, levelIncrease);

}
}