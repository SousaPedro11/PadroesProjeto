package model;

import visitor.VisitorIF;

public interface FormaIF {

    // visitor
    public void accept(final VisitorIF visitorIF);

    // padrao facade
    public default void desenhar() {

        System.out.println("Esfaqueando um " + this.getClass().getSimpleName() + " (`-´)");
    }
}
