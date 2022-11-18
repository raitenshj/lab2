import ru.ifmo.se.pokemon.* ;
public class ralts extends Pokemon {
   public ralts(String name, int lvl){
       super(name, lvl);
       setStats(28,25,25,45,35,40);
       setType(Type.PSYCHIC);
       setType(Type.FAIRY);
       setMove(new DisarmingVoice(), new Growl());
   }
}
class DisarmingVoice extends SpecialMove{
    public DisarmingVoice(){
        super(Type.FAIRY, 40,0);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    protected java.lang.String describe() {
      return "обезоруживает голосом";
    }

}
class Growl extends StatusMove{
    public Growl(){
        super(Type.NORMAL, 0,1.00);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    protected java.lang.String describe() {
      return "рычит";
    }
}