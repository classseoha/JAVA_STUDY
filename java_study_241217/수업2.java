package java_study_241217;

class Food {
	String name;
	int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	public void eat() {
		System.out.println("Eating: " + this.name);
	}
	public int getCalories() {
		return this.calories;
	}
}//Food 클래스 끝

class Pizza extends Food {
	String[] toppings;
	
	public Pizza(String name, int calories, String[] toppings) {
		super(name, calories); //부모클래스 생성자 호출
		this.toppings = toppings;
	}
	@Override
	public void eat() { //부모클래스에 있는 eat 메소드 재정의
		System.out.println("Eating a slice of " + super.name + "pizza");
	}
	public void showToppings() {
		System.out.print("Toppings: ");
		for(String s : toppings) {
			System.out.print(s + " ");
		}System.out.println();
	}
}//끝

class Sushi extends Food {
	String fishType;
	
	public Sushi(String name, int calories, String fishType) {
		super(name, calories);
		this.fishType = fishType;
	}
	@Override
	public void eat() {
		System.out.println("Eating " + super.name + "sushi");
	}
	public void showFishType() {
		System.out.print("FishType: " + this.fishType);
	}//끝
}
	
public class 수업2 {

	public static void main(String[] args) {
		
		Food food = new Food("Food", 100);
		String[] toppings = {"Cheese", "Tomato", "Basil"};
		Pizza margherita = new Pizza("margherita", 300, toppings);
		
		Sushi salmonRoll = new Sushi("Salmon Roll", 250, "Salmon");
		
		food.eat(); //푸드 클래스 eat 호출
		margherita.eat(); //피자 클래스 eat 호출
		salmonRoll.eat(); //스시 클래스 eat 호출
		
		margherita.showToppings(); 
		salmonRoll.showFishType(); 		
		/*
		 *코드설명
		 *Food 클래스: 기본 음식 클래스, 모든 음식의 공통 속성인 name과 calories 그리고 eat() 메소드를 가진다.
		 *Pizza와 Sushi 클래스: Food를 상속받아 eat() 메소드를 오버라이딩하고 각 클래스 특성을 살려 토핑과 생선종류를 보여주는 메소드 구현
		 *
		 *핵심: Pizza와 Sushi 클래스는 Food 클래스의 속성과 메소드를 상속받아 재사용할 수 있다.
		 */
	}
}