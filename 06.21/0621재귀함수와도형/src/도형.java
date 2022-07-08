/*
 * 
 * 	calcRound(double 가로변, double 세로변)	//둘레를 계산
	calcArea(double 가로변, double 세로변)	//면적을 계산
	
	도형(부모클래스)	둘레				면적
	정삼각형 		3*(변)			루트3/4*변의제곱
	직삼각형 	    가로+세로+빗변		가로*세로*0.5
	사각형 		2*(가로+세로)		가로*세로
	원    		2*PI*(반지름)		(반지름)*(반지름)*PI
 */
public abstract class 도형 {
	 public abstract double calcRound();
	 public abstract double calcArea();
}
