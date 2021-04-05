package com.company;

import com.company.chackBot.BotNameCheck;
import com.company.chackBot.BotNameSize;
import com.company.chackBot.BotSpeedCheck;

		/*
		Реализовал 3 проверки.
		1 - является ли это существо ботом?
		2 - может ли он перепрыгнуть разогнавшить более 100?
		3 - его имя длинее 4 символов?
		если он не бот и его скорость больше 100 и имя длинее 5, то
		он молодец, проверку пройдет. а иначе фолы!
		 */

public class Main {

    public static void main(String[] args) {
	    Check nameCheck = new BotNameCheck();
	    Check speedCheck = new BotSpeedCheck();
	    Check sizeName = new BotNameSize();
	    nameCheck.link(speedCheck);
	    speedCheck.link(sizeName);

	    boolean result1 = nameCheck.check("Bot", 150);
		boolean result2 = nameCheck.check("Sam", 150);
		boolean result3 = nameCheck.check("Sammuel", 49);
		boolean result4 = nameCheck.check("Sammuel", 150);

        System.out.println(result1 + " тут имя бот");
		System.out.println(result2 + " тут имя короче 5");
		System.out.println(result3 + " тут скорость маленькая");
		System.out.println(result4 + " тут все ок");

    }
}
