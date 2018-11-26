package stepDefinition;

	import core.MethodLibrary;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import pages.Chocolates;

	public class ChocolateBarDistribution {
		Chocolates choco = new Chocolates();
		MethodLibrary ml = new MethodLibrary();
		
		@Given("^a basket contains \"(.*)\"$")
		public void a_basket_contains_totalChocolateBars(int totalChocolateBars) throws Throwable{
			choco.setTotalChocolateBars(totalChocolateBars);
		}
		
		@When("^as treat \"(.*)\" were given out$")
		public void treatChocolateBars_were_given_out_as_treats(String treatChocolateBars) throws Throwable{
			choco.setTreatChocolateBars(Integer.parseInt(treatChocolateBars)); 
		}
		
		@And("^friends ate \"(.*)\" from the basket$")
		public void friends_ate_friendsEatenChocolateBars_from_the_basket(int friendsEatenChocolateBars) throws Throwable{
			choco.setFriendsEatenChocolateBars(friendsEatenChocolateBars);
		}
		
		@And("^coworkers ate \"(.*)\" on the following day$")
		public void coworkers_ate_coworkersEatenChocolateBars_on_the_following_day(int coworkersEatenChocolateBars) throws Throwable{
			choco.setCoworkersEatenChocolateBars(coworkersEatenChocolateBars);
		}
		
		@Then("^remaining chocolates were kept in storage$")
		public void remaining_chocolates_were_kept_in_storage() throws Throwable{
			ml.calculateRemainingChocolates(choco);
		}
	}

