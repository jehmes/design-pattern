package br.com.cod3r.observer.restaurant.model;

public class Order {

    private Integer id;
    private String name;
    private boolean ready;

    public Order(Integer id, String name, boolean ready) {
        this.id = id;
        this.name = name;
        this.ready = ready;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
