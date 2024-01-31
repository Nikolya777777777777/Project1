package Lr11Kovb;

import java.util.HashSet;

public class Lr11Kovb {
    private String[] array;
    private int length;

    public Lr11Kovb(int length) {
        this.length = length;
        this.array = new String[length];
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public String getElement(int index) {
        if (index >= 0 && index < length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void setElement(int index, String value) {
        if (index >= 0 && index < length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void printElement(int index) {
        if (index >= 0 && index < length) {
            System.out.println("Element " + index + ": " + array[index]);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void printArray() {
        System.out.println("String array:");
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    public static void main(String[] args) {
        Lr11Kovb array1 = new Lr11Kovb(5);
        array1.setElement(0, "A");
        array1.setElement(1, "B");
        array1.setElement(2, "C");

        Lr11Kovb array2 = new Lr11Kovb(7);
        array2.setElement(0, "A");
        array2.setElement(1, "B");
        array2.setElement(2, "C");

        array1.printArray();
        array2.printArray();

        HashSet<String> mergedSet = new HashSet<>();
        for (int i = 0; i < array1.getLength(); i++) {
            mergedSet.add(array1.getElement(i));
        }
        for (int i = 0; i < array2.getLength(); i++) {
            mergedSet.add(array2.getElement(i));
        }

        String[] mergedArray = mergedSet.toArray(new String[0]);

        System.out.println("Merged array:");
        for (String element : mergedArray) {
            System.out.println(element);
        }
    }
}
