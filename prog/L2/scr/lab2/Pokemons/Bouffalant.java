package lab2.Pokemons;

import lab2.Moves.Phy.*;
import lab2.Moves.Sta.*;
import lab2.Moves.Spe.*;
import ru.ifmo.se.pokemon.*;

public class Bouffalant extends Pokemon {

    public Bouffalant(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(95, 110, 95, 40, 95, 55);
        setMove(new FuryAttack(), new WildCharge(), new RockThomb(), new SwordsDance());
    }
}
