package lab2.pokemons;

import lab2.moves.sta.*;
import lab2.moves.spe.*;
import ru.ifmo.se.pokemon.*;

public class Venonat extends Pokemon {

    public Venonat(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.POISON);
        setStats(60, 55, 50, 40, 55, 45);
        setMove(new Psychic(), new Supersonic(), new Confusion());
    }

}
