package c230925_test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Testing {
	Scanner scr= new Scanner(System.in);
	public void Q1() {
		String input;
		String input2;
		System.out.println("문자열을 입력하세요 ");
		input=scr.nextLine();
		System.out.println("찾을 문자를 입력하세요 ");
		input2=scr.nextLine();
		int count=0;
		char input2_1;
		input2_1=input2.charAt(0);
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)==input2_1) {
				count++;
			}
		}
		System.out.println("해당 문자의 갯수는 : "+ count + " 개 입니다");
	}
	//거꾸로 뒤집는 프로그램
	public void Q2(String input) {
		char[] arr = new char[input.length()];
		for(int i=0; i<input.length(); i++) {
			char temp= input.charAt(i);
			arr[i]=temp;
		}
		for(int i=arr.length; i<0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	//공백제거
	public void Q3(String str) {
		String output=str.replaceAll("\\s", "");
		System.out.print(output);
		}
//	//대소문자 변경
	public void Q4(String str) {
		char[] arr= new char[str.length()];
		String s1="";
		for(int i =0; i<str.length(); i++) {
			char temp=str.charAt(i);
			if(Character.isUpperCase(temp)) {
				Character.toLowerCase(temp);
				s1+=Character.toLowerCase(temp);
			}
			else if(Character.isLowerCase(temp)) {
				Character.toUpperCase(temp);
				s1+=Character.toUpperCase(temp);
			}
		}
			System.out.print(s1);
		
	}
	//특정 문자열 인덱스 반환
	public int findCharIndex(String str, char target) {
		return str.indexOf(target);
	}
	//단어의 갯수 출력
	public int countWords(String str) {
		int count=1;
		char[] temp=str.toCharArray();
		for(int i=0; i<temp.length; i++) {
			if(temp[i]==' ') {
				count++;
			}
		}
		return count;
	}
	//소수 판별
	public void isPrime(int num) {
		if(num%num==0) {
			System.out.println("정수입니다.");
		}
		else {
			System.out.println("정수가 아닙니다");
		}
	}
	//정수 자릿수 합
//	public void calculateDigitsum(int num) {
//		String temp=new String(num.toString());
//	}
	//배열 공통항목 찾기
	public void FindCommonItems(int[] arr1, int[] arr2, int[] arr3) {
		ArrayList<Integer> temp=new ArrayList<>();
		HashSet<Integer> a= new HashSet<>();
		HashSet<Integer> b= new HashSet<>();
		for(int i=0;i<arr1.length; i++) {
			temp.add(arr1[i]);
		}
		for(int i=0;i<arr2.length; i++) {
			temp.add(arr2[i]);
		}
		for(int i=0;i<arr3.length; i++) {
			temp.add(arr3[i]);
		}
		Integer[] temp2=temp.toArray(new Integer[temp.size()]);
		for(int i=0;i<temp2.length; i++) {
			if(!a.add(temp2[i])) {
			b.add(temp2[i]);
			}
		}
		Integer[] c=b.toArray(new Integer[b.size()]);
		for(Integer integer : c) {
			System.out.println(integer);
		}	
	}
	public void upDownGame() {
		int input;
		String countover;
		int comCount =(int)(Math.random()*1000);
		int MaxAct =10;
		while(true) {
			System.out.println("플레이어의 숫자를 입력해주세요.");
			input=scr.nextInt();
			if(input==comCount) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			else if(input>comCount) {
				System.out.println("유저 숫자가 더 큽니다.");
				MaxAct--;
			}
			else if(input<comCount) {
				System.out.println("컴퓨터의 숫자가 더 큽니다");
				MaxAct--;
			}
			if(MaxAct<=0) {
				System.out.println("기회를 다 소진하셨습니다. 재시작하려면 '다시'를, 포기하시려면 '그만'을 입력하세요");
				countover=scr.nextLine();
				switch(countover) {
				case "그만" :
					System.exit(0);
				case "다시" :
					break;
				}
				if(countover.equals("다시")){
					break;
				}
			}
		
		}
	}
}
