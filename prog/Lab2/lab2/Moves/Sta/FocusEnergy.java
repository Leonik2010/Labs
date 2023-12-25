package lab2.Moves.Sta;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {

    public FocusEnergy() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect focusEnergy = new Effect().turns(1).stat(Stat.SPEED, 2);
        p.addEffect(focuseEnergy);
    }

    @Override
    protected String describe() {
        return "uses Focus Energy";
    }
}
