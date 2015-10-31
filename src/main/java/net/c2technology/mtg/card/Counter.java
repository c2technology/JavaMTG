/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.c2technology.mtg.card;

/**
 * A counter that can be placed on a card
 *
 * @author Chris
 */
public interface Counter {

    public CounterType getType();

    public int getToughnessModifier();

    public int getPowerModifier();
}
