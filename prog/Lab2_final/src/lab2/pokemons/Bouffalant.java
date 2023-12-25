package lab2.pokemons;

import lab2.moves.phy.*;
import lab2.moves.sta.*;
import ru.ifmo.se.pokemon.*;

public class Bouffalant extends Pokemon {

    public Bouffalant(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(95, 110, 95, 40, 95, 55);
        setMove(new FuryAttack(), new WildCharge(), new RockThomb(), new SwordsDance());
    }
}
