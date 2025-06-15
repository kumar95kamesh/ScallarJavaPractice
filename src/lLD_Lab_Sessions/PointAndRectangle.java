package lLD_Lab_Sessions;

public class PointAndRectangle {

	 	Point topLeft;
	    int height;
	    int width;

	    Point getBottomRight(){
	        Point p = new Point();//Point class is created.
	        p.x = topLeft.x + width;
	        p.y = topLeft.y - height;
	        return p;
	    }

	    int getArea(){
	        return height * width;
	    }

	    int getPerimeter(){
	        return 2 * (height + width);
	    }
	    
	    public static void main(String[] args) {
	    	PointAndRectangle par=new PointAndRectangle();
	    	par.height=10;
	    	par.width=15;
	    	Point sd = par.getBottomRight();
	    	System.out.println(sd);
		}

}
