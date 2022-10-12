package com.main;

public class Coffee {
	//필드
	public int price;
	String size;
	private int id;

	//생성자
	//default 같은 패키지까지는 ok
	//public 모두 ok
	//protected 같은 ㅍ패키지+ 자식클래스 ok
	//private
	public Coffee(){
		price = 1000;
		size = "tall";
		id =1;
	}
//	public void setPriceP(int price) {
//		this.price= price;}
//
//	public void setPriceD(int price) {
//		this.price= price;}
//	void setPricePR(int price) {
//		this.price= price;
//			}
		}
