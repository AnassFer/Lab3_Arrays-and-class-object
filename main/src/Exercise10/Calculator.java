package Exercise10;

public class Calculator {
    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet){
        this.floor = new Floor(floor.length, floor.width);
        this.carpet = new Carpet(carpet.getCost());
    }

    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
