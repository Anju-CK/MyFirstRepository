public class Engine {
    private String Type;
    private int HorsePower;

    public Engine(String Type, int HorsePower){
        this.Type=Type;
        this.HorsePower=HorsePower;
    }
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(int horsePower) {
        HorsePower = horsePower;
    }
}
