package com.company;

public abstract class Check {

    private Check next;

    public Check link(Check check){
        this.next = check;
        return check;
    }

    public abstract boolean check(String name, int speed);

    public boolean nextCheck(String name, int speed){
        if (next == null){
            return true;
        }
        return next.check(name, speed);
    }
}
