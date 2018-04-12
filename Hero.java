/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hs_stat_tracker;

/**
 *
 * @author William
 */
public class Hero
{
    private int
                                totalLosses, totalWins,
            
                                totalDruidL, totalDruidW,
                                mageADruidL, mageADruidW, 
				mageDDruidL, mageDDruidW,
				
                                totalHunterL, totalHunterW,
				mageAHunterL, mageAHunterW,
				mageDHunterL, mageDHunterW,
				
                                totalMageL, totalMageW,
				mageAMageL, mageAMageW,
				mageDMageL, mageDMageW,
				
                                totalPaladinL, totalPaladinW,
				mageAPaladinL, mageAPaladinW,
				mageDPaladinL, mageDPaladinW,
				
                                totalPriestL, totalPriestW,
				mageAPriestL, mageAPriestW,
				mageDPriestL, mageDPriestW,
				
                                totalRogueL, totalRogueW,
				mageARogueL, mageARogueW,
				mageDRogueL, mageDRogueW,
				
                                totalShamanL, totalShamanW,
				mageAShamanL, mageAShamanW,
				mageDShamanL, mageDShamanW,
				
                                totalWarlockL, totalWarlockW,
				mageAWarlockL, mageAWarlockW,
				mageDWarlockL, mageDWarlockW,
				
                                totalWarriorL, totalWarriorW,
				mageAWarriorL, mageAWarriorW,
				mageDWarriorL, mageDWarriorW;
    
        private String druidResults;
        private String hunterResults;
        private String mageResults;
        
        private String paladinResults;
        private String priestResults;
        private String rogueResults;
        
        private String shamanResults;
        private String warlockResults;
        private String warriorResults;
        
        private String myResults;
        
        private String hero_name;
	
	public Hero(String hr_n)
	{
                totalLosses = 0; totalWins = 0;
            
                totalDruidL = 0; totalDruidW = 0;
		mageADruidL = 0; mageADruidW = 0; 
		mageDDruidL = 0; mageDDruidW = 0;
		
                totalHunterL = 0; totalHunterW = 0;
		mageAHunterL = 0; mageAHunterW = 0;
		mageDHunterL = 0; mageDHunterW = 0;
		
                totalMageL = 0; totalMageW = 0;
		mageAMageL = 0; mageAMageW = 0;
		mageDMageL = 0; mageDMageW = 0;
		
                totalPaladinL = 0; totalPaladinW = 0;
		mageAPaladinL = 0; mageAPaladinW = 0;
		mageDPaladinL = 0; mageDPaladinW = 0;
		
                totalPriestL = 0; totalPriestW = 0;
		mageAPriestL = 0; mageAPriestW = 0;
		mageDPriestL = 0; mageDPriestW = 0;
		
                totalRogueL = 0; totalRogueW = 0;
		mageARogueL = 0; mageARogueW = 0;
		mageDRogueL = 0; mageDRogueW = 0;
		
                totalShamanL = 0; totalShamanW = 0;
		mageAShamanL = 0; mageAShamanW = 0;
		mageDShamanL = 0; mageDShamanW = 0;
		
                totalWarlockL = 0; totalWarlockW = 0;
		mageAWarlockL = 0; mageAWarlockW = 0;
		mageDWarlockL = 0; mageDWarlockW = 0;
		
                totalWarriorL = 0; totalWarriorW = 0;
		mageAWarriorL = 0; mageAWarriorW = 0;
		mageDWarriorL = 0; mageDWarriorW = 0;
                
                druidResults = "";
                hunterResults = "";
                mageResults = "";
                
                paladinResults = "";
                priestResults = "";
                rogueResults = "";
                
                shamanResults = "";
                warlockResults = "";
                warriorResults = "";
                
                myResults = "";
                
                hero_name = hr_n;
	}
	
	public int getTotalLosses() { return totalLosses; }
        public int getTotalWins() { return totalWins; }
        
	public int getTotalDruidL() { return totalDruidL; }
        public int getTotalDruidW() { return totalDruidW; }
	public int getMageADruidL(){ return mageADruidL; }
	public int getMageADruidW(){ return mageADruidW; }
	public int getMageDDruidL(){ return mageDDruidL; }
	public int getMageDDruidW(){ return mageDDruidW; }
	
