package lab2.Pokemons;

import lab2.Moves.Phy.*;
import lab2.Moves.Sta.*;
import lab2.Moves.Spe.*;

public class Zweilous extends Deino {
    public Zweilous(String name, int level) {
        super(name, level);
        setStats(72, 85, 70, 65, 70, 58);
        addMove(new DoubleHit());
    }
}
