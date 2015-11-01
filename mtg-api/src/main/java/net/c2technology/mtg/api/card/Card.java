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
