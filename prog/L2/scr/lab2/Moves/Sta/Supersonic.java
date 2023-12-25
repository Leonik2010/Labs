package lab2.Moves.Sta;

import ru.ifmo.se.pokemon.*;

public class Supersonic extends StatusMove {

    public Supersonic() {
        super(Type.NORMAL, 0, 55);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "uses Supersonic";
    }
}
