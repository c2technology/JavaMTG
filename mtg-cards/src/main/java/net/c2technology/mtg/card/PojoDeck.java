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
package net.c2technology.mtg.card;

import net.c2technology.mtg.api.card.CardNotFoundException;
import net.c2technology.mtg.api.card.Card;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import net.c2technology.mtg.api.card.Deck;

/**
 * A deck of cards
 *
 * @author Chris
 */
public class PojoDeck implements Deck {

    private final LinkedList<Card> deck;

    /**
     * Creates a new deck with the given cards.
     *
     * @param cards
     */
    public PojoDeck(Collection<? extends Card> cards) {
        deck = new LinkedList(cards);
    }

    @Override
    public int cardsLeft() {
        return deck.size();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public Card draw() throws CardNotFoundException {
        if (deck.size() > 0) {
            return deck.removeFirst();
        }
        throw new CardNotFoundException("No more cards in deck!");
    }

    @Override
    public void addCard(Card card, int index) {
        deck.add(index, card);
    }

    @Override
    public Card search(String cardName) throws CardNotFoundException {
        if (deck.size() == 0) {
            throw new CardNotFoundException("No more cards in deck!");
        }
        Card foundCard = null;
        for (Card card : deck) {
            if (card.getName().equalsIgnoreCase(cardName)) {
                foundCard = card;
                break;
            }
        }
        if (foundCard == null) {
            throw new CardNotFoundException(String.format("Could not find card %s", cardName));
        }
        deck.remove(foundCard);

        return foundCard;
    }
}
