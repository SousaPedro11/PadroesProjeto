package model;

import model.FormaIF;
import visitor.VisitorIF;

public class Quadrilatero implements FormaIF {

    @Override
    public void accept(final VisitorIF visitorIF) {

        visitorIF.visit(this);
    }

}
