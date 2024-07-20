public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike honda = new MotorBike(50);
		MotorBike ducati = new MotorBike(30);

//		honda.speed = 120;
//		ducati.speed = 99;
		honda.start("honda");
		ducati.start("ducati");

		honda.setSpeed(180);
		honda.getSpeed();

		ducati.setSpeed(130);
		ducati.getSpeed();

		honda.incSpeed(35);
		honda.decSpeed(50);

		ducati.incSpeed(60);
		ducati.decSpeed(230);

	}
}
