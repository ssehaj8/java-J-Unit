package com.bridgelabz;

import com.bridgelabz.JUnit.BasicJUnitTesting.listMangerTest.ListManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest{
    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setup(){
        listManager= new ListManager();
        list= new ArrayList<>();
    }

    @Test
    public void shouldAddElementToTheList(){
      // ListManager listManager= new ListManager();
       // List<Integer> list= new ArrayList<>();
        listManager.addElement(list, 8);
        listManager.addElement(list, 6);
        listManager.addElement(list, 21);

        Assertions.assertEquals(1, list.size());
        Assertions.assertTrue(list.contains(8));
    }

    @Test
    public void shouldRemoveElementToTheList(){
        list.add(2);
        list.add(4);
        list.add(6);
       boolean isPresent= listManager.removeElement(list, 6);
       Assertions.assertEquals(true, isPresent);
    }

    @Test
    public void shouldUpdateElementToTheList(){
        list.add(4);
        list.add(8);
        list.add(6);
        int size= list.size();
        Assertions.assertEquals(3, size);

    }
}