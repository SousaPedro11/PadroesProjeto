package teste;

import org.testng.annotations.Test;

import facade.FormaFacade;
import model.Hexagono;
import model.Quadrilatero;
import visitor.Visitor;

public class TestePatterns {

    @Test
    public void testarFacade() {

        final FormaFacade criandoForma = new FormaFacade();

        System.out.println("\nTESTE FACADE");
        criandoForma.criarHexagono();
        criandoForma.criarQuadrilatero();
    }

    @Test
    public void testarVisitor() {

        final Hexagono hexagono = new Hexagono();
        final Quadrilatero quadrilatero = new Quadrilatero();

        final Visitor visitor = new Visitor();

        System.out.println("\nTESTE VISITOR");
        hexagono.accept(visitor);
        quadrilatero.accept(visitor);
    }
}
