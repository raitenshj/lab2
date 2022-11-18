import ru.ifmo.se.pokemon.* ;
public class sandshrew extends Pokemon {
   public sandshrew(String name, int lvl){
       super(name, lvl);
       setStats(50,75,85,20,30,40);
       setType(Type.GROUND);
       setMove(new DefenseCurl(), new Scratch());
   }
}
class DefenseCurl extends StatusMove{
    public DefenseCurl(){
        super(Type.NORMAL, 0,0);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, 1);
    }
    protected java.lang.String describe() {
      return "сгибается для защиты";
    }
}
class Scratch extends PhysicalMove {
    public Scratch(){
        super(Type.NORMAL, 40,1.00);
    }
    protected java.lang.String describe() {
      return "царапает";
    }
}