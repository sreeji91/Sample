package classActivity;

public class Test {

public static void main(String[] args) {
	Sports s;//up casting
	s=new Football();//up casting.
	s.play();
	s=new BasketBall();
	s.play();
	s=new Cricket();
	s.play();

}
}
