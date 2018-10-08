package pkgEnum;

public enum Ranks {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(
			13), ACE(14);

	private int iRankNum;

	private Ranks(int iRankNum) {
		this.iRankNum = iRankNum;
	}

	public int getiRankNum() {
		return iRankNum;
	}

}