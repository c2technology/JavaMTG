/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.c2technology.mtg.card;

import net.c2technology.mtg.card.Counter;
import net.c2technology.mtg.card.CounterType;
import net.c2technology.mtg.card.Card;

/**
 *
 * @author Chris
 */
public interface Creature extends Card {

    public int getPower();

    public int getToughness();

    /**
     * Adds a counter to this card
     *
     * @param counter
     */
    public void addCounter(Counter counter);

    /**
     * Removes a counter of the specified type from this card
     *
     * @param counterType
     */
    public void removeCounter(CounterType counterType);

}
