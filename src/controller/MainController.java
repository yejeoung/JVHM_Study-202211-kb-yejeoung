package controller;

import service.MainService;

public class MainController {

	private MainService mainService;

	// MainController class는 MainServic class에 의존
	public MainController() { // 생성자
		this.mainService = new MainService();
	}

	// 1. Constructor(생성자)를 이용한 DI 구현
	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

	// 2. Setter 메서드를 이용한 DI 구현
	public void setMainService(MainService mainService) {
		this.mainService = mainService;
	}

	public void hello() {
		mainService.hello();
	}
}
