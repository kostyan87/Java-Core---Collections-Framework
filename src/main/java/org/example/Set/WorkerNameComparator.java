package org.example.Set;

import java.util.Comparator;

public class WorkerNameComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
