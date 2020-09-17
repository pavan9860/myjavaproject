package projectqk;

import java.util.TreeMap;

public class qualityemp 
{
	
	static String a;
	
	qualityemp(){
		
		System.out.println("Name of Insurance person:  "+a);
	}
	
	qualityemp(String a)
	{
		qualityemp.a=a;
	}
	 
	void policy(int a,float b,double c)
	
	{
		try {
		double gg = (a*b*c)/20;
		
		System.out.println("Age:"+a+" Insurance Amount:"+b+" Maturity year:"+c);
		System.out.println("policy amount after maturity is :"+gg);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
	}
	
	void newpolicy(Integer s) 
	{
		TreeMap<Integer,String> policy = new TreeMap<Integer,String>();
		
	    policy.put(1,"Guaranted pension plan");
	    policy.put(2,"AADARSH plan");
	    policy.put(3,"Century Plus");
	    policy.put(4,"new ashiyana suraksha");
	   
	    if(s<3)
	    {
	    System.out.println("select policy for audults:"+policy.get(s));
	    }
	    else
	    {
	    	System.out.println("select policy for child:"+policy.get(s));
	    }
	           	
	}

	
	
	
	public static void main(String[] args) throws Exception 
	
	{
		
		
		new qualityemp("pavan");
		qualityemp f = new qualityemp();
		
		new insurancecmp("ghansham");
		f.policy(20,45000,40);
		f.newpolicy(2);
		f.
		
		 new calage(20);
	
		
		
	

	}	

}
