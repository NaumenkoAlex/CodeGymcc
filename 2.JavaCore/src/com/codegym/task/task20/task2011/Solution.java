package com.codegym.task.task20.task2011;

import java.io.*;

/*
Externalizable for apartments

*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        private static final long serialVersionUID = 1L;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(this.address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Apartment apartment = new Apartment("Peremohy avenue", 2020);

        objectOutputStream.writeObject(apartment);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:\\Java\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        Apartment apartment1 = (Apartment) objectInputStream.readObject();
        System.out.println(apartment1);

        objectInputStream.close();
    }
}
