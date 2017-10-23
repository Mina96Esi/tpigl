package main;
import org.junit.*;
public class Test 
{
    public static void main(String args){
    	
	int tab[]={1000,200,700,711,102,103,252,251,253};
	VectorHelper.trier(tab);
	// on affiche les éléments du vecteur après les avoir trié 
	for(int i=0; i<tab.length; i++)
	{
		System.out.println(tab[i]);
	}

	
	int tab1[]={1,2,3};
	int tab2[]={5,6};
	int tabl[]=null;
	try{
		tabl=VectorHelper.sommer(tab1, tab2);
		for(int i=0; i<tabl.length; i++)
		{
			System.out.println(tabl[i]);
		}
	}
	catch(TaillesdiffException e){
		System.out.println("erreur! les tailles des deux vecteurs sont différentes");
	}
	tab1=VectorHelper.inverser(tab1);
	for(int i=0; i<tab1.length; i++)
	{
		System.out.println(tab1[i]);
	}
	VectorHelper.minmax(tab1);
	VectorHelper.mul10(tab1);
	for(int i=0; i<tab1.length; i++)
	{
		System.out.println(tab1[i]);
	}
    }
}

