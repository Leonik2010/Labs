import lab2.pokemons.*;

import ru.ifmo.se.pokemon.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Deino("Блум", 10);
        Pokemon p2 = new Zweilous("Стелла", 100);
        Pokemon p3 = new Hydreigon("Флора", 100);
        Pokemon p4 = new Bouffalant("Муза", 100);
        Pokemon p5 = new Venonat("Текна", 100);
        Pokemon p6 = new Venomoth("Лейла", 100);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p6);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p3);
        b.go();
    }
}
