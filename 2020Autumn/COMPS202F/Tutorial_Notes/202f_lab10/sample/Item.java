class Item{
    private String product;    
	private int qty;

    public Item(String aProduct, int aQty) {
        product = aProduct;
        qty = aQty;        
    }

    public String getProduct() {
        return product;
    }  
     
    public String toString() {
        return "(" + product + "," + qty +")";
    } 
}