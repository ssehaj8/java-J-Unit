package com.bridgelabz.JUnit.BasicJUnitTesting.listMangerTest;

import java.util.List;

public class ListManager {
    public void addElement(List<Integer> list, int i) {
        list.add(i);
    }

    public boolean removeElement(List<Integer> list, int i) {
        return list.remove(Integer.valueOf(i));
    }
    public int updateElement(List<Integer> list, int i){
        return list.size();
    }
}

