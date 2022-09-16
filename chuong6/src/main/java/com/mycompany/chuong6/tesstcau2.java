package com.mycompany.chuong6;

public class tesstcau2 {
    public static void main(String[] args) {
        PlayingCards plCards = new PlayingCards();
        plCards.shufflePlayingCards(2);
        for (int i = 0; i < plCards.getPlayingCards().size(); i++) {
            System.out.print(plCards.getPlayingCards().get(i).getRanks());
            System.out.println(plCards.getPlayingCards().get(i).getSuits());
        }
    }
}
