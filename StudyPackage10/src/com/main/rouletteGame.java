package com.main;

public class rouletteGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roulette game = new Roulette("이민혁", "평택");
		game.setFillUpMoney(1000);
		game.gameStart();
		game.gameOver();
		game.show();
	}

}
