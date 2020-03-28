package visitor;

import model.Hexagono;
import model.Quadrilatero;

public interface VisitorIF {

    public void visit(Quadrilatero quadrilatero);

    public void visit(Hexagono hexagono);
}