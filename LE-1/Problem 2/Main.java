public class Main {
    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.show();  
 
        Mother child = new Child();  
        child.show();  
 
        Child directChild = new Child();
        directChild.show();  
    }
}
