package javaGit.fundation;


public class Main {

	public static void main(String[] args) {
		TestThread t1 = new TestThread(1);
		TestThread t2 = new TestThread(2);
	       t1.start();
	       t2.start();
	}
}
