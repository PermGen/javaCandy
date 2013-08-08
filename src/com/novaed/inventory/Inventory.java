package com.novaed.inventory;

import java.util.ArrayList;

public class Inventory {
private  ArrayList <Item> item;


public Inventory(){
	item=new ArrayList <Item>();
}

public void addItem(Item item){	
	
	this.item.add(item);
	
}

public void searchItem(Integer id){
	Boolean found=false;
	for(int i=0;i<item.size();i++){
		if(id==item.get(i).getidNo()){
			System.out.print(item.get(i).getitemName()+"\t");
			System.out.println(item.get(i).getidNo());
			found=true;
		}	
		if(found==false){
			System.out.print("Cannot find Item");
		}
		
	}
	
}


public void updateItem(Integer id,String newVal,int toChange){
	
	for(int i=0;i<item.size();i++){
		Item currItem= item.get(i);
			
			if(currItem.getidNo()==id){
				switch(toChange){
				case 1:
					currItem.setitemName(newVal);
					break;
					
				case 2:
					currItem.setidNo(Integer.parseInt(newVal));
					break;
					
				case 3:
					currItem.setSize(Integer.parseInt(newVal));
					break;
					
				case 4: 
					currItem.setItemType(newVal);
					break;
				
				case 5:
					currItem.setPrice(Float.parseFloat(newVal));
					break;
				}
		
	}	
		
	}
		
}

public void deleteItem(Integer id){
	System.out.println("\t\t\tView All");
	System.out.println("ItemName\tItemID");
	for(int i=0;i<item.size();i++){
		Item currItem= item.get(i);
		System.out.println(currItem.getitemName()+"\t\t\t"+currItem.getidNo());
	}
	
	for(int i=0;i<item.size();i++){
		if(item.get(i).getidNo()==id){
			item.remove(item.get(i));
		}
	}
}
	
public void viewAll(){
	System.out.println("\t\t\tView All");
	System.out.println("ItemName\tItemID");
	for(int i=0;i<item.size();i++){
		System.out.println(item.get(i).getitemName()+"\t\t\t"+item.get(i).getidNo());
	}
	
		
	
}
	
	
	

}
