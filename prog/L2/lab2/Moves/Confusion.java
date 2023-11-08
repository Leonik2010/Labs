package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {

    public Confusion() {
        super(Type.PSYCHIC, 50, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if ((int) Math.round(Math.random() * 10) == 4) {
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "uses Confusion";
    }
}
