import com.novaed.inventory.*;
import java.io.*;
public class testInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		Integer choice,itemSize,count=0;
		boolean isUse=true;
		char esc=27;
		String itemName,itemId,itemType;
		Float itemPrice;
		
		BufferedReader  input=new BufferedReader(new InputStreamReader(System.in));
		
		
		Inventory inv=new Inventory();
		
		
		
		
		
		
		
		
		while(isUse){
			Item item=new Item();
			System.out.println("\t\t\tInventory\n\n\n");
			System.out.println("1. \t Add Items\n2.\t Update Items\n3.\t Delete Items\n4.\t View all\n0.\t Quit");
			
			System.out.print("Enter your choice\t");
			choice=Integer.parseInt(input.readLine());	
			
		
			
			
				switch(choice){
				case 0:
					isUse=false;
					break;
				case 1:
					System.out.println("New Item");
					System.out.print("Enter Name of Item:\t");
					itemName=input.readLine();
					
					
					
					System.out.print("Enter Item type:\t Candy or Nuts?");
					itemType=input.readLine();
					
					System.out.print("Enter Item Size:\t");
					itemSize=Integer.parseInt(input.readLine());
					
					System.out.print("Enter Item Price:\t");
					itemPrice=Float.parseFloat(input.readLine());
					
					item.setitemName(itemName);
					item.setidNo(count);
					item.setItemType(itemType);
					item.setSize(itemSize);
					item.setPrice(itemPrice);
					inv.addItem(item);
					
					break;
				case 2:
						Integer searchId,toChange;
						String newVal ;
						
						System.out.print("Search Item using ID\t");
						searchId=Integer.parseInt(input.readLine());
						inv.searchItem(searchId);
						
						System.out.println("Edit Item");
						System.out.println("1.\t Edit Item Name");
						System.out.println("2.\t Edit Item ID");
						System.out.println("3.\t Edit Item Size");
						System.out.println("4.\t Edit Item Type");
						System.out.println("4.\t Edit Item Price");
						
						System.out.print("Enter Category to Edit:\t");
						
						toChange=Integer.parseInt(input.readLine());
						System.out.print("Enter New Value :\t");
						newVal=input.readLine();
						
						inv.updateItem(searchId, newVal, toChange);
					
					break;
				case 3:
					int choice2;
					inv.viewAll();
					System.out.print("Type the Id you want to delete\t");
					choice2=Integer.parseInt(input.readLine());
					inv.deleteItem(choice2);
					System.out.print("Item have Been Deleted");
					
					
					break;
					
				case 4:
					inv.viewAll();
					break;
				default:
					
					}
			
			count++;
			
			
		}
		
		
		
		
		
		
		

		
		
	}

}
