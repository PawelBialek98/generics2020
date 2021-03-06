package pl.p.lodz.zzpj2020.generics;

import java.util.List;

public class Rental<T> {
    private List<T> rentalPool;
    private int maxNum;

    public Rental(int maxNum, List<T> rentalPool) {
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }

    public T getRental() {
        // blocks until there's something available
        return rentalPool.get(0);
    }

    public void returnRental(T o) {
        rentalPool.add(o);
    }
}

class Car {

}