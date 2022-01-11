package day11_Switch_Scanner;

public class Browser {

    public static void main(String[] args) {

        String browserName = "Chrome";

        String result = "";

        boolean validBrowser = browserName == "Chrome" || browserName == "Firefox" || browserName == "Opera"
                                || browserName == "Safari" || browserName == "Edge";

        if(validBrowser){

            if(browserName == "Chrome"){
                result = "Chrome browser is selected";
            }else if(browserName == "FireFox"){
                result = "FireFox browser is selected";
            }else if(browserName == "Opera"){
                result = "Opera browser is selected";
            }else if(browserName == "Safari"){
                result = "Safari browser is selected";
            }else{
                result = "Edge browser is selected";
            }

        }else{
            result = "Invalid Browser name";
        }

        System.out.println(result);





            }
        }

