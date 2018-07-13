package com.kocfurkan;

import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Object>liste=new ArrayList<>();
			liste.add("Furkan");
			liste.add(1);
			liste.add("Abdullah");
		for (int i = 0; i < liste.size(); i++) 
		{
			System.out.println(i+". İndis Değeri => "+liste.get(i));
		}
		
		System.out.println("Listenin yeni hali");
		
		ArrayList<Object>liste2=new ArrayList<>();
			liste2.add("İstanbul");
			liste2.add(22);
		liste.addAll(liste2);
		
		for(int i=0;i<liste.size();i++)
		{
			System.out.println(i+". İndis Değeri => "+liste.get(i));
		}
	}
}
