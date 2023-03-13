package br.com.cod3r.composite.folders.model;

import java.util.List;

public class Folder implements Component {
    private String name;
    private List<Component> components;

    public Folder(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }
    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for(Component child: components) {
            child.print(structure + "| ");
        }
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}
