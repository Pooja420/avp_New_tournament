import org.testng.annotations.Test;

public class MainClass extends CreateEvent {
	
	public MainClass() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		loginPromoter EC = new loginPromoter();
//		EC.Login();
		
//		CreateEvent CE = new CreateEvent();
//		CE.Login();
//		CE.generateEvent();
		
		HamburgerAddTeam HAT = new HamburgerAddTeam();
		HAT.Login();
		HAT.generateEvent();
		HAT.AddTeam();
		

	}
	
	

}
