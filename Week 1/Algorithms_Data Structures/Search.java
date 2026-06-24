class Product {
    private int productId;
    private String productName;
    private String category;
   
    Product(int productId, String productName,String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getproductId(){
        return productId;
    }
    public String getproductName(){
        return productName;
    }
    public String getcategory(){
        return category;
    }


    public String toString() { 
        return "Product ID: " + productId + ", Product Name: " + productName + ", Category: " + category;
    }


}

class Search{

    public static Product linearSearch(Product[] products, int target){

        for(Product p : products){
            if(p.getproductId()==target){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products,int target){

        int left=0;
        int right=products.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(products[mid].getproductId()==target){
                return products[mid];
            }
            else if(products[mid].getproductId()>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return null;
    }
    
    public static void main(String args[]){
        Product[] products = {
            new Product(1,"Laptop","Electronics"),
            new Product(2,"EyeLiner","Cosmetics"),
            new Product(3,"Scrunchie","Accessories"),
        };

        Product res = linearSearch(products,3);

        if(res!=null){
            System.out.println("Product Found: " + res);
        }else{
            System.out.println("Product Not Found");
        }

        Product res1 = binarySearch(products,2);

        if(res1!=null){
            System.out.println("Product Found: " + res1);
        }else{
            System.out.println("Product Not Found");
        }
    }
}
