package Day4;

interface WorkingSystems_interfaec23 {
        void application();
        void onboading();
        
}

class wipro implements WorkingSystems_interfaec23{

	@Override
	public void application() {
		System.out.println("it will take two days for Application process");
		
	}

	@Override
	public void onboading() {
		System.out.println("it will take more than one month for Onboarding process");
	}
	
}
class Capgeminiss implements WorkingSystems_interfaec23{

	@Override
	public void application() {
		System.out.println("it will take month for process the Application");
		
	}

	@Override
	public void onboading() {
		
		System.out.println("it will take less than one month for Onboarding process");
	}
	
}

public class ApplicationProcess{
	public static void main(String[] args) {
		WorkingSystems_interfaec23 res;
		res = new wipro();
		res.application();
		res.onboading();
		
		res= new Capgeminiss();
		res.application();
		res.onboading();
	}
}