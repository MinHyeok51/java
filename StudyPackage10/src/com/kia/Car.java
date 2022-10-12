package com.kia;

import com.hankook.SnowTire;
import com.hyundai.Engine;
import com.kumho.BigWidthTire;
import com.main.Coffee;


public class Car {
	//자동차 클래스
	//속성 값 - 바퀴 4, 타이어 4개
	//필드부분 인스턴스 변수 - 클래스 타입 변수
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	com.hankook.Tire tire3 = new com.hankook.Tire();
	com.kumho.Tire tire4 = new com.kumho.Tire();
	Coffee cf = new Coffee();
}
