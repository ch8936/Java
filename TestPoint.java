class Point{
	double x ,y ,z;
	
	public Point(double a,double b,double c) {
        x = a; 
        y = b; 
        z = c;
    }
	
	public void setX(double a) {
    	x = a;
  	}
  	
    public void setY(double b) {
    	y = b;
    }
    
    public void setZ(double c) {
    	z = c;
    }
	
	double  getDistance(Point p) {
		return (x - p.x)*(x - p.x) +(y - p.y)*(y - p.y)+(z - p.z)*(z - p.z);
    }
}
public class TestPoint{
	public static void main(String[] args){
		Point p = new Point(1.0, 2.0, 3.0);
		Point p1 = new Point(0.0, 0.0, 0.0);
		System.out.println(p.getDistance(p1));
		
		p.setX(5.0);
		System.out.println(p.getDistance(new Point(1.0,1.0,1.0)));		
	}		
}
