package lab2.Pokemons;
import lab2.Moves.DoubleHit;
import lab2.Moves.DragonRage;
import lab2.Moves.FocusEnergy;

public class Zweilous extends Deino{
    public Zweilous(String name, int level){
        super(name, level);
        setStats(72, 85, 70, 65, 70, 58);
        addMove(new DoubleHit());
    }
}
