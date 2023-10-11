package ssafy.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1 {

	public static void main(String[] args) throws IOException {
		// get inputs
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().trim().split(" ");
		
		int n1 = Integer.parseInt(temp[0]);
		int n2 = Integer.parseInt(temp[1]);
		
		// call solution
		Solution s = new Solution();
		s.find(n1, n2);
	}
}

class Solution {
	
	// 	두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력 
	public void find(int n1, int n2) {
		// init variable
		int max = 0, min = 0;
		
		// logics
		
		// 1. 두 수 중 작은 수를 찾는다 
		int small, big;
		
		if (n1 > n2) {
			big = n1;
			small = n2;
		} else {
			big = n2;
			small = n1;
		}
		
		// 2. 작은수로 나머지 연산을 순서대로 해본다
		for (int i = small; i > 0; i--) {
			int r1 = big % i;
			int r2 = small % i;
			
			// 만약 r1, r2 모두 나머지가 0이라면 최대 공약수를 찾음
			// i = 1까지 가니까 1 또는 그 이상이 최대 공약수로 설정
			if (r1 == 0 && r2 == 0) {
				max = i;
				break;
			}
		}
		
		// 3. 구한 최대 공약수를 이용해 최소 공배수를 만들어보자
		int v1 = big / max;
		int v2 = small / max;
		
		min = v1 * v2 * max;
		
		// print result
		System.out.println(max);
		System.out.println(min);
	}
}


//두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
//첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
//첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

// 최대공약수가 두 수보다 작지만 있는 경우 
//24 18
//6
//72

// 최대공약수가 둘 중 하나인 경우 (작은 수)
//36 12
//12
//36

// 최대공약수가 1인 경우
//5 7
//1
//35

// 두 개의 수가 같은 경우 
//5 5
//5
//5
