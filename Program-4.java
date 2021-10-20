import java.util.*;
class  ArrayList1
{
	public static void main(String[] args) 
	{
		int c,i,j;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(9);
		list.add(12);
		list.add(46);
		list.add(76);
		list.add(82);
		list.add(15);
		list.add(20);
		list.add(30);
        for(j=1;j<=9;j++)
		{
			c=0;
		for(i=0;i<list.size();i++)
		{
        if(list.get(i)%j==0)
			c++;
		}
		map.put(j,c);
		}
		System.out.println(map);

	}
}

		
