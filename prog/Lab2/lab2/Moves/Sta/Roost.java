package lab2.Moves.Sta;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        double halfOfMaxHealth = pokemon.getStat(Stat.HP) / 2;
        double maxPossibleHeal = pokemon.getStat(Stat.HP) - pokemon.getHP();
        pokemon.setMod(Stat.HP, (int) -Math.min(halfOfMaxHealth, maxPossibleHeal));
    }

    @Override
    protected String describe() {
        return "uses Roost";
    }
}
