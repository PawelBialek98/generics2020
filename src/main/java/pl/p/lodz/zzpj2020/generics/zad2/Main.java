package pl.p.lodz.zzpj2020.generics.zad2;

public class Main {

    public static void main(String[] args) {
        Dictionary<Term, Definition> dictionary = new Dictionary<>();
        Dictionary<Term, Definition> dictionary2 = new Dictionary<>();

        Term term1 = new Term("Dziedziczenie");
        LegalTerm legalTerm1 = new LegalTerm("Konsolidacja");
        LiteraryTerm literaryTerm1 = new LiteraryTerm("Barok");
        LegalTerm legalTerm2 = new LegalTerm("Zapis");
        LiteraryTerm literaryTerm2 = new LiteraryTerm("Burleska");

        Definition definition1 = new Definition("Łączenie sprawozdań finansowych jednostek tworzących grupę kapitałową przez sumowanie odpowiednich pozycji sprawozdań finansowych jednostki dominującej, jednostek zależnych i niebędących spółkami handlowymi jednostek współzależnych, z uwzględnieniem niezbędnych wyłączeń i korekt. Art. 3 ust. 45 ustawy o rachunkowości");
        Definition definition2 = new Definition("Mechanizm współdzielenia funkcjonalności między klasami");
        Definition definition3 = new Definition("Ukształtowany kierunków Ameryce kierunków XX wieku kierunek psychologiczny, który dopuszcza badanie tylko i wyłącznie zachowań człowieka oraz jego reakcji na otaczający go świat i bodźce");
        Definition definition4 = new Definition("Spadkodawca może przez rozrządzenie testamentowe zobowiązać spadkobiercę ustawowego lub testamentowego do spełnienia określonego świadczenia majątkowego na rzecz oznaczonej osoby (zapis). Spadkodawca może obciążyć zapisem także zapisobiercę (dalszy zapis).");
        Definition definition5 = new Definition("utwór o charakterze satyrycznym, który operuje patosem, wulgarnością, groteską, pospolitością. Może przybierać każdą formę - poetycką (liryczną), narracyjną (epicką) oraz sceniczną (dramatyczną)");

        dictionary.add(legalTerm1, definition1);
        dictionary.add(term1,definition2);
        dictionary.add(literaryTerm1, definition3);

        dictionary2.add(legalTerm2, definition4);
        dictionary2.add(literaryTerm2, definition5);

        Service<Term,Definition> dictionaryService = new Service<>(dictionary);

        System.out.println(dictionaryService.displayAll());

        System.out.println(dictionaryService.getDefinition(term1));

        dictionaryService.concat(dictionary2);

        System.out.println(dictionaryService.displayAll());

    }
}
