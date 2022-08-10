package com.uni.section03.array_copy;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {
		/* 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
		 * 또 다른 배열에 복사를 해 놓은 것이다.
		 * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
		 * 하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
		 * */
		
		/* 깊은 복사를 하는 방법은 4가지가 있다.
		 * 1. for문을 이용한 동일한 인덱스의 값 복사
		 * 2. Object의 clone()을 이용한 복사
		 * 3. System의 arraycopy()를 이용한 복사
		 * 4. Arrays의 copyOf()를 이용한 복사
		 * 
		 * 이 중 가장 높은 성을을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이며
		 * 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf() 메소드 이다.
		 * 
		 * clone()은 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 가지고
		 * 그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조절할 수 있다는 특징을 가지고 있다.
		 * */
		
		//원본배열
		int[] originArr = new int[] {1, 2, 3, 4, 5};
		
		print(originArr);
		
		//1. for문을 이용한 인덱스값 복사
		int[] copyArr1 = new int[10];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		print(copyArr1); //원본 배열과 복사한 값은 같은 값을 가지고 나머지 인덱스는 다른 값, 다른 주소를 가지고 있다.
		
		//2. Object의 clone()을 이용한 복사
		
		int[] copyArr2 = originArr.clone(); //동일한 길이, 동일한 값을 가지는 배열이 생성되어 복사되며, 다른 주소를 가지고 있다.
		print(copyArr2);
		
		//3. System의 arraycopy()를 이용한 복사
		int[] copyArr3 = new int[10];
		/* 원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이 의미를 가진다. */
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		print(copyArr3);
		
		//4. Arrays의 copyOf()를 이용한 복사 - 원하는 길이 만큼 복사
		int[] copyArr4 = Arrays.copyOf(originArr, 8);
		print(copyArr4);//복사한만큼의 값은 같지만 길이도 다르고 주소도 다르다.
		
		
	}

	
	/**<pre>
	 * 배열을 매개변수로 전달받아
	 * 모든 인덱스에 저장되어 있는 값을 출력하는 기능을 제공
	 * </pre>
	 * @param iarr 저장된 값을 출력하기 위한 문자열 배열
	 */
	public static void print(int[] iarr) {
		
		/* 전달받은 배열의 hashcode 출력 */
		System.out.println("sarr의 hashcode : " + iarr.hashCode());
		
		/* 전달받은 배열의 값 출력 */
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
	}
}
