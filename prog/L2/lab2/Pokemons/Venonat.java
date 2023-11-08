package lab2.Pokemons;

import lab2.Moves.Confusion;
import lab2.Moves.Psychic;
import lab2.Moves.Supersonic;
import ru.ifmo.se.pokemon.*;

public class Venonat extends Pokemon {

    public Venonat(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.POISON);
        setStats(60, 55, 50, 40, 55, 45);
        setMove(new Psychic(), new Supersonic(), new Confusion());
    }

}
