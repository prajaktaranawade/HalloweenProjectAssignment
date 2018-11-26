package core;

import org.junit.Assert;

import pages.Chocolates;

public class MethodLibrary {

	public void calculateRemainingChocolates(Chocolates choco){
		int remainingChocolates=0;
		int total=0; 
		int treatchocolates=0;
		int friendsEatenChocolates=0;
		int coworkerEatenChocolates=0;
		
		total = choco.getTotalChocolateBars();
		treatchocolates = choco.getTreatChocolateBars();
		friendsEatenChocolates = choco.getFriendsEatenChocolateBars();
		coworkerEatenChocolates = choco.getCoworkersEatenChocolateBars();
		
		//Check if totalChocolates, treatChocolates, friendsEatenChocolates, cooworkersEatenChocolates is a positive number
		if(total<0){
			Assert.fail("Total chocolate bars cannot be less than zero, please provide total greater than zero");
		}else{
			Assert.assertTrue("Total chocolate bars : "+total, true);
		}
		
		if(treatchocolates<0){
			Assert.fail("Chocolate bars given as treats, cannot be less than zero, please provide treat chocolates >= zero");
		}else{
			Assert.assertTrue("Treat chocolate bars : "+treatchocolates, true);
		}
		
		if(friendsEatenChocolates<0){
			Assert.fail("Chocolate bars eaten by friends, cannot be less than zero, please provide chocolates count >= zero");
		}else{
			Assert.assertTrue("Friends' eaten chocolate bars : "+friendsEatenChocolates, true);
		}
		
		if(coworkerEatenChocolates<0){
			Assert.fail("Chocolate bars given to cooworkers, cannot be less than zero, please provide chocolates count >= zero");
		}else{
			Assert.assertTrue("Coworkers' eaten chocolate bars : "+coworkerEatenChocolates, true);
		}
		//Check border test for each type of chocolate - treatChocolates, friendsEatenChocolates, coworkerEatenChocolatess
		if(total == treatchocolates){
			if((friendsEatenChocolates == 0) && (coworkerEatenChocolates == 0)){
				Assert.assertTrue("Treat chocolates count is equal to TotalChocolate Count, friendsEaten chocolate count = 0, cooworkerEatenChocolates count = 0", true);
			}else{
				Assert.fail("Since total chocolates = "+total+", and treatChocolates are = "+treatchocolates+", friendsEatenChocolates and CoworkerEatenChocolates should be 0" );
			}
		}
		
		if(total == friendsEatenChocolates){
			if((treatchocolates == 0) && (coworkerEatenChocolates == 0)){
				Assert.assertTrue("FriendsEatenChocolates count is equal to TotalChocolate Count, treatchocolates count = 0, cooworkerEatenChocolates count = 0", true);
			}else{
				Assert.fail("Since total chocolates = "+total+", and friendsEatenChocolates are = "+friendsEatenChocolates+", treatChocolates and CoworkerEatenChocolates should be 0" );
			}
		}
		
		if(total == coworkerEatenChocolates){
			if((friendsEatenChocolates == 0) && (treatchocolates == 0)){
				Assert.assertTrue("CoworkerEatenChocolates count is equal to TotalChocolate Count, friendsEaten chocolate count = 0, treatChocolates count = 0", true);
			}else{
				Assert.fail("Since total chocolates = "+total+", and coworkerEatenChocolates are = "+coworkerEatenChocolates+", friendsEatenChocolates and treatchocolates should be 0" );
			}
		}
		
		//Calculate remaining chocolates bars
		remainingChocolates = total - (treatchocolates + friendsEatenChocolates + coworkerEatenChocolates);
		
		Assert.assertTrue("Remaining chocolate bars = "+remainingChocolates, true);
		System.out.println("Remaining chocolates ="+remainingChocolates);
	}	
}
