package singleton.card;

public class CardCompanyTest {
	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		
			Company myBC = Company.createCard();
			Company myVisa = Company.createCard("Visa");
			
			System.out.println(myBC.cardName + " " + myBC.getCardNum());
			System.out.println(myVisa.cardName + " " + myVisa.getCardNum());
	}
}
