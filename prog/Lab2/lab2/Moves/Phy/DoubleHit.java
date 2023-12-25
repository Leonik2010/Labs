package lab2.Moves.Phy;

import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove {
    public DoubleHit() {
        super(Type.NORMAL, 35, 90, 0, 2);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double v) {
        def.setMod(Stat.HP, (int) Math.round(v));
    }

    @Override
    protected String describe() {
        return "uses Double hit";
    }
}
