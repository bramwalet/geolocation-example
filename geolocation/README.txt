OVERVIEW

I surveyed all the different approaches to integrating existing
Spring services with GWT and this is the best I found:

http://pgt.de/2009/07/17/non-invasive-gwt-and-spring-integration-reloaded/

This is a fully functional implementation using GWT 2 and Spring 3

run with "mvn gwt:run" or "ant hosted"
(I'm not sure if greeting.launch works)


STEPS I TOOK

To create this project i used the GWT webappCreator (shipped with GWT):

webAppCreator -out c:\temp\greeting=spring-gwt com.greeting.GreetingMain

Then I modified the project according to the article listed above.

--Sam Brodkin

