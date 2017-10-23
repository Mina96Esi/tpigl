package main;

public class VectorHelper {
	                                            
	/* les m�thodes de la classe VectorHelper*/
	/* la m�thode trier qui trie les �l�ments d'un vecteur,on utilise le principe du tri � bulles */
	 public static int[] trier(int tableau [])
	{
	int longueur=tableau.length;
	int sauv;
	boolean permut ;
	do {
		permut=false; // au d�but on suppose que le tableau est tri� 
		for (int i=0;i<longueur-1;i++)
		{
			if (tableau[i]>tableau[i+1]) //on permute
			{
				sauv=tableau[i];
				tableau[i]=tableau[i+1];
				tableau[i+1]=sauv;
				permut=true;
			}
		}
		
	}while(permut);
	return tableau;
	
	}
	 /* la m�thode sommer qui somme deux vecteeurs et g�n�re une exception si les longueurs des deux vecteurs sont diff�rentes*/
	 public static int[] sommer(int tableau1[],int tableau2[]) throws TaillesdiffException
	 {		 
		 int longueur1=tableau1.length;
		 int longueur2=tableau2.length;
		 if (longueur1!=longueur2){
			 throw new TaillesdiffException();
		 }
		 else //tailles �gales 
		 {
			 
			 for (int i=0;i<longueur1;i++)
			 {
				 tableau1[i]=tableau1[i]+tableau2[i];
			 }
			 return tableau1;
		 }	 
		 
	 }	
	 /* la m�thode qui inverse les �l�ments d'un vecteur */
	
	public static int [] inverser(int tableau[])
	 {
		 
		 int l=tableau.length;
		 int tab[] = new int[l];
		 for (int i=0;i<l;i++)
		 {
			 tab[i]=tableau[l-i-1];
		 }
		 return tab;
		 
	 }
	public static int[] minmax(int tableau[]){
		int resultat[]={0,0};
		/* calcul du min */
		int min=tableau[0];
		for (int i=1;i<tableau.length;i++)
		{
			if(tableau[i]<min)
			{
				min =tableau[i];
			}
		}
		resultat[0]=min;
		//System.out.println("le minimum est : "+min);
		/* calcul du max */
		int max=tableau[0];
		for (int i=1;i<tableau.length;i++)
		{
			if(tableau[i]>max)
			{
				max=tableau[i];
			}
		}
		resultat[1]=max;
		//System.out.println("le maximum est : "+max);
		return resultat;
	}
	/* appliquer une formule sous forme d'une fonction */ 
	public static int[] mul10(int tableau[])
	{
		for (int i=0;i<tableau.length;i++)
		{
			tableau[i]*=10;
		}
		return tableau;
		
	}

}
