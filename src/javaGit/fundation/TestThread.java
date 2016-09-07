package javaGit.fundation;

public class TestThread extends Thread{

	String str = "123456789ABCDEFGHIGKLMNOPQRSTUVWXYZ";
	int flag;
	TestThread(int num){
		this.flag = num;
	}
	public void run(){
		
		for(int i=0;i<100;i++){
           
            	try {
    				sleep(10);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            
			
			int tem = (int)Math.floor((Math.random()*35));
			System.out.println(this.flag+" ,"+i+":"+str.charAt(tem));
		}
	}
	public static void main(String[] args) {
		TestThread t1 = new TestThread(1);
		TestThread t2 = new TestThread(2);
		TestRannable t3 = new TestRannable(3);
		TestRannable t4 = new TestRannable(4);
	       t1.start();
	       try {
			sleep(100);//因为是在继承了的Thread里，所以才有这个方法
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       t2.start();
	       t3.run();
	       t4.run();
	}
}


class TestRannable implements Runnable{
	String str = "123456789ABCDEFGHIGKLMNOPQRSTUVWXYZ";
	int flag;
	TestRannable(int num){
		this.flag = num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
            if(flag==1){
            	try {
    				Thread.sleep(10);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
            }
			
			int tem = (int)Math.floor((Math.random()*35));
			System.out.println(this.flag+" ,"+i+":"+str.charAt(tem));
		}
	}

}