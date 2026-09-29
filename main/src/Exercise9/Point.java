package Exercise9;

public class Point {
    int x;
    int y;
    Point(){
        x=0;
        y=0;
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x- p.getX(),2)+Math.pow(y-p.getY(),2));
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(x- this.getX(),2)+Math.pow(y-this.getY(),2));
    }

    public static void main(String[] args) {
        Point p1 = new Point(2,1);
        Point p2 = new Point(1,1);
        System.out.println(p1.distance());
        System.out.println(p1.distance(0,1));
        System.out.println(p1.distance(p2));
    }
}
