package Pausenzeiten;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class PausenzeitenMain 
{
	public static void main(String[] args)

	{
		Instant lEndzeitPunkt;
		
		ArrayList<Shift> ShiftList = new ArrayList<Shift>();
		ShiftList.add(new Shift(1510316160,1510359300));
		ShiftList.add(new Shift(1510257060,1510272480));
		ShiftList.add(new Shift(1510148280,1510189560));
		ShiftList.add(new Shift(1509976680,1510018020));
		ShiftList.add(new Shift(1509888000,1509926640));
		ShiftList.add(new Shift(1509802920,1509841260));
		ShiftList.add(new Shift(1509713160,1509752160));
		ShiftList.add(new Shift(1509630840,1509669300));
		ShiftList.add(new Shift(1509547260,1509581280));

		ArrayList<Pause> PauseList = new ArrayList<Pause>();
		PauseList.add(new Pause(1510418630,1510419629));
		PauseList.add(new Pause(1510412896,1510415398));
		PauseList.add(new Pause(1510410051,1510411438));
		PauseList.add(new Pause(1510354381,1510358719));
		PauseList.add(new Pause(1510350491,1510352659));
		PauseList.add(new Pause(1510346986,1510349158));
		PauseList.add(new Pause(1510337494,1510339978));
		PauseList.add(new Pause(1510326737,1510335325));
		PauseList.add(new Pause(1510320235,1510321406));
		PauseList.add(new Pause(1510263095,1510265555));
		PauseList.add(new Pause(1510259455,1510261355));
		PauseList.add(new Pause(1510186903,1510188153));
		PauseList.add(new Pause(1510180232,1510182753));
		PauseList.add(new Pause(1510178795,1510180023));
		PauseList.add(new Pause(1510169857,1510172582));
		PauseList.add(new Pause(1510158474,1510169642));
		PauseList.add(new Pause(1510149926,1510151824));
		PauseList.add(new Pause(1510002637,1510003655));
		PauseList.add(new Pause(1509997967,1510000895));
		PauseList.add(new Pause(1509984661,1509986605));
		PauseList.add(new Pause(1509924277,1509925653));
		PauseList.add(new Pause(1509922174,1509923313));
		PauseList.add(new Pause(1509912653,1509914787));
		PauseList.add(new Pause(1509904008,1509905642));
		PauseList.add(new Pause(1509892471,1509894400));
		PauseList.add(new Pause(1509888154,1509889926));
		PauseList.add(new Pause(1509821041,1509825299));
		PauseList.add(new Pause(1509807408,1509820499));
		PauseList.add(new Pause(1509744859,1509745961));
		PauseList.add(new Pause(1509724327,1509742034));
		PauseList.add(new Pause(1509716791,1509718224));
		PauseList.add(new Pause(1509664264,1509668261));
		PauseList.add(new Pause(1509656722,1509659068));
		PauseList.add(new Pause(1509643535,1509653617));
		PauseList.add(new Pause(1509637753,1509639007));
		PauseList.add(new Pause(1509634758,1509636385));
		PauseList.add(new Pause(1509579124,1509581079));
		PauseList.add(new Pause(1509574634,1509576159));
		PauseList.add(new Pause(1509569881,1509571628));
		PauseList.add(new Pause(1509557614,1509565058));
		PauseList.add(new Pause(1509553394,1509554692));
		PauseList.add(new Pause(1509548184,1509551869));
		PauseList.add(new Pause(1509493880,1509495125));
		
		
		Collections.sort(PauseList);
		
		for (Pause a : PauseList) {
			  System.out.println(a);
		}
		
	/*	Instant lStartzeitPunkt = Instant.now();
		ShiftList.add(new Shift(1510316160,1510359300));
		lEndzeitPunkt = Instant.now();
		System.out.println(String.valueOf(Duration.between(lStartzeitPunkt, lEndzeitPunkt)));*/
		
		

	/*	try 
		{
			Map mMap = new HashMap();
	
			mMap.put("Schichtzeiten", ShiftList);
			mMap.put("Pausenzeiten", PauseList);
			Iterator lIterator = mMap.entrySet().iterator();
			
			while(lIterator.hasNext())
			{
				Map.Entry mEntry = (Map.Entry) lIterator.next();
				System.out.println(mEntry.getKey() + ":" + mEntry.getValue());
			}
			
			System.out.println("Alle Schichten  :" + mMap.get("Schichtzeiten") + "Alle Pausen:" + mMap.get("Pausezeiten"));
			
			
		}
		catch (Exception e)
		{
			System.out.println("Gib einen Wert ein");
		}
	/*	Iterator it = ShiftList.iterator();
		
		while (it.hasNext()) 
		System.out.println(((Shift)it.next()));
		*/
		}

	}


