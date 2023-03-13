package br.com.cod3r.composite.box.model;

import java.util.ArrayList;
import java.util.List;

public class Box extends BoxItemComponent {
    private String name;
    private List<BoxItemComponent> boxItens = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }
    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for(BoxItemComponent child: boxItens) {
            child.print(structure + "| ");
        }
    }

    @Override
    public Double getValue() {
        return boxItens.stream().mapToDouble(BoxItemComponent::getValue).sum();
    }

    public void add(List<BoxItemComponent> itens) {
        boxItens.addAll(itens);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BoxItemComponent> getBoxItens() {
        return boxItens;
    }

    public void setBoxItens(List<BoxItemComponent> boxItens) {
        this.boxItens = boxItens;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", boxItens=" + boxItens +
                "} " + super.toString() + "\n";
    }
}
