package com.hsbc.thread;

public class PingPong extends Thread {
	
	String word;

	public PingPong(String word) {
		this.word = word;
	}
	
	public void run() {
	}
	
	public static void main(String[] args) {
		Thread t1 = new PingPong("Ping");
		Thread t2 = new PingPong("Pong");
		
		t1.start();
		t2.start();
	}
}
