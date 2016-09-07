package javaGit.fundation;

import java.util.Arrays;

public class CompareTest implements Comparable<CompareTest>{

	public int age;
	public int score;
	public char name;
	CompareTest(int age,int score,char name){
		this.age = age;
		this.score = score;
		this.name = name;
	}
	public static void main(String[] args) {
		CompareTest c1 = new CompareTest(10,7,'a');
		CompareTest c2 = new CompareTest(1,10,'b');
		CompareTest c3 = new CompareTest(1,9,'c');
		CompareTest c4 = new CompareTest(8,8,'d');
		CompareTest[] cs = new CompareTest[]{c1,c2,c3,c4};
		Arrays.sort(cs);
	//	sleep(10);
		System.out.println(Arrays.toString(cs));
		System.out.println(c1.compareTo(c2));
	//	Arrays.sort
	}
	@Override
	public int compareTo(CompareTest o) {
		// TODO Auto-generated method stub
		if(score>o.score)return  -1;//>0.正序，<0倒叙
		else return 1;
	}
	@Override
	public String toString() {
		return "CompareTest [age=" + age + ", score=" + score + ", name="
				+ name + "]";
	}

	/**
	 * public int compare(Object arg0, Object arg1) {  
        return ((User) arg0).getAge() - ((User) arg1).getAge();  
    }  
  
    /** 
     * 测试方法 
     *  
     *  public static void main(String[] args) {  
     *   User[] users = new User[] { new User("u1001", 25),  
     *           new User("u1002", 20), new User("u1003", 21) };  
        Arrays.sort(users, new UserComparator());  
     *   for (int i = 0; i < users.length; i++) {  
     *       User user = users[i];  
     *       System.out.println(user.getId() + " " + user.getAge());  
     * }  
     *}  
	 * 选择Comparable接口还是Comparator？
                    一个类实现了Comparable接口则表明这个类的对象之间是可以相互比较的，这个类对象组成的集合就可以直接使用sort方法排序。
       Comparator可以看成一种算法的实现，将算法和数据分离，Comparator也可以在下面两种环境下使用：
       1、类的设计师没有考虑到比较问题而没有实现Comparable，可以通过Comparator来实现排序而不必改变对象本身
       2、可以使用多种排序标准，比如升序、降序等。
	 * 
	 * 
	 */
	
	
}
