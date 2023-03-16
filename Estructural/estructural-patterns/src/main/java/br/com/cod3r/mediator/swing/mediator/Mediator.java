package br.com.cod3r.mediator.swing.mediator;

import br.com.cod3r.mediator.swing.components.AddButton;
import br.com.cod3r.mediator.swing.components.Label;
import br.com.cod3r.mediator.swing.components.State;

/*
O MEDIATOR É UTILIZADO QUANDO HÁ MUITAS CLASSES PRECISANDO
*SE COMUNICAR ENTRE SIM, ISSO GERA UM ALTO ACOMPLAMENTO.
*ESTE PADRÃO CRIA UM UNICO PONTO DE ACESSO DE COMUNICAÇÃO
*PARA TODAS AS CLASSES. OS MÉTODOS DAS CLASSES QUE PRECISAM
CONVERSAR IRÃO ESTAR NO MEDIATOR.
*/


public class Mediator {
    private AddButton addButton;
    private Label label;
    private State state;

    public void buttonClicked() {
        state.addCount();
        label.refresh();
        if(state.getCounter() == 10) {
            disable();
        }
    }

    public void reset() {
        state.setCounter(0);
        label.refresh();
        enable();
    }

    public void disable() {addButton.setEnabled(false);}

    public void enable() {addButton.setEnabled(true);}

    public Integer getCounter() {
        return state.getCounter();
    }

    public void setAddButton(AddButton addButton) {
        this.addButton = addButton;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void setState(State state) {
        this.state = state;
    }
}
