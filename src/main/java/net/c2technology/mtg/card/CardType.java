/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.c2technology.mtg.card;

/**
 * The type of a card
 *
 * @author Chris
 */
public interface CardType {

    public String getType();

    public String getSubType();

    public boolean isEnchantment();

    /**
     * {@code true} of the card type is a land
     *
     * @return
     */
    public boolean isLand();

    public boolean isArtifact();

}
