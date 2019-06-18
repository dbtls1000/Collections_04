package com.biz.coll.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_01 {
	public static void main(String[] args) {
		
		List<Integer> intArrayList1 = new ArrayList<Integer>(); // 선언과 동시에 초기화
		
		// 선언따로 초기화 따로
		List<Integer> intLinkedList2;
		intLinkedList2 = new LinkedList<Integer>();
		
		for(int i = 0 ; i < 100 ; i++) {
			intArrayList1.add(i);
			intLinkedList2.add(i);
		}
		
		// 컴퓨터의 현재 시각을 밀리세컨드 값으로 알려주는 시스템 클래스 method
		// 1970냔 1월 1일 00:00:00:000 부터 현재까지 흐른 시각을 알려줌 UNIX Time
		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i<10000 ; i++) {
			intArrayList1.add(20,1000);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ArrayList Add Time : " +(endTime - startTime));
		
		startTime = System.currentTimeMillis();
		endTime = System.currentTimeMillis();
		for(int i = 0 ; i<10000 ; i++) {
			intLinkedList2.add(20,1000);
		}
		System.out.println("LinkedList Add Time : " +(endTime - startTime));
	}
}
