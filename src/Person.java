package io.codeforall.bootcamp.filhosdamain;

public class Person {

    private String name;
    private Bank bank;


    public Person(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public void takeMoney() {
        if (bank >= 0) {
            System.out.println("take it easy!");
        } else if (bank > 50) {
            System.out.println("more money!");
        } else {
            System.out.println("still poor!");
        }
        public void takeMoney () {
            bank.money();
        }

        public void depositMoney () {
            if (bank >= 0) {
                System.out.println("take it easy!");
            } else if (bank > 50) {
                System.out.println("more money!");
            } else {
                System.out.println("still poor!");
            }
            public void takeMoney () {
                bank.money();

            }
        }
    }