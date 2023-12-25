package lab2.moves.phy;

import ru.ifmo.se.pokemon.*;

public class FuryAttack extends PhysicalMove {

    public FuryAttack() {
        super(Type.NORMAL, 15, 85, 0, (int) (Math.random() * 4));
    }

    @Override
    protected void applyOppDamage(Pokemon def, double v) {
        def.setMod(Stat.HP, (int) Math.round(v));
    }

    @Override
    protected String describe() {
        return "uses Fury Attack";
    }

}