        public int getTotalHunterL() { return totalHunterL; }
        public int getTotalHunterW() { return totalHunterW; }
	public int getMageAHunterL(){ return mageAHunterL; }
	public int getMageAHunterW(){ return mageAHunterW; }
	public int getMageDHunterL(){ return mageDHunterL; }
	public int getMageDHunterW(){ return mageDHunterW; }
	
        public int getTotalMageL() { return totalMageL; }
        public int getTotalMageW() { return totalMageW; }
	public int getMageAMageL(){ return mageAMageL; }
	public int getMageAMageW(){ return mageAMageW; }
	public int getMageDMageL(){ return mageDMageL; }
	public int getMageDMageW(){ return mageDMageW; }
	
        public int getTotalPaladinL() { return totalPaladinL; }
        public int getTotalPaladinW() { return totalPaladinW; }
	public int getMageAPaladinL(){ return mageAPaladinL; }
	public int getMageAPaladinW(){ return mageAPaladinW; }
	public int getMageDPaladinL(){ return mageDPaladinL; }
	public int getMageDPaladinW(){ return mageDPaladinW; }
	
        public int getTotalPriestL() { return totalPriestL; }
        public int getTotalPriestW() { return totalPriestW; }
	public int getMageAPriestL(){ return mageAPriestL; }
	public int getMageAPriestW(){ return mageAPriestW; }
	public int getMageDPriestL(){ return mageDPriestL; }
	public int getMageDPriestW(){ return mageDPriestW; }
	
        public int getTotalRogueL() { return totalRogueL; }
        public int getTotalRogueW() { return totalRogueW; }
	public int getMageARogueL(){ return mageARogueL; }
	public int getMageARogueW(){ return mageARogueW; }
	public int getMageDRogueL(){ return mageDRogueL; }
	public int getMageDRogueW(){ return mageDRogueW; }
	
        public int getTotalShamanL() { return totalShamanL; }
        public int getTotalShamanW() { return totalShamanW; }
	public int getMageAShamanL(){ return mageAShamanL; }
	public int getMageAShamanW(){ return mageAShamanW; }
	public int getMageDShamanL(){ return mageDShamanL; }
	public int getMageDShamanW(){ return mageDShamanW; }
	
        public int getTotalWarlockL() { return totalWarlockL; }
        public int getTotalWarlockW() { return totalWarlockW; }
	public int getMageAWarlockL(){ return mageAWarlockL; }
	public int getMageAWarlockW(){ return mageAWarlockW; }
	public int getMageDWarlockL(){ return mageDWarlockL; }
	public int getMageDWarlockW(){ return mageDWarlockW; }
	
        public int getTotalWarriorL() { return totalWarriorL; }
        public int getTotalWarriorW() { return totalWarriorW; }
	public int getMageAWarriorL(){ return mageAWarriorL; }
	public int getMageAWarriorW(){ return mageAWarriorW; }
	public int getMageDWarriorL(){ return mageDWarriorL; }
	public int getMageDWarriorW(){ return mageDWarriorW; }
        
        public String getDruidResults(){ return druidResults; }
        public String getHunterResults(){ return hunterResults; }
        public String getMageResults(){ return mageResults; }
        public String getPaladinResults(){ return paladinResults; }
        public String getPriestResults(){ return priestResults; }
        public String getRogueResults(){ return rogueResults; }
        public String getShamanResults(){ return shamanResults; }
        public String getWarlockResults(){ return warlockResults; }
        public String getWarriorResults(){ return warriorResults; }
        
        public String getMyResults(){ return myResults; }
        
        public String getHeroName(){ return hero_name; }
        
