package lab2.moves.spe;

import ru.ifmo.se.pokemon.*;

public class DragonRage extends SpecialMove {
    public DragonRage() {
        super(Type.DRAGON, 10, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, 40);
    }

    @Override
    protected String describe() {
        return "uses Dragon Rage";
    }
}
