package cooperation.q5;

public class Person {
	
	String name;
	int money;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starCoffee, int money){
		
		if(this.money >= 4000) {
			this.money -+ 4000;
			System.out.println(this.name + "���� 4000������ ���ٹ� �Ƹ޸�ī�븦 �����Ͽ����ϴ�.");
		} else {
			System.out.println(this.name + "���� " + this.money + "������ ���� �����Ͽ� �Ƹ޸�ī�븦 ������ ~ �޷�");
		}
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		
		
		if(this.money >= 4500) {
			this.money -= 4500;
			System.out.println(this.name + "���� 4500������ ��ٹ� �󶼸� �����Ͽ����ϴ�.");
		} else {
			System.out.println(this.name + "���� " + this.money + "������ ���� �����Ͽ� �󶼸� ������~ �޷�");
		}
	}

}