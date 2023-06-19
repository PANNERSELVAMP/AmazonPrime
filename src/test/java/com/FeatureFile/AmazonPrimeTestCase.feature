Feature: We can able to watch the movies and Series and its Entertainment Application 

Scenario: Click the Signin Button 

	Given user launch the application by using URL 
	When user move the element in Account icon 
	And  user move the element in singin element 
	Then usr click the singin Button and its navigate to the Amazon Sign-in page 
	
Scenario: user login application by using Login Page module 

	When user Enter the user in Username Field 
	And user Enter the Passowrd in password Field 
	Then Click the SignIn Button and its Naviagate to the Home Page 
	
Scenario: User Enter The movie name in  movie Search Field 
	When     The User Can be Click the Search Icon Button 
	And     Then user enter the movie name in the search box text field 
	Then     User Select The Movie then It will be naviagte To The Movie page 
	
	
Scenario: Checking Movie Deatils 
	When      user click Deatails button then the Details page Will Be Show 
	And      For The Checking Purpose We Can get The Movie Starring cast name 
	Then   Then Click The Play Button the Video Will played 
	
	