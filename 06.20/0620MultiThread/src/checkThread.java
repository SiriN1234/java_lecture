
public class checkThread implements Runnable{
	
	String name;
	
	public checkThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			try {
				System.out.println(name);
				Thread.sleep(1000); // 1000 밀리 세컨드 = 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "쓰레드 종료");
		
	}
}
