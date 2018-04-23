package com.company;

public class Main {

    public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	list.add("Artiom");
	list.add("Maksim");
	list.add("Zema");
	list.add("Sasha");
	list.add("Tania");

	System.out.println(list.get(2) + "\r\n");

	for (int i = 0; i < list.getCount(); i++) {
		System.out.println(list.get(i).toString());
	}

	list.delete(1);
	System.out.println();

	for (int i = 0; i < list.getCount(); i++) {
		System.out.println(list.get(i).toString());
	}

	System.out.println("\n\r" + list.contains("Sasha"));

	System.out.println("\n\r" + list.delete("Artiom") + "\n\r");

	for (int i = 0; i < list.getCount(); i++) {
		System.out.println(list.get(i).toString());
	}
    }
}
