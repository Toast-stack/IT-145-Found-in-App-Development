public class Pet_class{
	public int dogSpaceNumber;
	private double dogWeight;
	private boolean grooming;
	
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Pet_class Dog = new Pet_class();}
		
public  Pet_class(){}

public Pet_class(int dogSpaceNumber,double dogWeight,boolean grooming){}
 public int setDogSpaceNumber(){return dogSpaceNumber;
    }
public double getDogWeight() 
{return dogWeight;}

public void setDogWeight(int w) 
{dogWeight = w;}

public boolean getGrooming() 
{return grooming;}

public void setGrooming(boolean grooming) 
{this.grooming = grooming;}
}
