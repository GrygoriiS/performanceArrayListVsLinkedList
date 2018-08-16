import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListVsLinkedListPerformance {
    public static void main(String[] args) {
        long totalElapsedTimeA = 0L;
        long totalElapsedTimeL = 0L;
        int startSize = 100;
        int position = 1;
        int element = 5;
        int attempts = 100000;
        //************ add element to index
        ArrayList<Integer> arrayList = null;
        for (int i = 0; i < attempts; i++) {
            arrayList = new ArrayList<>();
            for (int j = 0; j < startSize; j++) {
                arrayList.add(j);
            }
            long startA = System.nanoTime();
            arrayList.add(position, element);
            long elapsedTimeA = System.nanoTime() - startA;
            totalElapsedTimeA += elapsedTimeA;
        }
        System.out.println("ArrayList add 1 element to index =  " + totalElapsedTimeA);
        //**
        LinkedList<Integer> linkedList = null;
        for (int i = 0; i < attempts; i++) {
            linkedList = new LinkedList<>();
            for (int j = 0; j < startSize; j++) {
                linkedList.add(j);
            }
            long startL = System.nanoTime();
            ListIterator<Integer> itrL = linkedList.listIterator(position);
            itrL.add(element);
            long elapsedTimeL = System.nanoTime() - startL;
            totalElapsedTimeL += elapsedTimeL;
        }
        System.out.println("LinkedList add 1 element to index = " + totalElapsedTimeL);
        //************ add sequence to index
        long totalElapsedTimeA2 = 0;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int j = 0; j < startSize; j++) {
            arrayList2.add(j);
        }
//        ListIterator<Integer> itrA2 = arrayList.listIterator(position);
        for (int i = 0; i < attempts; i++) {
            long startA2 = System.nanoTime();
//            itrA2.add(element);
//            arrayList.add(element);
            arrayList2.add(position + i, element);
//            arrayList.add(position, element);
            long elapsedTimeA2 = System.nanoTime() - startA2;
            totalElapsedTimeA2 += elapsedTimeA2;
        }
        System.out.println("ArrayList add element sequence to index =  " + totalElapsedTimeA2);
        //**
        long totalElapsedTimeL2 = 0;
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        for (int j = 0; j < startSize; j++) {
            linkedList2.add(j);
        }
        long startL2 = System.nanoTime();
        ListIterator<Integer> itrL2 = linkedList2.listIterator(position);
        for (int i = 0; i < attempts; i++) {
            if (i != 0) {
                startL2 = System.nanoTime();
            }
            itrL2.add(element);
//            linkedList2.add(position, element);
            long elapsedTimeL2 = System.nanoTime() - startL2;
            totalElapsedTimeL2 += elapsedTimeL2;
        }
        System.out.println("LinkedList add element sequence to index = " + totalElapsedTimeL2);
        //************ add element to start
        long totalElapsedTimeA3 = 0;
        ArrayList<Integer> arrayList3 = null;
        for (int i = 0; i < attempts; i++) {
            arrayList3 = new ArrayList<>();
            for (int j = 0; j < startSize; j++) {
                arrayList3.add(j);
            }
            long startA3 = System.nanoTime();
            arrayList3.add(0, element);
            long elapsedTimeA3 = System.nanoTime() - startA3;
            totalElapsedTimeA3 += elapsedTimeA3;
        }
        System.out.println("ArrayList add element to start =  " + totalElapsedTimeA3);
        //**
        long totalElapsedTimeL3 = 0;
        LinkedList<Integer> linkedList3 = null;
        for (int i = 0; i < attempts; i++) {
            linkedList3 = new LinkedList<>();
            for (int j = 0; j < startSize; j++) {
                linkedList3.add(j);
            }
            long startL3 = System.nanoTime();
            linkedList3.addFirst(element);
            long elapsedTimeL3 = System.nanoTime() - startL3;
            totalElapsedTimeL3 += elapsedTimeL3;
        }
        System.out.println("LinkedList add element to start = " + totalElapsedTimeL3);
        //*********************** add sequence to start
        long totalElapsedTimeA4 = 0;
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        for (int j = 0; j < startSize; j++) {
            arrayList4.add(j);
        }
        for (int i = 0; i < attempts; i++) {
            long startA4 = System.nanoTime();
            arrayList4.add(0, element);
            long elapsedTimeA4 = System.nanoTime() - startA4;
            totalElapsedTimeA4 += elapsedTimeA4;
        }
        System.out.println("ArrayList add sequence to start =  " + totalElapsedTimeA4);
        //**
        long totalElapsedTimeL4 = 0;
        LinkedList<Integer> linkedList4 = new LinkedList<>();
        for (int j = 0; j < startSize; j++) {
            linkedList4.add(j);
        }
        for (int i = 0; i < attempts; i++) {
            long startL4 = System.nanoTime();
            linkedList4.addFirst(element);
            long elapsedTimeL4 = System.nanoTime() - startL4;
            totalElapsedTimeL4 += elapsedTimeL4;
        }
        System.out.println("LinkedList add sequence to start = " + totalElapsedTimeL4);
        //*********************** add element to end
        long totalElapsedTimeA5 = 0;
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        for (int j = 0; j < startSize; j++) {
            arrayList4.add(j);
        }
        for (int i = 0; i < attempts; i++) {
            long startA5 = System.nanoTime();
            arrayList5.add(arrayList5.size(), element);
            long elapsedTimeA5 = System.nanoTime() - startA5;
            totalElapsedTimeA5 += elapsedTimeA5;
        }
        System.out.println("ArrayList add element to end =  " + totalElapsedTimeA5);
        //**
        long totalElapsedTimeL5 = 0;
        LinkedList<Integer> linkedList5 = new LinkedList<>();
        for (int j = 0; j < startSize; j++) {
            linkedList5.add(j);
        }
        for (int i = 0; i < attempts; i++) {
            long startL5 = System.nanoTime();
            linkedList5.addLast(element);
            long elapsedTimeL5 = System.nanoTime() - startL5;
            totalElapsedTimeL5 += elapsedTimeL5;
        }
        System.out.println("LinkedList add element to end = " + totalElapsedTimeL5);
    }
}
