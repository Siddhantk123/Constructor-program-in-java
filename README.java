# Constructor-program-in-java
import java.util.Scanner;//java library for user input
class Box{
	double w; double h; double d;
	double volume(){
		return (w*h*d);
	}
	void SetDim(double width,double height,double depth){
		w=width;
		h=height;
		d=depth;
	}
}
class BoxDemo{
	public static void main(String args[]){
		Box mybox =  new Box();
		double vol;
		Scanner ob=new  Scanner(System.in);//Second method for user input
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=ob.nextInt();
		mybox.SetDim(a,b,c);
		vol=mybox.volume();
		System.out.println("Volume is : "+vol);
	}
}



//Parameterized Constructors

import java.util.Scanner;//Second method for user input
class Box{
	double w; double h; double d;
	Box(double width,double height,double depth){
		w=width;h=height;d=depth;
	}
	double volume(){
		return (w*h*d);
	}
}
class BoxDemo{
	public static void main(String args[]){
		Scanner ob=new  Scanner(System.in);
		System.out.println("Enter Width : ");
		int a=ob.nextInt();
		System.out.println("Enter Height : ");
		int b=ob.nextInt();
		System.out.println("Enter Depth : ");
		int c=ob.nextInt();
		Box mybox =  new Box(a,b,c);
		double vol;
		vol=mybox.volume();
		System.out.println("Volume is : "+vol);
	}
}
