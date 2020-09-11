package com.codegym.task.task26.task2608;

/* 
A wise man thinks once before speaking twice

*/
public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    private final Object o = new Object();
    private final Object p = new Object();

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        synchronized (o){
            return var1 + var2;
        }

    }

    public int getSumOfVar3AndVar4() {
        synchronized (p){
            return var3 + var4;
        }
    }

    public static void main(String[] args) {

    }
}
