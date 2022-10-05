//쓰레드(Thread) : 현재 실행 중인 프로그램 또는 데이터나 프로세스를 의미함 실제 컴퓨터에서는 두 개 이상의 쓰레드가 실행 중이게 되는데 이를 멀티 쓰레드라고 부름
//쓰레드를 시작하려면 Thread 클래스 또는 [ThreadWith]Runnable 인터페이스로부터 상속 받아 run 메소드를 기술하고,run 메소드 안에는 작업할 내용을 기술하며,
//main() 함수에서 해당 객체를 생성 후 객체.run() 하면 쓰레드 시작할 수 있다.
//쓰레드는 다중 쓰레드라고 하더라도 순차적으로 처리되어 하나의 쓰레드가 실행이 완료되면, 다음 쓰레드를 자동으로 시작한다 ->비선점형 (run 메서드로 실행)
//다중 쓰레드에서 우선 순위나 주어진 실행시간이 다 되거나 or sleep이 발생하는 동안 다른 쓰레드가 먼저 처리될 수 있다. ->선점형(start 메서드 실행) 
package sec1;
	public class ThreadEx1 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new ThreadWithRunnable()); //ThreadWithRunable(인터페이스) 상속 받아 오버라이딩 = 추상화
		th1.run();//쓰레드 시작 
		
		ThreadWithClass th2 = new ThreadWithClass(); //Thread(클래스)로부터 상속 받아 run 메소드 선언
		//반드시 Thread(클래스)로부터 상속받아 ThreadWithClass(클래스)에 run메소드로 기술해야함
		th2.run(); //쓰레드 시작
		
		ThreadWithClass th3 = new ThreadWithClass(); //비선점형
		th3.start();//쓰레드 시작
	
		Thread th4 = new Thread(new ThreadWithRunnable()); //선점형
		th4.start();//쓰레드 시작
		//순서 계속 엎치락 뒷치락함
	}
	
	}

class ThreadWithClass extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println(this.getName()); //메소드
		try {
			Thread.sleep(10); //10->0.01초 mmseconde (밀리세컨드)단위
		} catch (InterruptedException e) { 
			//프로세스가 일 처리되던 중에 갑자기(suddenly 예기치않은상황 발생->cpu하던일 멈추고 긴급상황 처리하고난후, 하던일로(원래대로) 복귀함->인터럽트(Interrupt)
			e.printStackTrace();
		} 
		}
	}
}
class ThreadWithRunnable implements Runnable { //runnable은 인터페이스라서 반드시 오버라이딩하여 해당 메서드 구현부로 기술해야함
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()); //현재 실행중인 쓰레드의 이름 출력
			try {
				Thread.sleep(10); //반드시 넣으라는 게 아니라 너무 빨리 실행되어서 딜레이를 넣는 것임 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}