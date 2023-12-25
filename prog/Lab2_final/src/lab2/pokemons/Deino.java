package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.moves.sta.*;
import lab2.moves.spe.*;


public class Deino extends Pokemon {
    public Deino(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(52, 65, 50, 45, 50, 38);
        setMove(new DragonRage(), new FocusEnergy());
    }

}
