package Day4;

abstract class WorkingSystems1 {
          abstract void applicationProcess();
          abstract void onBoardingProcess();
          
}
class Capgemini extends WorkingSystems1{

	@Override
	void applicationProcess() {
		System.out.println("Application process is very fast in capgemini");
	}

	@Override
	void onBoardingProcess() {
		System.out.println("OnBoarding Process is very fast in capgemini");
		
	}	
}
class Wipro extends WorkingSystems1{

	@Override
	void applicationProcess() {
		System.out.println("Application process is very slow in wipro ");
		
	}

	@Override
	void onBoardingProcess() {
		System.out.println("On Boarding process is very slow in wipro");
		
	}
	
}

public class WorkingSystems12{
	public static void main(String[] args) {
		WorkingSystems1 result = new Capgemini();
		result.applicationProcess();
		result.onBoardingProcess();
		
		WorkingSystems1 res2 = new Wipro();
		res2.applicationProcess();
		res2.onBoardingProcess();
	}
	
}