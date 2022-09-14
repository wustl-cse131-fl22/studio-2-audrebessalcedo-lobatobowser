package studio2;

public class Ruin {

	public static void main(String[] args) 
	{		
		int totalWins = 0, totalLosses = 0;
		for(int totalSimulations = 1; totalSimulations <=8; totalSimulations++)
		{
			int startAmount = 2, winLimit = 10, winAmount = 0, wins = 0, losses = 0;
			while(startAmount > 0 && (winAmount < winLimit))
			{
				double winChance = Math.random();
				if(winChance < 0.7)
				{
					startAmount++;
					wins++;
					winAmount++;
				}
				else
				{
					startAmount--;
					winAmount--;
					losses++;
				}	
				if(totalSimulations == 1)
				{
					double expectedRuinRate = (1-winChance)/winChance;
					System.out.println(expectedRuinRate);
				}
			}
			if(startAmount == 0)
			{
				System.out.println("Simulation " + totalSimulations + ": " + losses + " LOSE");
				totalLosses++;
			}
			else
			{
				System.out.println("Simulation " + totalSimulations + ": " + wins + " WIN");
				totalWins++;
			}
		}
		
		double ruinRate = (double)totalLosses/(totalLosses + totalWins);
		System.out.println(ruinRate);
		
		
	}

}
