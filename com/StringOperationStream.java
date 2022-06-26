package com;

import static java.util.stream.Collectors.toSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringOperationStream {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<>(List.of("Mercedes", "Toyota", "Nissan", "Volkswagen", "Ford", "Maclaren","Mercedes", "Nissan",
				"Ford"));
		System.out.println("List without duplicates " + cars.stream().distinct().toList());
		Set<String> items = new HashSet<>();
		System.out.println("Duplicates " + cars.stream().filter(s -> !items.add(s)).collect(toSet()));
	}
}
