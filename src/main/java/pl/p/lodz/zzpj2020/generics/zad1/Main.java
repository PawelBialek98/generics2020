package pl.p.lodz.zzpj2020.generics.zad1;

public class Main {

    public static void main(String[] args) {
        GenericList<Step> stepGenericList = new GenericList<>();
        GenericList<Step> stepGenericList2 = new GenericList<>();
        GenericList<SimpleStep> simpleStepGenericList = new GenericList<>();
        GenericList<ComplexStep> complexStepGenericList = new GenericList<>();

        stepGenericList.add(new Step("krok 1 blablabla"));
        stepGenericList.add(new Step("krok 2 blablabla"));
        stepGenericList.add(new Step("krok 3 blablabla"));
        simpleStepGenericList.add(new SimpleStep("Prosty krok 1"));
        simpleStepGenericList.add(new SimpleStep("Prosty krok 2"));
        complexStepGenericList.add(new ComplexStep("Kompleksowy krok 1"));
        complexStepGenericList.add(new ComplexStep("Kompleksowy krok 2"));
        complexStepGenericList.add(new ComplexStep("Kompleksowy krok 3"));
        complexStepGenericList.add(new ComplexStep("Kompleksowy krok 4"));

        stepGenericList2.add(new SimpleStep("Prosty krok 1"));
        stepGenericList2.add(new SimpleStep("Prosty krok 2"));

        Service<Step> stepGenericListService = new Service<>(stepGenericList);

        System.out.println(stepGenericListService.displayOne(2));

        System.out.println(stepGenericListService.displayAll());

        stepGenericListService.addGenericLists(stepGenericList2);

        System.out.println(stepGenericListService.displayAll());
    }
}
