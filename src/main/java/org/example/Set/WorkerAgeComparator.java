package org.example.Set;

import java.util.Comparator;

public class WorkerAgeComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
