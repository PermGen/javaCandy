package com.novaed.inventory;

public class Item extends Inventory{
	private String itemName,itemType;
	private static Integer autoInc;
	private Integer idNo,size;
	Float price;

public void setPrice(Float price){
	this.price=price;
}
	
public void setItemType(String itemType) {
		this.itemType = itemType;
}	


public void setitemName(String itemName){
	this.itemName=itemName;
}

public void setidNo(Integer idNo){
	this.idNo=idNo;
}



public String getitemName(){
	return itemName;
	
}

public Integer getidNo(){
	return idNo;
}

public Integer getSize() {
	return size;
}

public void setSize(Integer size) {
	this.size = size;
}

public String getItemType() {
	return itemType;
}





}
