package com.�����⳵;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * �����⳵������An
		 */
		String A1 = " ";
		String A2 = " ";
		String A3 = " ";
		String A4 = " ";
		String A5 = " ";
		/*
		 * �������sum
		 */
		int sum = 0;
		/**
		 * ��������people
		 */
		int people = 0;
		/*
		 * ����������������G
		 */
		int G = 0;
		
		/*��������������������
		 * ͨ��������������������췽���и�ֵ����Щ����
		 */
		Car[] carForRent = {new Passengercar("���",1000,20), new AudiCar("�µϳ�",500,5), new Trunk("���ͻ���",800,2), new Heavy("���ͻ���",1200,10), new PickUp("Ƥ��",2000,2)};
		System.out.println("��ӭʹ�������⳵");
		System.out.println("���Ƿ�Ҫ�⳵:1�ǣ�0��");
		Scanner x = new Scanner(System.in);
		String input = x.next();//����
		if(input.equals("1")){
			System.out.println("����⳵�������б��У�");
			System.out.println("���"+ "\t" + "��������" + "\t" + "���" + "\t" + "����");
			int i = 1;
			for(Car currentCar:carForRent){//�������
				if(currentCar instanceof Passengercar){//��instanceOf������������͵Ķ����Ƿ����ұ����͵�ʵ��������ֵΪBoolean  
					//�ǵü�this��ǰ�����name���������name
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"Ԫ\t"+currentCar.getCargoCapacity()+"��");
				}
				if(currentCar instanceof AudiCar ){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"Ԫ\t"+currentCar.getCargoCapacity()+"��");
				}				
				if(currentCar instanceof  Trunk ){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"Ԫ\t"+currentCar.getCargoCapacity()+"��");
				}
				if(currentCar instanceof Heavy ){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"Ԫ\t"+currentCar.getCargoCapacity()+"��");
				}
				if(currentCar instanceof PickUp){
					System.out.println(""+i+"\t"+currentCar.getName()+"\t"+currentCar.getRent()+"Ԫ\t"+currentCar.getCargoCapacity()+"��");
				}
				
			}
			System.out.println("��������Ҫ��������������");
			int a = x.nextInt();
			for(int z=1;z<=a;z++){
				System.out.println("�������"+z+"�����");
				int b = x.nextInt();	
				switch(b){
				case 1:
					A1 = "���";//����
					people+= 20;//����
					sum+=1000;//���
					break;
				case 2:
					A2 = "�µϳ�";
					people+= 4;//����
					sum+=500;//���
					break;
				case 3:
					A3 = "���ͻ���";
					sum+=800;//���
					G+= 2;//��
					break;
				case 4:
					A4 = "���ͻ���";
					sum+=1200;//���
					G+= 4;//��
					break;
				case 5:
					A5= "Ƥ��";
					sum+=2000;//���
					G+= 2;//��
					break;
				}
			}
			System.out.println("�������⳵��������");
			int c = x.nextInt();
			for(int y=1;y<c;y++){
				sum+=sum;//�����
			}
			System.out.println("***�����˵ĳ��У�"+"\t"+A1+A2+"�����ˣ�"+people);
			System.out.println("***�ػ��ĳ��У�"+"\t"+A3+A4+A5+"���ػ���"+G+"��");
			System.out.println("***����ܼ۸�"+sum+"Ԫ");
		}
		else
		{
			System.out.println("лл����ʹ��");
			System.out.println("��ӭ�´ι���");
		}
	}

}
