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
			System.out.println(this.name + "님이 4000원으로 별다방 아메리카노를 구입하였습니다.");
		} else {
			System.out.println(this.name + "님이 " + this.money + "원으로 돈이 부족하여 아메리카노를 못마심 ~ 메롱");
		}
	}
	
	public void buyBeanCoffee(BeanCoffee beanCoffee, int money) {
		
		
		if(this.money >= 4500) {
			this.money -= 4500;
			System.out.println(this.name + "님이 4500원으로 콩다방 라떼를 구입하였습니다.");
		} else {
			System.out.println(this.name + "님이 " + this.money + "원으로 돈이 부족하여 라떼를 못마심~ 메롱");
		}
	}

}