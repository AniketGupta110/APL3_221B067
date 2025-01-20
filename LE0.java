
public class LE0 {
    private int speed;
    private String name; 

   
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
         Main myCar = new Main();

        myCar.setName("BMW 7 Series");
        myCar.setSpeed(120);

        System.out.println("Name " + myCar.getName());
        System.out.println("Speed " + myCar.getSpeed() );
    }
}
