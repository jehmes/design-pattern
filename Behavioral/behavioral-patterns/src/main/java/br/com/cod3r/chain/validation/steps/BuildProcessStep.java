package br.com.cod3r.chain.validation.steps;

public class BuildProcessStep {

    public static ProcessStep createChain = buildChain(new EmployeeDiscountStep(), new VIPDiscountStep());

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int i = 0; i < steps.length - 1; i++) {
            ProcessStep currentStep = steps[i];
            currentStep.setNextStep(steps[i + 1]);
        }
        return steps[0];
    }
}
