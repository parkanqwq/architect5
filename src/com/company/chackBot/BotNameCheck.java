package com.company.chackBot;

import com.company.Check;

public class BotNameCheck extends Check {

    @Override
    public boolean check(String name, int speed) {
        if (name.equals("Bot"))
            return false;
        return nextCheck(name, speed);
    }
}
