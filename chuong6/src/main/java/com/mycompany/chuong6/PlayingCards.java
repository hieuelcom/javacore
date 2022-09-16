package com.mycompany.chuong6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCards {
    private static final String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" }; // 2->A
    private static final String[] suits = { "clubs", "diamonds", "hearts", "spades" };
    private List<Card> playingCards = new ArrayList<Card>();

    public PlayingCards() {
        this.createPlayingCards();
    }

    public List<Card> getPlayingCards() {
        return playingCards;
    }

    public void setPlayingCards(List<Card> playingCards) {
        this.playingCards = playingCards;
    }

    public void createPlayingCards() {
        Card card;
        for (int j = 0; j < ranks.length; j++) {
            for (int k = 0; k < suits.length; k++) {
                card = new Card();
                card.setRanks(ranks[j]);
                card.setSuits(suits[k]);
                playingCards.add(card);
            }
        }
    }

    public void shufflePlayingCards(int time) {
        for (int i = 0; i < time; i++) {
            Collections.shuffle(this.getPlayingCards());
        }
    }

}
