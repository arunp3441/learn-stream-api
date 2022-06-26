package com;

import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOperationStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 7);
		List<Integer> doubleArrayListNumbers = list.stream().map(i -> i * 2).toList();
		System.out.println("Double values of ArrayList Integers: " + doubleArrayListNumbers);
		System.out.println("maximum value " + list.stream().max(Integer::compare).get());
		System.out.println("minimum value " + list.stream().min(Integer::compare).get());
		System.out.println("List without duplicates " + list.stream().distinct().toList());
		Set<Integer> items = new HashSet<>();
		System.out.println("Duplicate elements " + list.stream().filter(n -> !items.add(n)).collect(toSet()));

		List<User> userList = new ArrayList<>(Arrays.asList(new User("John", 33), new User("Robert", 26),
				new User("Mark", 26), new User("Brandon", 42)));

		List<User> sortedList = userList.stream().sorted((o1, o2) -> {
			if (o1.getAge() == o2.getAge())
				return o1.getName().compareTo(o2.getName());
			else if (o1.getAge() > o2.getAge())
				return 1;
			else
				return -1;
		}).toList();

		sortedList.forEach(u -> System.out.println(u.getName()+" "+u.getAge()));
	}
}
