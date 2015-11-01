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

import net.c2technology.mtg.api.card.Counter;
import net.c2technology.mtg.api.card.CounterType;
import net.c2technology.mtg.api.card.Card;

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
