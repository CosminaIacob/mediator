package design.patterns.components;

import design.patterns.mediator.Mediator;

// Common component interface
public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
