package com.uni.array.section02.demensional_array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {
		
		/* 세 명의 학생 성적 정보를 2차원 배열에 초기화 한 후
		 * 과목별 합계, 학생별 총점 및 평균을 구하여 출력하세요
		 * 
		 * -- 출력 예시 --
		 * ================== A반 성적표 ====================
         * 이름        국어          영어          수학          합계            평균
         * -----------------------------------------------
         * 홍길동       80      90       77      247     82.3
         * 이순신       78      97       86      261     87.0
         * 유관순       71      68       88      227     75.7
         * -----------------------------------------------
         * 합계        229     255      251      735     81.7
		 * */
		final int STUDENTS = 3;
		
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		String[] names = {"홍길동", "이순신", "유관순"};
		//grades[x][0] : 국어, grades[x][1] : 영어, grades[x][2] : 수학 
		int[][] grades = {{80,90,77},{78,97,86},{71,68,88}};
		
		int[] subGradeHTot = new int[STUDENTS];//학생별 합계
		int[] subGradeVTot = new int[grades[0].length];//과목별 합계
		double[] subGradeAvg = new double[STUDENTS];//학생별 평균
		int total = 0;//전체 합계
		double totalAvg = 0;//학생별 평균의 평균
		
		for(int i = 0; i < grades.length; i++) {
			for(int j = 0; j < grades[i].length; j++) {
				//학생별 합계
				subGradeHTot[i] += grades[i][j];
				
				//과목별 합계
				subGradeVTot[j] += grades[i][j];
				
				//전체 합계
				total += grades[i][j];
			}
		}
//		print(subGradeHTot);
//		print(subGradeVTot);

		//학생별 평균
		for(int i = 0; i < STUDENTS; i++) {
			subGradeAvg[i] = Math.round( subGradeHTot[i] / 3.0 * 10.0) / 10.0;
		}
//		print(subGradeAvg);
		
		for(int i = 0; i < STUDENTS; i++) {
			totalAvg += subGradeAvg[i];
		}
		
		//학생별 평균의 평균
		totalAvg = Math.round(totalAvg / 3.0 * 10.0) / 10.0;
		
		/* 출력 */
		//타이틀
		System.out.println("================== A반 성적표 ====================");
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		//본문내용
		for(int i = 0; i < STUDENTS; i++) {
			for(int j = 0; j < title.length; j++) {
				switch(j) {
					case 0:
						System.out.print(names[i] + "\t");
						break;
					case 1:
					case 2:
					case 3:
						System.out.print(grades[i][j-1] + "\t");
						break;
					case 4:
						System.out.print(subGradeHTot[i] + "\t");
						break;
					case 5:
						System.out.print(subGradeAvg[i] + "\t");
					break;
					default: 
						break;
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		//합계
		for(int i = 0; i < title.length; i++) {
			switch(i) {
			case 0:
				System.out.print("합계\t");
				break;
			case 1:
			case 2:
			case 3:
				System.out.print(subGradeVTot[i-1] + "\t");
				break;
			case 4:
				System.out.print(total + "\t");
				break;
			case 5:
				System.out.print(totalAvg + "\t");
			break;
			default: 
				break;
		}
		}
	}
	
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void print(double[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
