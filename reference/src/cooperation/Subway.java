package cooperation;

public class Subway {

		String lineNumber; //ȣ��
		int money; //����
		int passengerCount; // �°� ��
		
		public Subway(String lineNumber) {
			this.lineNumber = lineNumber;
	}
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		public void showInfo( ) {
			System.out.println("����ö " + lineNumber + "ȣ���� �°��� " + passengerCount + "���̰� , ������ " + money + "�Դϴ�. ");
		}
}
