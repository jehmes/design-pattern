package br.com.cod3r.composite.box.model;

import java.util.List;

public abstract class BoxItemComponent {

    public abstract Double getValue();
    public abstract void print(String structure);
    public void add(List<BoxItemComponent> itens) {
    }
}
