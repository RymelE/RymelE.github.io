
public class Playing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int hp = 1;
int level = 0; 

while (level <= 10)
    {
		if (level > 0)
        	{hp = hp * level;}
        System.out.println(level + "|" + hp);
        level++;
        
    }
System.out.println(hp);
	
	}

}
