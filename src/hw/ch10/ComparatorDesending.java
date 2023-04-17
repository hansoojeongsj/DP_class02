package hw.ch10;

import java.util.Comparator;

public class ComparatorDesending implements Comparator {

    @Override
    public int compare(Object a, Object b) {

        return ((Student)b).compareTo((Student)a);
    }
    
}
