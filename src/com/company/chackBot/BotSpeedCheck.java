package com.company.chackBot;

import com.company.Check;

public class BotSpeedCheck extends Check {

    @Override
    public boolean check(String name, int speed) {
        if (speed < 100)
            return false;
        return nextCheck(name, speed);
    }
}
