import ru.ifmo.se.pokemon.* ;
public class emolga extends Pokemon {
   public emolga(String name, int lvl){
       super(name, lvl);
       setStats(55,75,60,75,60,103);
       setType(Type.ELECTRIC);
       setType(Type.FLYING);
       setMove(new Nuzzle(), new TailWhip());
   }
}
class Nuzzle extends PhysicalMove {
    public Nuzzle(){
        super(Type.ELECTRIC, 20,1.00);
    }
    protected void applyOppEffects(Pokemon p) {
            Effect.paralyze(p);
    }
    protected java.lang.String describe() {
      return "тыкается носом";
    }
}
class TailWhip extends StatusMove{
    public TailWhip(){
        super(Type.NORMAL, 0,1.00);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
    }
    protected java.lang.String describe() {
      return "использует хвост как хлыст";
    }
}