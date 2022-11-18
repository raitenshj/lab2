import ru.ifmo.se.pokemon.* ;
public class sandslash extends sandshrew {
   public sandslash(String name, int lvl){
       super(name, lvl);
       setStats(75,100,110,45,55,65);
       setType(Type.GROUND);
       setMove(new DefenseCurl(), new Scratch(), new Agility());
   }
}
class Agility extends StatusMove{
    public Agility(){
        super(Type.PSYCHIC, 0,0);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 2);
    }
    protected java.lang.String describe() {
      return "использует ловкость";
    }
 }