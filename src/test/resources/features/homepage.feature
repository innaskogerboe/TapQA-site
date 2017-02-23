Feature: Homepage

@C001 @smoke-test
Scenario: Homepage displays header "We test software"
	Given I am on "http://tapqa.com"
	Then I see the header
	    """
	    We test software
	    """

Scenario: tap STRATEGY Page
	Given I am on "http://tapqa.com"
    And I click on the Strategy for Scaling Development & Quality Link
	Then I navigated to tap STRATEGY Page
    And I search for the Header tap STATEGY
    Then I click the Tap Logo to navigate back to the homepage

		"""
        Helping our clients with understanding how their current business processes
        integrate with their IT processes, technology & organization structure.
		"""

  Scenario: tap AUTOMATION page
    Given I am on the "http://tapqa.com"
    And I click on the Continuous Integration, Performance & Automation Link
    Then I navigate to tap AUTOMATION Page
    And I search for the Header tap AUTOMATION
    Then I click on Tap Logo to navigate back to the homepage

      """
      We use technology to provide meaningful
      metrics & transparency into your software development.
      """


    Scenario: tap CONSULTING page
      Given I am on the "http://tapqa.com"
      And I click on the Continuous Integration, Performance & Automation Link
      Then I navigate to tap CONSULTING Page
      And I search for the Header tap CONSULTING
      Then I click on Tap Logo to navigate back to the homepage

      """
      Our tap|CONSULTING services are perfect for when you are facing a growing
      number of projects, rapid company growth, or adoption of new methodologies.
      """

     Scenario: tap LAKESHORE
       Given I am on the "http://tapqa.com"
       And I click on the Continuous Integration, Performance & Automation Link
       Then I navigate to tap LAKESHORE Page
       And I search for the Header tap LAKESHORE
       Then I click on Tap Logo to navigate back to the homepage

       """
       Your nearshore solution, even nearer than you thought.
       Coming to you from the land of 10,000 lakes,
       we have the drive and the know-how to get your job done right the first time.
       """

       Scenario: Facebook Footer
         Given I am on the "http://tapqa.com"
         And I click on the Facebook icon
         Then I navigate to Facebook
         And I search for the Header Facebook
         Then I click the back button

         """
         Sign Up. It's Free and Always will Be.
         """

        Scenario: Twitter Footer
          Given I am on the "http://tapqa.com"
          And I click on the Twitter icon
          Then I navigate to Twitter
          And I search for the Header Twitter
          Then I click the back button

          """
          Download the App. Get the Twitter app on your mobile phone. It's easy.
          Just text yourself a link to download.
          """

         Scenario: Youtube Footer
           Given I am on the "http://tapqa.com"
           And I click on the Youtube icon
           Then I navigate to Youtube
           And I search for the Header Youtube
           Then I click the back button

           """
           Youtube.
           """

          Scenario: Instagram Footer
            Given I am on the "http://tapqa.com"
            And I click on the Instagram icon
            Then I navigate to Instagram
            And I search for the Header Instagram
            Then I click the back button

            """
            Instagram. Sign up to see photos and videos from your friends.
            """

            Scenario: Linkedin Footer
              Given I am on the "http://tapqa.com"
              And I click on the Linkedin icon
              Then I navigate to Linkedin
              And I search for the Header Linkedin
              Then I click the back button

              """
              Be great at what you do. Get started - it's free.
              """