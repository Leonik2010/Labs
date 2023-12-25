package lab2.moves.spe;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {

    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(10).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Phychic";
    }

}
