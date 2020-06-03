package pl.p.lodz.zzpj2020.generics.zad2;

public class Term implements Comparable<Term>{
    private String term;

    public Term(){

    }

    public Term(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public int compareTo(Term o) {
        return this.term.compareTo(o.term);
    }
}
