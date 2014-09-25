package me.drewhoener.compsci.plainclass;

import java.util.ArrayList;

public class Primes {

    static boolean debug = true;

    public static void main(String[] args) {
        Primes p = new Primes();

        for (int i : p.getPrimes(50)) {
            System.out.println(i);
        }

    }

    public ArrayList<Integer> getPrimes(int before) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);//because 2 is a weird prime number, get that in there first

        for (int num = 3; num <= before; num++) {

            if (isPrime(num)) {
                list.add(num);
            }

        }

        return list;
    }

    public boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }


        return true;
    }

}