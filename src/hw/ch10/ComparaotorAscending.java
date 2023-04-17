package hw.ch10;

import java.util.Comparator;
// 오름차순
public class ComparaotorAscending implements Comparator{
    @Override
    public int compare(Object a, Object b) {

        return ((Student)a).compareTo((Student)b); 

    }
    
}
