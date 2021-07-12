package singleton.card;

public class Card {
		private static int serialNum = 100;
		String cardName;
	int cardNum;
	
		public Card() {
			serialNum++;
			cardNum = String.valueOf(serialNum);
		}
		
		public Card(String cardName) {
				this();
				this.cardName = card;
		}
		
		public String getCardNum() {
			return cardNum;
		}
}
