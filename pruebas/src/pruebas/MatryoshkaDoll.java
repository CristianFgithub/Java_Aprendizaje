package pruebas;
public class MatryoshkaDoll
{
    public static void main(String[] args)
    {
        System.out.println(new MatryoshkaDoll(new MatryoshkaDoll()).getNumberOfSmallerDolls());
    }
    
    private MatryoshkaDoll containedDoll;
    
    public MatryoshkaDoll() { 
    	
    }

    public MatryoshkaDoll(MatryoshkaDoll containedDoll)
    {
        this.containedDoll = containedDoll;
    }

    public MatryoshkaDoll getContainedDoll() {
		return containedDoll;
	}

	public void setContainedDoll(MatryoshkaDoll containedDoll) {
		this.containedDoll = containedDoll;
	}

	public int getNumberOfSmallerDolls()
    {
    	
        return 1;
    }

    
}