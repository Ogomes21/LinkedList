package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        //Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //When
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);

        Integer actual = singlyLinkedList.size;
        Integer expected = 2;

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void remove() {
        //Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //When
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.remove(6);

        Integer actual = singlyLinkedList.size;
        Integer expected = 1;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove2() {
        //Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //When
        singlyLinkedList.add(5);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);
        singlyLinkedList.add(6);

        Integer actual = singlyLinkedList.size;
        Integer expected = 6;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void find() {
        //Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //When
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);
        singlyLinkedList.add(3);

        Integer actual = 2;
        Integer expected = singlyLinkedList.find(4);

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void size() {
        //Given
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        //When
        singlyLinkedList.add(5);
        singlyLinkedList.add(4);
        singlyLinkedList.add(7);

        Integer actual = 3;
        Integer expected = singlyLinkedList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
        @Test
    public void contains() {
            //Given
            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

            //When
            singlyLinkedList.add(5);
            singlyLinkedList.add(4);
            singlyLinkedList.add(7);

            Boolean actual = true;
            Boolean expected = singlyLinkedList.contains(4);
            Assert.assertEquals(expected, actual);

        }

        @Test
    public void copy() {
            //Given
            SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

            //When
            singlyLinkedList.add(5);
            singlyLinkedList.add(4);
            singlyLinkedList.add(7);

            Boolean actual = singlyLinkedList.copy().contains(5);
            Boolean expected = singlyLinkedList.contains(5);
            Assert.assertEquals(expected, actual);

            Boolean actual1 = singlyLinkedList.copy().contains(4);
            Boolean expected1 = singlyLinkedList.contains(4);
            Assert.assertEquals(expected, actual);

            Boolean actual2 = singlyLinkedList.copy().contains(7);
            Boolean expected2 = singlyLinkedList.contains(7);
            Assert.assertEquals(expected, actual);

        }
    }
