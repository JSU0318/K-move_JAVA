package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card("BC");
		
		System.out.println(card1.cardName + " ī���ȣ : " + card1.getCardNum());
		System.out.println(card2.cardName + " ī���ȣ : " + card2.getCardNum());
		System.out.println(card3.cardName + " ī���ȣ : " + card3.getCardNum());

	}

}
