/*
 * Copyright (C) 2015 chris
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.c2technology.mtg.api.card;

/**
 * A deck of cards
 *
 * @author Chris
 */
public interface Deck {

    /**
     * Retruns the number of remaining cards
     *
     * @return
     */
    public int cardsLeft();

    /**
     * Shuffles the deck
     */
    public void shuffle();

    /**
     * Removes the top card from the deck.
     *
     * @return
     * @throws CardNotFoundException if no {@link Card} is left in this
     * {@link Deck}.
     */
    public Card draw() throws CardNotFoundException;

    /**
     * Adds the card at the given index on the top of the deck.
     *
     * @param card
     * @param index
     */
    public void addCard(Card card, int index);

    /**
     * Searches the deck for a card with the given name (case insensitive) and
     * returns it, removing it from the deck.
     *
     * @param cardName
     * @return
     * @throws CardNotFoundException if the named {@link Card} is not found.Ï
     */
    public Card search(String cardName) throws CardNotFoundException;

}
