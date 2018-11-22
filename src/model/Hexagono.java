package model;

import model.FormaIF;
import visitor.VisitorIF;

public class Hexagono implements FormaIF {

    @Override
    public void accept(final VisitorIF visitorIF) {

        visitorIF.visit(this);
    }

}
