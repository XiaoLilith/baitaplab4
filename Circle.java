package BaiTapLab3.BaiTapLab4;

public class Circle {
    public static void main (String[]args){
    public Double radius;
    public String color;
    public Double arean;
    }
}
public  Circle(Double radius, String color, Double arean){
this.radius=radius;
this.color= color;
this.arean= arean;
    }

public Double getRadius(){
    return radius;
}
public Double setRadius(Double radius){
   return  this.radius=radius;
}
public String getColor(){
return color;
}
public String setColor(String color){
return this.color=color;
}
public Double getArean(){
    return arean;
}
public Double setArean(Double arean){
    return this.arean=arean;

}

public String toString(){
    return radius+","+ color+", "+ arean; 
}
}
