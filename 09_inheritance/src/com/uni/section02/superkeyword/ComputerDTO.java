package com.uni.section02.superkeyword;

import java.util.Date;

public class ComputerDTO extends ProductDTO{
	private String cpu;               //cpu
	private int hdd;               //hdd(Hard Disk Drive)
	private int ram;               //ram
	private String operationSystem;      //운영체제
	
	
	public ComputerDTO() {
		System.out.println("ComputerDTO 기본생성자가 호출됨");
	}
	
	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		super();//부모클래스의 기본생성자를 호출
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}
	//부모필드도 모두 초기화 하는 생성자
	public ComputerDTO(String code, String brand, String name, int price, Date manufacturingDate,
			String cpu, int hdd, int ram, String operationSystem) {
		//부모의 모든 필드를 초기화하는 생성자로 productDTO클래스가 가진 피륻를 초기화할 값 전달
		//생성자 에서는 super()과 this() 중 하나만 사용 가능하다
		super(code, brand, name, price, manufacturingDate);
//		this(cpu, hdd, ram, operationSystem);//에러
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("ConputerDTO 부모필드도 모두 초기화 하는 생성자 호출됨");
	}


	@Override
	public String getInformation() {
//		return "ComputerDTO ["
//		      + "code=" + super.getCode()
//		      + ", brand=" + super.getBrand()
//		      + ", name=" + super.getName()
//		      + ", price=" + super.getPrice()
//		      + ", manufacturingDate=" + super.getManufacturingDate()
//		      + ", cpu=" + this.cpu
//		      + ", hdd=" + this.hdd
//		      + ", ram=" + this.ram
//		      + ", operationSystem=" + this.operationSystem
//		      + "]";
		
		
		/* super.getInformation() : 정상적으로 부모의 메소드 호출
		 * this.getInformation()  : 재귀호출 일어나며 stackOverflow 발생 // 계속 현재 getInformation 가 호출되기때문
		 * getInformation()       : this.이 자동 추가되어 재귀 호출 일어남
		 * 
		 * 따라서 이런 경우 super.을 명시적으로 사용해야 한다.
		 *  */
		return super.getInformation() 
					+ "ComputerDTO ["
					+ "cpu=" + this.cpu                        
					+ ", hdd=" + this.hdd                        
					+ ", ram=" + this.ram                        
					+ ", operationSystem=" + this.operationSystem
					+ "]";                                       
	}

	public String getCpu() {
		return cpu;
	}


	public int getHdd() {
		return hdd;
	}


	public int getRam() {
		return ram;
	}


	public String getOperationSystem() {
		return operationSystem;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public void setHdd(int hdd) {
		this.hdd = hdd;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	
}
