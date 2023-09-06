//package com.programming.batch1;
//
//public class ContinueKeyword {//It will skip the condition that is met by the code.
//	for(int i = 1; i<=3; i++) {
//		for(int j =1;j<=3;j++) {
//			if(i==2 && j==2)
//				continue;
//				System.out.println(i + " " + j);
//		}
//	}
//
//}


package com.programming.batch1;

public class ContinueKeyword {//It will skip the condition that is met by the code.
	 PQR: for(int i = 1; i<=3; i++) {
		for(int j =1;j<=3;j++) {
			if(i==2 && j==2)
				continue PQR;
				System.out.println(i + " " + j);
		}
	}

}

