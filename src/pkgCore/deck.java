package pkgCore;

import pkgCore.card;

import pkgEnum.*;
import java.util.ArrayList;
import java.util.Collections;
import pkgEnum.Ranks;
import pkgEnum.Suit;

public class deck {

	private ArrayList<card> cards = new ArrayList<card>();
	private Ranks Ranks;
	private Suit Suit;

	public deck(int iNumDecks) {
		for (int deck = 1; deck < iNumDecks; deck++) {
			for (Ranks Ranks : pkgEnum.Ranks.values()) {
				for (Suit Suit : pkgEnum.Suit.values()) {
					cards.add(new card(Suit, Ranks));
				}
			}
			Collections.shuffle(cards);
		}
	}

	public card Draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception("This deck is empty.");
		}
		return cards.remove(0);
	}

	public card draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception("This deck is empty!");
		}
		return (cards.remove(0));
	}

	public int DeckSize() {
		return this.cards.size();
	}
//return of the count of Suit or Rank (depending on which eNum you pass)
	public void getRemaining(Object eNum) {
		int cardCountA = 0;
		int cardCountB = 0;
		if (eNum instanceof Suit)
			this.Suit = (Suit) Suit;
		for (card b : this.cards) {
			if (b.getSuit() == eNum)
				cardCountA++;
		}
		
		//figure out which object
		if (eNum instanceof Ranks)
			this.Ranks = (Ranks) Ranks;
		for (card b : this.cards) {
			if (b.getRanks() == eNum)
				cardCountB++;
		}
	}
}