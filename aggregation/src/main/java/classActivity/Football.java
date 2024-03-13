package classActivity;

public class Football extends Sports {
	public void play()
	{
		super.play();
		System.out.println("Football is a family of team sports that involve, to varying degrees, kicking a ball to score a goal.");
	}

	public static void main(String[] args) {
		Football obj1=new Football();
		obj1.play();
		BasketBall obj2=new BasketBall();
		obj2.play();
		Cricket obj3=new Cricket();
		obj3.play();

	}

}