        public void setAllGameResultsStrings()
        {
            druidResults = "T: ("+totalDruidW+','+totalDruidL+") C: ("+mageDDruidW+','+mageDDruidL+") !C: ("+mageADruidW+','+mageADruidL+')';
            hunterResults = "T: ("+totalHunterW+','+totalHunterL+") C: ("+mageDHunterW+','+mageDHunterL+") !C: ("+mageAHunterW+','+mageAHunterL+')';
            mageResults = "T: ("+totalMageW+','+totalMageL+") C: ("+mageDMageW+','+mageDMageL+") !C: ("+mageAMageW+','+mageAMageL+')';
            
            paladinResults = "T: ("+totalPaladinW+','+totalPaladinL+") C: ("+mageDPaladinW+','+mageDPaladinL+") !C: ("+mageAPaladinW+','+mageAPaladinL+')';
            priestResults = "T: ("+totalPriestW+','+totalPriestL+") C: ("+mageDPriestW+','+mageDPriestL+") !C: ("+mageAPriestW+','+mageAPriestL+')';
            rogueResults = "T: ("+totalRogueW+','+totalRogueL+") C: ("+mageDRogueW+','+mageDRogueL+") !C: ("+mageARogueW+','+mageARogueL+')';
            
            shamanResults = "T: ("+totalShamanW+','+totalShamanL+") C: ("+mageDShamanW+','+mageDShamanL+") !C: ("+mageAShamanW+','+mageAShamanL+')';
            warlockResults = "T: ("+totalWarlockW+','+totalWarlockL+") C: ("+mageDWarlockW+','+mageDWarlockL+") !C: ("+mageAWarlockW+','+mageAWarlockL+')';
            warriorResults = "T: ("+totalWarriorW+','+totalWarriorL+") C: ("+mageDWarriorW+','+mageDWarriorL+") !C: ("+mageAWarriorW+','+mageAWarriorL+')';
            
            myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
        }
        
        public void setCertainGameResultsString(String opponent)
        {
            switch(opponent)
            {
                case "Druid": druidResults = "T: ("+totalDruidW+','+totalDruidL+") C: ("+mageDDruidW+','+mageDDruidL+") !C: ("+mageADruidW+','+mageADruidL+")\n"; break;
                case "Hunter": hunterResults = "T: ("+totalHunterW+','+totalHunterL+") C: ("+mageDHunterW+','+mageDHunterL+") !C: ("+mageAHunterW+','+mageAHunterL+")\n"; break;
                case "Mage": mageResults = "T: ("+totalMageW+','+totalMageL+") C: ("+mageDMageW+','+mageDMageL+") !C: ("+mageAMageW+','+mageAMageL+')'; break;
                    
                case "Paladin": paladinResults = "T: ("+totalPaladinW+','+totalPaladinL+") C: ("+mageDPaladinW+','+mageDPaladinL+") !C: ("+mageAPaladinW+','+mageAPaladinL+')'; break;
                case "Priest": priestResults = "T: ("+totalPriestW+','+totalPriestL+") C: ("+mageDPriestW+','+mageDPriestL+") !C: ("+mageAPriestW+','+mageAPriestL+')'; break;
                case "Rogue": rogueResults = "T: ("+totalRogueW+','+totalRogueL+") C: ("+mageDRogueW+','+mageDRogueL+") !C: ("+mageARogueW+','+mageARogueL+')'; break;
                    
                case "Shaman": shamanResults = "T: ("+totalShamanW+','+totalShamanL+") C: ("+mageDShamanW+','+mageDShamanL+") !C: ("+mageAShamanW+','+mageAShamanL+')'; break;
                case "Warlock": warlockResults = "T: ("+totalWarlockW+','+totalWarlockL+") C: ("+mageDWarlockW+','+mageDWarlockL+") !C: ("+mageAWarlockW+','+mageAWarlockL+')'; break;
                case "Warrior": warriorResults = "T: ("+totalWarriorW+','+totalWarriorL+") C: ("+mageDWarriorW+','+mageDWarriorL+") !C: ("+mageAWarriorW+','+mageAWarriorL+')'; break;
                    
                default:
                    System.out.println("no heroes detected.");
            }
        }
	
