package com.company.chackBot;

import com.company.Check;

public class BotNameSize extends Check {

    @Override
    public boolean check(String name, int speed) {
        if (name.length() < 5)
            return false;
        return nextCheck(name, speed);
    }
}
