/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.c2technology.mtg.card;

import java.util.List;

/**
 * Represents a single card in a deck.
 *
 * @author Chris
 */
public interface Card {

    /**
     * The name of this card
     *
     * @return
     */
    public String getName();

    /**
     * {@code true} if this card is tapped
     *
     * @return
     */
    public boolean isTapped();

    /**
     * Untaps this card
     */
    public void tap();

    /**
     * Taps this card
     */
    public void untap();

    /**
     * The type of this card
     *
     * @return
     */
    public CardType getType();

    /**
     * The formats this card is legal in.
     *
     * @return
     */
    public List<Format> getFormats();

    /**
     * The rarity of this card
     *
     * @return
     */
    public Rarity getRarity();

    /**
     * The maximum number of this card that can be in the field for a player at
     * one time.
     *
     * @return
     */
    public int fieldLimit();

}
