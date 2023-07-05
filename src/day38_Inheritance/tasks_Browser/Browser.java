package day38_Inheritance.tasks_Browser;

public class Browser {
    public void openBrowser(){
        System.out.println("Opening "+getClass().getSimpleName()+" browser.");
    }
    public void closeBrowser(){
        System.out.println("Closing "+getClass().getSimpleName()+" browser.");
    }
}
/*
day_38_optional_task-1:
Browser Task:
	1. Create a class named Browser:

			Methods:
				openBrowser(): prints "opening chrome browser"
				closeBrowser():  prints "closing chrome browser"

	2. Create the following sub classes of Browser and override the methods if needed:

			1. ChromeBrowser
					methods:
						openBrowser(): prints "opening chrome browser"
						closeBrowser():  prints "closing chrome browser"

			2. FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"

			3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"

			4. Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"

 */