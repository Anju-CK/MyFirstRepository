public class Vehicle {
    public static void main(String[] args){
        Engine eng =new Engine("petrol",300);
        Car car = new Car("alto",eng);
        System.out.println("name: "+car.getName());
        System.out.println("Engine type: "+eng.getType());
        System.out.println("HorsePower: "+eng.getHorsePower());

    }
}
