import java.util.Scanner;

public class Potion {
	
	static int potion1 = 10;
	static int potion2 = 10;
	static int potion3 = 10;
	
	// 회복량 20, 50, 200
	
	public void selectPotion() {
		
		System.out.println("사용할 회복약을 고르세요");
		System.out.printf("1. 상처약(%d개) 2. 좋은상처약(%d개) 3. 고급상처약(%d개)\n", potion1, potion2, potion3);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
			case 1:{
				if(potion1 == 0) {
					System.out.println("상처약이 없습니다");
					break;
				} else {
					System.out.println("상처약을 사용했습니다");
					// 포션 사용하는 부분이 들어가야 함
					potion1--;
					break;
				}
			}
			case 2:{
				if(potion2 == 0) {
					System.out.println("좋은상처약이 없습니다");
					break;
				} else {
					System.out.println("좋은상처약을 사용했습니다");
					// 포션 사용하는 부분이 들어가야 함
					potion2--;
					break;
				}
				
			}
			default:{
				if(potion3 == 0) {
					System.out.println("고급상처약이 없습니다");
					break;
				} else {
					System.out.println("고급상처약을 사용했습니다");
					// 포션 사용하는 부분이 들어가야 함
					potion3--;
					break;
				}
			}
			
		}
		
	}
	
}
