package erchashu;

import java.util.ArrayList;
import java.util.List;


public class erChaShu {
	public static void main(String[] args){
	List<Hero> a=new ArrayList<Hero>();
	for(int i=0;i<10000;i++){
		Hero b=new Hero("Hero-"+(int)(Math.random()*100));
		a.add(b);
	}
	int count=0;
	long start=System.currentTimeMillis();
    for(Hero c:a){
    	if(c.name.equals("Hero-55")){
    		long end=System.currentTimeMillis();
    		count++;
    	System.out.println("zhaodaole"+c.name+"  time:"+(end-start));
    }
	
}
    System.out.println("geshu"+count);
	}}
	
