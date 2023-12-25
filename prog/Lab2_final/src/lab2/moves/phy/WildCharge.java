package lab2.moves.phy;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    public WildCharge() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double v) {
        def.setMod(Stat.HP, (int) Math.round(v));
    }

    @Override
    protected void applySelfDamage(Pokemon atk, double v) {
        atk.setMod(Stat.HP, (int) (Math.round(v) / 4));
    }

    @Override
    protected String describe() {
        return "uses Wild Charge";
    }
}
