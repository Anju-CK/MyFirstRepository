public class Car {
   private String name;
   private Engine eng;
   public Car(String name,Engine eng){
       this.name=name;
       this.eng=eng;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }
}
