import java.util.Scanner;
public class Purchase {
    private String name;
    private int groupCount; 
    private double groupPrice;
    private int numberBought;
    
    public void setName(String newName)
    {
        name = newName;
    }
    public void setPrice(int count, double costForCount)
    {
        if((count <= 0) || (costForCount <= 0))
        {
            System.out.print("Error: Bad parameter in set.Price.");
            System.exit(0);
        }
        else{
            groupCount = count;
            groupPrice = costForCount; 
        }
    }
    public void setNumberBought(int number)
    {
        if (number <=0)
        {
            System.out.println("Error: Bad parameter in setNumberBough");
            System.exit(0);
        }
        else
            numberBought=number;
    }
public void readInput()
{
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter name of the item you are purchasing: ");
    name=keyboard.nextLine();
    System.out.println("Enter price of item as two numbers.");
    System.out.println("For example, 3 for $2.99 is entered as");
    System.out.println("3 2.99");
    System.out.println("Enter price of item as two numbers, now: ");
    groupCount=keyboard.nextInt();
    groupPrice=keyboard.nextDouble();
    while ((groupCount <= 0) || (groupPrice <= 0))
{
System.out.println("Both Number must be positive. Try again.");
System.out.println("Enter price of item as two numbers.");
System.out.println("For example, 3 for $2.99 is entered as");
System.out.println("3 2.99");
System.out.println("Enter price of item as two numbers, now: ");
groupCount=keyboard.nextInt();
groupPrice=keyboard.nextDouble();
}
System.out.println("Enter number of items purchased:");
numberBought = keyboard.nextInt();
while (numberBought <= 0)
{
System.out.println("Number must be positive. Try again.");
System.out.println("Enter number of items purchased:");
numberBought = keyboard.nextInt();
}
keyboard.close();
}
public void writeOutput()
{
System.out.println(numberBought + " "+name);
System.out.println("at " + groupCount+ " for $"+ groupPrice);
}
public String getName()
{
return name;
}
public double getTotolCost()
{
return 
(groupPrice/groupCount)*numberBought;
}
public double getUnitCost()
{
return groupPrice/groupCount;
}
public int getNumberBought()
{
return numberBought;
}
}

