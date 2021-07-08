package cooperation;

public class Subway {

		String lineNumber; //호선
		int money; //수입
		int passengerCount; // 승객 수
		
		public Subway(String lineNumber) {
			this.lineNumber = lineNumber;
	}
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		public void showInfo( ) {
			System.out.println("지하철 " + lineNumber + "호선의 승객은 " + passengerCount + "명이고 , 수입은 " + money + "입니다. ");
		}
}
