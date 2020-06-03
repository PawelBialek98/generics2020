package pl.p.lodz.zzpj2020.generics.zad2;

import java.util.Map;

public class Service<K extends Term, V extends Definition> {

    private Dictionary<K, V> dictionary;

    public Service(Dictionary<K, V> dictionary) {
        this.dictionary = dictionary;
    }

    public String displayAll(){
        StringBuilder res = new StringBuilder();
        for(Map.Entry<K,V> entry : dictionary.getDictionary().entrySet()) {
            String term = entry.getKey().getTerm();
            String definition = entry.getValue().getDefinition();

            res.append(term).append(" - ").append(definition).append("\n");
        }
        return res.toString();
    }

    private V getDescription(K term){
        return dictionary.getDescription(term);
    }

    public String getDefinition(K term){
        return getDescription(term).getDefinition();
    }

    public void concat(Dictionary<K,V> dict){
        dictionary.concat(dict.getDictionary());
    }
}
