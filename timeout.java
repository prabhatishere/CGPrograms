package CGPrograms;

public class timeout{
	public static void main(String args[]){
		while(true){
			System.out.println("Hello World");
			try {
				Thread.sleep(2000); // 1s = 1000

}catch(InterruptedException e){
	System.err.println("Sleep Interrupted "+e.getMessage());
}
		}
	} 
}
