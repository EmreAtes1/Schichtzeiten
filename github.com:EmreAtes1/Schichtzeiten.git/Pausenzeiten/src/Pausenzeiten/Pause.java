package Pausenzeiten;

import java.util.Comparator;

public class Pause implements Comparator<Pause>
{
	 int AnfangPause;
	 int EndePause;		 
		 
		  public Pause(int pAnfangsPause, int pEndePause)
		  
		  {
		  this.AnfangPause = pAnfangsPause;
		  this.EndePause = pEndePause;
		  }
		  
		  
		  public int getAnfangPause() 
		  {
		  return this.AnfangPause;
		  }
		 
		  public String toString() {
		  return this.AnfangPause + " (" + this.AnfangPause + ")";
		  }


		@Override
		public int compare(Pause o1, Pause o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		  
		 

	/*	  @Override
		  public int compareTo(Pause o)
		  {
			 return this.AnfangPause.compareTo(o.getAnfangPause());
		  }*/

}
