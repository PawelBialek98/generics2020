package pl.p.lodz.zzpj2020.generics.zad2;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary<K extends Term,V extends Definition>{
    private TreeMap<K,V> dictionary = new TreeMap<>();

    public Dictionary() {
    }

    public TreeMap<K, V> getDictionary() {
        return dictionary;
    }

    public void add(K key, V value){
        dictionary.put(key, value);
    }

    public void concat(TreeMap<K,V> dict){
        dictionary.putAll(dict);
        /*for(Map.Entry<K,V> entry : dictionary2.getDictionary().entrySet()) {
            dictionary.put(entry.getKey(),entry.getValue());
        }*/
    }

    public void remove(K key){
        dictionary.remove(key);
    }

    //metoda zwracająca wyjaśnienie terminu - klucza
    public V getDescription(K key){
        return dictionary.get(key);
    }

    public boolean checkTermExist(K key){
        return dictionary.containsKey(key);
    }

    public int getDictionarySize(){
        return dictionary.size();
    }
}
