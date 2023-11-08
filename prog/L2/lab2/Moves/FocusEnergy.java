package lab2.Moves;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {

    public FocusEnergy() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect Focus_energy = new Effect().turns(1).stat(Stat.SPEED, 2);
        p.addEffect(Focus_energy);
    }

    @Override
    protected String describe() {
        return "uses Focus Energy";
    }
}
