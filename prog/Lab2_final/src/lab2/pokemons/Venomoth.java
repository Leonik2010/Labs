package lab2.pokemons;

import lab2.moves.sta.*;

public class Venomoth extends Venonat {
    public Venomoth(String name, int level) {
        super(name, level);
        setStats(70, 65, 60, 90, 75, 90);
        addMove(new Roost());
    }
}
