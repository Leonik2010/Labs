package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class RockThomb extends PhysicalMove {
    public RockThomb() {
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(100).stat(Stat.SPEED, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "uses Rock Thomb";
    }
}
