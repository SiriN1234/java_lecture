public class rspThread extends Thread {
	
	int gameCount = 0;
	
	public rspThread(int now) {
		super();
		this.gameCount = now;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++){
			if(RSP.inputCheck == true || gameCount != RSP.gameCount){
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		RSP.lose = false;
		System.out.println("시간이 초과되어 당신이 졌습니다.");
		
	}

}
