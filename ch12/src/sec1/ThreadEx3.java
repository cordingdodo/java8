package sec1;
//멀티 쓰레드 상에서 같은 직업 그룹에 속할 수도 있으며, 각기 다른 직업들을 하나의 작업 그룹으로 설정도 할 수 있다.
//멀티 쓰레드에서 A쓰레드가 CPU 안에서 동작되다가 B쓰레드가 처리되기 위해 CPU안으로 로딩되면, 처리되던 A쓰레드는  B쓰레드가 있던 캐시메모리로 들어감 -> 문맥효관(Context switching)
//이러한 일이 자주 일어나게 된다면,캐시메모리에 계속 쓰던 자리만 쓰게됨   -> 지역성(locality)
//만약, 캐시메모리가 차게 되면 , 그 데이터는 메인 메모리로 이동되고, 메인메모리마저 꽉 차게 되면, 가상 메모리 이용함
//어떤 메모리에도 CPU가 찾는 데이터가 없을 수도 있는 현상이 발생하게됨 -> Thrashing 쓰레싱
//프로세스가 일 처리되던 중에 갑자기(suddenly 예기치않은상황 발생->cpu하던일 멈추고 긴급상황 처리하고난후, 원래로 복귀함->인터럽트(Interrupt)
//만약, 쓰레드가 종료가 되려면, 정상 종료 또는 인터럽트로 종료 및 일시중지 될 수 있다
public class ThreadEx3 {
	public static void main(String[] args) {	
		Thread th0 = new Thread(new ThreadWithRunnable());
		th0.start();
		System.out.println(th0.getThreadGroup());
		
		ThreadGroup group = new ThreadGroup("myGroup");
		group.setMaxPriority(7);
		
		//th1은 myGroup에 배정됨
		Thread th1 = new Thread(group, new ThreadWithRunnable());
		th1.start();
		Thread th2 = new Thread(group, new ThreadWithRunnable());
		th2.start();
		group.setMaxPriority(10);
		System.out.println(th1.getThreadGroup());
		Thread.State state = th0.getState(); //쓰레드의 현재 상태를 가져오기
		if(state==Thread.State.NEW){
			System.out.println("쓰레드 시작");
		} else if(state==Thread.State.RUNNABLE){
			System.out.println("쓰레드 실행 준비");
		} else if(state==Thread.State.TERMINATED){
			System.out.println("쓰레드 종료");
		} else if(state==Thread.State.BLOCKED){
			System.out.println("블록킹 발생");
		} else if(state==Thread.State.TIMED_WAITING){
			System.out.println("시간 만료로 인해 대기 발생");
		} else { System.out.println("알 수 없는 상황이거나 쓰레드 실행이 실패되었습니다.");
	}
}

}