public class App {
    public static void main(String[] arg) {
        
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Tumbler");
        p1.setBarcode();
        
        System.out.println(p1);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Bucket");
        p2.setBarcode();
        
        System.out.println(p2);
    }  
}