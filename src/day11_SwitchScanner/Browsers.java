package day11_SwitchScanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "firefox";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" ;


        if(validBrowser){

            if(browserName == "chrome"){
                result = "Chrome Browser is Selected";
            }else if(browserName == "firefox"){
                result = "FireFox Browser is Selected";
            }else if(browserName == "opera"){
                result = "Opera Browser is Selected";
            }else if(browserName == "safari"){
                result = "Safari Browser is Selected";
            }else{
                result = "Edge Browser is Selected";
            }

        }else{
            result = "Invalid Browser Name";
        }

        System.out.println(result);
    }
}
/*
Warmup Tasks:
	1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if

	2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */
