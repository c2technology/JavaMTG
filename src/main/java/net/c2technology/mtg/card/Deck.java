/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.c2technology.mtg.card;

import net.c2technology.mtg.card.CardNotFoundException;
import net.c2technology.mtg.card.Card;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * A deck of cards
 *
 * @author Chris
 */
public class Deck {

    private final LinkedList<Card> deck;

    /**
     * Creates a new deck with the given cards.
     *
     * @param cards
     */
    public Deck(Collection<? extends Card> cards) {
        deck = new LinkedList(cards);
    }

    /**
     * Retruns the number of remaining cards
     */
    public int cardsLeft() {
        return deck.size();
    }

    /**
     * Shuffles the deck
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * Removes the top card from the deck.
     *
     * @return
     */
    public Card draw() {
        if (deck.size() > 0) {
            return deck.removeFirst();
        }
        throw new CardNotFoundException("No more cards in deck!");
    }

    /**
     * Adds the card at the given index on the top of the deck.
     *
     * @param card
     * @param index
     */
    public void addCard(Card card, int index) {
        deck.add(index, card);
    }

    /**
     * Searches the deck for a card with the given name (case insensitive) and
     * returns it, removing it from the deck.
     *
     * @param cardName
     * @return
     */
    public Card search(String cardName) {
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
