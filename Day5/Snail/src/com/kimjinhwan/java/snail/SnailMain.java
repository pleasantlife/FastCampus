package com.kimjinhwan.java.snail;

public class SnailMain {

	public static void main(String[] args) {

		printSnail(drawSnail(6));
	}

	public static int [][] drawSnail(int count){
		int [][] array1 = new int[count][count];
		int x = -1; // 가로축의 값
		int y = 0;  // 세로축의 값
		int direction = 0; //방향 (0 : 우측으로, 1: 아래로, 2: 좌측으로, 3: 위로)
		int number = 1; //출력되는 값
		int size = count; //변동을 막기 위하여 size 변수 선언.
		
		while( size > 0 ){
			for(int i = 0; i < size; i++){
				if(direction == 0){
					x++;			 // 오른쪽으로 움직이기 떄문에 가로축값이 커짐.
				}
				else if(direction == 1){
					y++;			// 아래로 움직이기 때문에 세로축값이 커짐.
				}else if(direction ==2){
					x--;			// 왼쪽으로 움직이기 때문에 가로축값이 작아짐.
				}else if(direction ==3){
					y--;			// 위쪽으로 움직이기 때문에 세로축값이 커짐.
				}
				array1[y][x] = number;	// [0,0],[0,1],[0,2] 로 숫자가 늘어나기 때문에 [x][y]가 아닌 [y][x]가 된다.
				number++;				// [1,0],[1,1],[1,2]
			}
			if(direction == 0 || direction ==2){
				size--;
			}
			direction++;
			if(direction > 3){
				direction = 0;
			}
		}
		return array1;
	}
	
	public static void printSnail(int array1[][]){
		for(int i = 0; i < array1.length; i++){
			for(int j = 0; j < array1[0].length; j++){
				int temp = array1[i][j];
				System.out.print("["+temp+"]");
			}System.out.println("");
		}
	}
}	


	
			
		


