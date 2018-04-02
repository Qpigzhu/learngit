package com.哒哒租车;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * 定义租车的名称An
		 */
		String A1 = " ";
		String A2 = " ";
		String A3 = " ";
		String A4 = " ";
		String A5 = " ";
		/*
		 * 定义租金sum
		 */
		int sum = 0;
		/**
		 * 定义载人people
		 */
		int people = 0;
		/*
		 * 定义容量，即重量G
		 */
		int G = 0;
		
		/*父类数组来存放子类对象
		 * 通过创建对象传入参数到构造方法中赋值给这些属性
		 */
		Car[] carForRent = {new Passengercar("大巴",1000,20), new AudiCar("奥迪车",500,5), new Trunk("轻型货车",800,2), new Heavy("重型货车",1200,10), new PickUp("皮卡",2000,2)};
		System.out.println("欢迎使用哒哒租车");
		System.out.println("您是否要租车:1是，0否");
		Scanner x = new Scanner(System.in);
		String input = x.next();//输入
		if(input.equals("1")){
			System.out.println("你可租车的类型列表有：");
			System.out.println("序号"+ "\t" + "汽车名称" + "\t" + "租金" + "\t" + "容量");
			int i = 1;
			for(Car currentCar:carForRent){//遍历序号
				if(currentCar instanceof Passengercar){//用instanceOf来测试左边类型的对象是否是右边类型的实例，返回值为Boolean  
					//记得加this当前对象的name会等于属性name
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"元\t"+currentCar.getCargoCapacity()+"吨");
				}
				if(currentCar instanceof AudiCar ){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"元\t"+currentCar.getCargoCapacity()+"吨");
				}				
				if(currentCar instanceof  Trunk ){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"元\t"+currentCar.getCargoCapacity()+"吨");
				}
				if(currentCar instanceof Heavy ){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"元\t"+currentCar.getCargoCapacity()+"吨");
				}
				if(currentCar instanceof PickUp){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"元\t"+currentCar.getCargoCapacity()+"吨");
				}
				
			}
			System.out.println("请输入您要租汽车的数量：");
			int a = x.nextInt();
			for(int z=1;z<=a;z++){
				System.out.println("请输入第"+z+"的序号");
				int b = x.nextInt();	
				switch(b){
				case 1:
					A1 = "大巴";//车型
					people+= 20;//载人
					sum+=1000;//租金
					break;
				case 2:
					A2 = "奥迪车";
					people+= 4;//载人
					sum+=500;//租金
					break;
				case 3:
					A3 = "轻型货车";
					sum+=800;//租金
					G+= 2;//吨
					break;
				case 4:
					A4 = "重型货车";
					sum+=1200;//租金
					G+= 4;//吨
					break;
				case 5:
					A5= "皮卡";
					sum+=2000;//租金
					G+= 2;//吨
					break;
				}
			}
			System.out.println("请输入租车的天数：");
			int c = x.nextInt();
			for(int y=1;y<c;y++){
				sum+=sum;//总租金
			}
			System.out.println("***可载人的车有："+"\t"+A1+A2+"共载人："+people);
			System.out.println("***载货的车有："+"\t"+A3+A4+A5+"共载货："+G+"吨");
			System.out.println("***租金总价格："+sum+"元");
		}
		else
		{
			System.out.println("谢谢您的使用");
			System.out.println("欢迎下次光临");
		}
	}

}
