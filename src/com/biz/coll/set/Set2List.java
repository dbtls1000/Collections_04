package com.biz.coll.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set2List {
	public static void main(String[] args) {
		
		// Set 자료구조중 TreeSet은 성능상으로는 상당히 느린편에 속함
		// 하지만 TreeSet은 데이터를 add할때 오름차순으로 정렬하는 성질이 있음
		Set<String> strSetts = new TreeSet();
		strSetts.add("홍길동");
		strSetts.add("성춘향");
		strSetts.add("이몽룡");
		strSetts.add("임꺽정");
		strSetts.add("장녹수");
		
		for(String s : strSetts) {
			System.out.println(s);
		}
		
		// Set자료를 List형으로 변경
		List<String> strList = new ArrayList<String>(strSetts);
		
		/*
		 * List형 데이터에서 중복된 데이터를 제거한 
		 * List로 만들고싶으면 먼저 List를 Set으로 한번 변환하고
		 * 다시 Set을 List로 변환해줌녀 된다.
		 */
		
		
	}
}
