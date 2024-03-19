package controller;

public class ThreadMatriz extends Thread{
	public ThreadMatriz() {
		
	}
	private int a,b,c,d,e;
	public ThreadMatriz(int a, int b, int c, int d, int e){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		
	}
		public void run() {
			calc();
		}
		private void calc() {
			int total = a+b+c+d+e;
			System.out.println("Id = "+getId()+" res: "+total);
			
		}
}
