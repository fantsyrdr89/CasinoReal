package com.casinoreal;

/**
 * Created by alexandraarmstrong on 1/24/17.
 */
abstract public class CardGames {

    Shoe shoe;
    Card[] hand;

    abstract public void deal();

    abstract public void compare();
}