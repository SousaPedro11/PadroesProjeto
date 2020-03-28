package facade;

import model.FormaIF;
import model.Hexagono;
import model.Quadrilatero;

public class FormaFacade {

    private final FormaIF hexagono;

    private final FormaIF quadrilatero;

    public FormaFacade() {

        this.hexagono = new Hexagono();
        this.quadrilatero = new Quadrilatero();
    }

    public void criarHexagono() {

        this.hexagono.desenhar();
    }

    public void criarQuadrilatero() {

        this.quadrilatero.desenhar();
    }
}
