package com.javaex.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		List<Friend> fList = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < 3; i++) {
			//1줄 공백으로 구분된 문자열 입력받기
			String friendStr = sc.nextLine();

			//공백기준으로 구분한다
			String[] friendArray= friendStr.split(" ");
			String name = friendArray[0];
			String hp = friendArray[1];
			String school = friendArray[2];
			
			// Friend 객체 생성하여 데이터 넣기
			Friend friend = new Friend(name, hp, school);

			// 배열에 추가하기
			fList.add(friend);
		}

		// 친구정보 출력
		for (int i = 0; i < fList.size(); i++) {
			fList.get(i).showInfo();
		}

		sc.close();

	}

}
