package com.codegym.task.task21.task2101;

import java.util.Arrays;

/*
Determine the network address

*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);

        System.out.println(Arrays.toString(ip));
        System.out.println(Arrays.toString(mask));
        System.out.println(Arrays.toString(netAddress));
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] arr = new byte[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (ip[i] & mask[i]);
        }

        return arr;
    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(Integer.toBinaryString((bytes[i] & 0xFF) + 0x100).substring(1) + " ");
        }
        System.out.println("");
    }
}
