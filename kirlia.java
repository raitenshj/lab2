import ru.ifmo.se.pokemon.* ;
public class kirlia extends ralts {
   public kirlia(String name, int lvl){
       super(name, lvl);
       setStats(38,35,35,65,55,50);
       setType(Type.PSYCHIC);
       setType(Type.FAIRY);
       setMove(new DisarmingVoice(), new Growl(), new Confusion());
   }
}
class Confusion extends SpecialMove{
    public Confusion(){
        super(Type.PSYCHIC, 50,1.00);
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.confuse(p);
        }
    }
    protected java.lang.String describe() {
      return "сбивает с толка";
    }
}