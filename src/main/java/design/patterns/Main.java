package design.patterns;

import design.patterns.components.AddButton;
import design.patterns.components.DeleteButton;
import design.patterns.components.Filter;
import design.patterns.components.List;
import design.patterns.components.SaveButton;
import design.patterns.components.TextBox;
import design.patterns.components.Title;
import design.patterns.mediator.Editor;
import design.patterns.mediator.Mediator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}