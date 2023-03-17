package br.com.cod3r.chain.validation.steps;

public abstract class ProcessStep {
    protected ProcessStep nextStep;

    public void setNextStep(ProcessStep nextStep) {
        this.nextStep = nextStep;
    }

    public abstract double applyDiscount(double price);
}
