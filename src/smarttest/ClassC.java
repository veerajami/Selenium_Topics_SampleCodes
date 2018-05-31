package smarttest;



class ClassA {
	private static int i=10;
	static int j=20;
	 protected static int k=30;
	 public static int l=40;
	public void call() {
		System.out.println("call");
	}
	public void record() {
		System.out.println("Sound");
	}
	
}

 class ClassB extends ClassA{
	
	public void call() {
		System.out.println("call,chat,video");
	}
	
	public void play() {
		System.out.println("Music");
	}
	
}
 public class ClassC {

	public static void main(String[] args) {
	
		ClassA a=new ClassB();
		a.record();
		a.call();
		
		
	}
	
}

