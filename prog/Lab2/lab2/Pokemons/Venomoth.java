package lab2.Pokemons;

import lab2.Moves.Phy.*;
import lab2.Moves.Sta.*;
import lab2.Moves.Spe.*;
import ru.ifmo.se.pokemon.*;

public class Venomoth extends Venonat {
    public Venomoth(String name, int level) {
        super(name, level);
        setStats(70, 65, 60, 90, 75, 90);
        addMove(new Roost());
    }
}
