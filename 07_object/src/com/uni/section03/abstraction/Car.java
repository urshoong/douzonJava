package com.uni.section03.abstraction;

public class Car {
	private boolean isOn;//초기에는 시동이 꺼진 false 상태
	private int speed;//초기값이 0
	
	public void startUp() {
		if(this.isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
		}else {
			this.isOn = true; //시동을 건다.
			System.out.println("시동을 걸었습니다.");
		}
	}
	
	public void go() {
		if(this.isOn) {
			System.out.println("차가 앞으로 움직입니다.");
			this.speed += 10;
			System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
		}else {
			System.out.println("차에 시동이 걸려있지 않습니다. 시동을 걸어주세요.");
		}
	}
	
	public void stop() {
		if(this.isOn) {
			if(this.speed > 0) {
				this.speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
			}else {
				System.out.println("차는 이미 멈춰있는 상태입니다.");
			}
		}else {
			System.out.println("차에 시동이 걸려있지 않습니다. 시동을 걸어주세요.");
		}
	}
	
	public void turnOff() {
		if(this.isOn) {
			if(this.speed > 0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈추세요.");
			}else {
				this.isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요.");
			}
		}else {
			System.out.println("이미 시동이 꺼져이는 상태입니다.");
		}
	}
}
