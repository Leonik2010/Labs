package lab2.Pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.Moves.Phy.*;
import lab2.Moves.Sta.*;
import lab2.Moves.Spe.*;


public class Deino extends Pokemon {
    public Deino(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(52, 65, 50, 45, 50, 38);
        setMove(new DragonRage(), new FocusEnergy());
    }

}
