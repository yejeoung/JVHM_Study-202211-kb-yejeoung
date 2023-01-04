package depency;

import controller.MainController;
import service.MainService;

public class Main {

	public static void main(String[] args) {
		// Main이 구현되기 위해서는
		// MainService라는 인스턴스가 먼저 작성이 되어있고 구현이 되어있어야 사용할 수 있다.
		// MainController에 인스턴스가 생성이 되어있어야 MainService에서 사용이 가능하다.
		// 의존하고 있다고 정의할 수 있다.

		// DI가 적용되지 않은 MainController
		MainController mainController = new MainController();
		mainController.hello();

		MainService mainService = new MainService();
		// Constructor를 이용하여 DI가 구현된 MainController
		MainController mainControllerDi1 = new MainController(mainService);

		// Setter 메서드를 이용하여 DI가 구현된 MainController
		MainController mainControllerDi2 = new MainController();
		mainControllerDi2.setMainService(mainService);

	}

}