	public void setGameResults(String opponent, boolean c, boolean w)
	{
		switch(opponent)
		{
			case "Druid":
				if(c == true && w == true)
				{
					mageDDruidW++;
					totalDruidW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDDruidL++;
					totalDruidL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageADruidW++;
					totalDruidW++;
                                        totalWins++;
				}
				else
				{
					mageADruidL++;
					totalDruidL++;
                                        totalLosses++;
				}
                                druidResults = "T: ("+totalDruidW+','+totalDruidL+") C: ("+mageDDruidW+','+mageDDruidL+") !C: ("+mageADruidW+','+mageADruidL+")\n";
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Hunter":
				if(c == true && w == true)
				{
					mageDHunterW++;
					totalHunterW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDHunterL++;
					totalHunterL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAHunterW++;
					totalHunterW++;
                                        totalWins++;
				}
				else
				{
					mageAHunterL++;
					totalHunterL++;
                                        totalLosses++;
				}
                                hunterResults = "T: ("+totalHunterW+','+totalHunterL+") C: ("+mageDHunterW+','+mageDHunterL+") !C: ("+mageAHunterW+','+mageAHunterL+")\n";
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Mage":
				if(c == true && w == true)
				{
					mageDMageW++;
					totalMageW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDMageL++;
					totalMageL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAMageW++;
					totalMageW++;
                                        totalWins++;
				}
				else
				{
					mageAMageL++;
					totalMageL++;
                                        totalLosses++;
				}
                                mageResults = "T: ("+totalMageW+','+totalMageL+") C: ("+mageDMageW+','+mageDMageL+") !C: ("+mageAMageW+','+mageAMageL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Paladin":
				if(c == true && w == true)
				{
					mageDPaladinW++;
					totalPaladinW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDPaladinL++;
					totalPaladinL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAPaladinW++;
					totalPaladinW++;
                                        totalWins++;
				}
				else
				{
					mageAPaladinL++;
					totalPaladinL++;
                                        totalLosses++;
				}
                                paladinResults = "T: ("+totalPaladinW+','+totalPaladinL+") C: ("+mageDPaladinW+','+mageDPaladinL+") !C: ("+mageAPaladinW+','+mageAPaladinL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
                                break;
			case "Priest":
				if(c == true && w == true)
				{
					mageDPriestW++;
					totalPriestW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDPriestL++;
					totalPriestL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAPriestW++;
					totalPriestW++;
                                        totalWins++;
				}
				else
				{
					mageAPriestL++;
					totalPriestL++;
                                        totalLosses++;
				}
                                priestResults = "T: ("+totalPriestW+','+totalPriestL+") C: ("+mageDPriestW+','+mageDPriestL+") !C: ("+mageAPriestW+','+mageAPriestL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Rogue":
				if(c == true && w == true)
				{
					mageDRogueW++;
					totalRogueW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDRogueL++;
					totalRogueL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageARogueW++;
					totalRogueW++;
                                        totalWins++;
				}
				else
				{
					mageARogueL++;
					totalRogueL++;
                                        totalLosses++;
				}
                                rogueResults = "T: ("+totalRogueW+','+totalRogueL+") C: ("+mageDRogueW+','+mageDRogueL+") !C: ("+mageARogueW+','+mageARogueL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Shaman":
				if(c == true && w == true)
				{
					mageDShamanW++;
					totalShamanW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDShamanL++;
					totalShamanL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAShamanW++;
					totalShamanW++;
                                        totalWins++;
				}
				else
				{
					mageAShamanL++;
					totalShamanL++;
                                        totalLosses++;
				}
                                shamanResults = "T: ("+totalShamanW+','+totalShamanL+") C: ("+mageDShamanW+','+mageDShamanL+") !C: ("+mageAShamanW+','+mageAShamanL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Warlock":
				if(c == true && w == true)
				{
					mageDWarlockW++;
					totalWarlockW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDWarlockL++;
					totalWarlockL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAWarlockW++;
					totalWarlockW++;
                                        totalWins++;
				}
				else
				{
					mageAWarlockL++;
					totalWarlockL++;
                                        totalLosses++;
				}
                                warlockResults = "T: ("+totalWarlockW+','+totalWarlockL+") C: ("+mageDWarlockW+','+mageDWarlockL+") !C: ("+mageAWarlockW+','+mageAWarlockL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			case "Warrior":
				if(c == true && w == true)
				{
					mageDWarriorW++;
					totalWarriorW++;
                                        totalWins++;
				}
				else if(c == true && w == false)
				{
					mageDWarriorL++;
					totalWarriorL++;
                                        totalLosses++;
				}
				else if(c == false && w == true)
				{
					mageAWarriorW++;
					totalWarriorW++;
                                        totalWins++;
				}
				else
				{
					mageAWarriorL++;
					totalWarriorL++;
                                        totalLosses++;
				}
                                warriorResults = "T: ("+totalWarriorW+','+totalWarriorL+") C: ("+mageDWarriorW+','+mageDWarriorL+") !C: ("+mageAWarriorW+','+mageAWarriorL+')';
                                myResults = '('+Integer.toString(totalWins)+','+Integer.toString(totalLosses)+')';
				break;
			default:
				System.out.println("no heroes detected.");
		}
	}
}
