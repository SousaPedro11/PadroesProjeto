package visitor;

import model.Hexagono;
import model.Quadrilatero;

public class Visitor implements VisitorIF {

    @Override
    public void visit(final Quadrilatero quadrilatero) {

        this.printar(quadrilatero);
    }

    @Override
    public void visit(final Hexagono hexagono) {

        this.printar(hexagono);
    }

    private void printar(final Object object) {

        System.out.println("Visitando um " + object.getClass().getSimpleName());
    }
}
