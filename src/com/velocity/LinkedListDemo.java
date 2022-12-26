package com.velocity;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	
	List<String> l=new LinkedList<String>();
	l.add("arati");
	l.add("rohini");
	l.add("aasha");
	l.add("aanu");
	l.stream().forEach(x->System.out.println(x));
}
}
