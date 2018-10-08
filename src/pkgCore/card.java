package pkgCore;
import pkgEnum.*;
public class card implements Comparable {
	
	private Ranks Ranks;
	private Suit Suit;
		public card( pkgEnum.Suit Suit, pkgEnum.Ranks Ranks) {
		super();
		this.Ranks = Ranks;
		this.Suit= Suit;
	}



	public Ranks getRanks() {
		return Ranks;
	}

	public void setRanks(Ranks Ranks) {
		this.Ranks = Ranks;
	}

	public Suit getSuit() {
		return Suit;
	}

	public void setSuit(Suit Suit) {
		this.Suit = Suit;
	}

	public int getCardValue() {
		return this.getRanks().getiRankNum();
	}


	@Override
	public int compareTo(Object a) {
		card b = (card) a;
		return b.getRanks().compareTo(this.getRanks());
	}
	
}

