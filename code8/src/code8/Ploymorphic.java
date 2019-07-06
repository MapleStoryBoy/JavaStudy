package code8;

public class Ploymorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.eat();
		
		Animal a = new Cat();

	}

}
/*
 * A.多态（polymorphic）概述
 	* 事物存在的多种形态
 * B.多态的前提
 	* a.要有继承关系
 	* b.要有方法重写 
 	* c.要有父类引用指向子类对象
 * C.案例演示
 	* 代码体现多态  
 */
class Animal {
	public void eat() {
		System.out.println("动物吃饭");
	}
}
class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}







