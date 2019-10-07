package CustomerOrder;

import java.util.ArrayList;

public class SupplierReg {
	
	public ArrayList<Supplier> supplierList = new ArrayList<Supplier>();
	
	public Supplier getSupplier() {
		return supplier;}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;}

	public SupplierReg() {}
	Supplier supplier;
	
	public ArrayList<Supplier> getSupplierList() {
		return supplierList;}

	public void setSupplierList(ArrayList<Supplier> supplierList) {
		this.supplierList = supplierList;}
	
	public Supplier find(String supplierid) 
	 {
	        for (int i = 0; i < supplierList.size(); i++) {
	            if (supplierList.get(i).getSupplierid().equals(supplierid)) {
	                System.out.println(" Supplier is found"+supplier.getSupplierid());
	                return supplierList.get(i);
	            }
	        }
	        return null;
	    }
		
	public void add(Supplier supplier) 
	 {
		 supplierList.add(supplier);
	 }
	
	public void remove(String supplierid)
	{
		 for (int i = 0; i < supplierList.size(); i++) {
			 if (supplierList.get(i).getSupplierid().equals(supplierid)) {
				 supplierList.remove(supplierid);
				 
			 }
		 }
	}
	
	public void printAllArticle()
	{
		for (int i = 0; i <supplierList.size(); i++) { 
			
			System.out.println("Supplier name " + supplierList.get(i).getSuppliername() + "Supplier Id: " + supplierList.get(i).getSupplierid());
		}
	}
	public void update(String supplierid, String suppliername)
    {
		Supplier supplier = this.find(supplierid);
        supplier.setSuppliername(suppliername);
											
	}
}


