import ru.ifmo.se.pokemon.* ;
public class PokemonBattle{
	public static void main(String[] args) {
		Battle b = new Battle();
		b.addAlly(new ralts("Ральтс", 5));
        b.addAlly(new kirlia("Кирлиа", 10));
        b.addAlly(new gallade("Галлэйд", 15));
        b.addFoe(new sandshrew("Сэндшрю", 5));
        b.addFoe(new sandslash("Сэндслэш", 10));
        b.addFoe(new emolga("Эмольга", 15));
        b.go();
	}
}