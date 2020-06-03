package pl.p.lodz.zzpj2020.generics.zad1;

public class Service<T extends Step> {

    private GenericList<T> genericList;

    public Service(GenericList<T> genericList) {
        this.genericList = genericList;
    }

    public T displayOne(int indexToDisplay){
        return genericList.getElement(indexToDisplay);
    }

    public String displayAll(){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < genericList.getSize(); i++) {
            res.append(displayOne(i)).append("\n");
        }
        return res.toString();
    }

    public void addGenericLists(GenericList<T> secondList){
        for(int i=0; i<secondList.getSize(); i++){
            genericList.add(secondList.getElement(i));
        }
    }
}
