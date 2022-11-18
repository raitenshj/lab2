import ru.ifmo.se.pokemon.* ;
public class gallade extends kirlia {
   public gallade(String name, int lvl){
       super(name, lvl);
       setStats(68,125,65,65,115,80);
       setType(Type.PSYCHIC);
       setType(Type.FIGHTING);
       setMove(new DisarmingVoice(), new Growl(), new Confusion(), new NightSlash());
   }
}
class NightSlash extends PhysicalMove {
    public NightSlash(){
        super(Type.DARK, 70,1.00);
    }
    protected double calcCriticalHit(Pokemon att, Pokemon def){
      if (Math.random() <  3*att.getStat(Stat.SPEED)/512) {
         return 2;
      }
      else{
         return 1;
      }
    }
    protected java.lang.String describe() {
      return "проводит ночной удар";
    }
}