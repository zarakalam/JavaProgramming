package day14_StringClassCont;

public class Email_SubString {
    public static void main(String[] args) {

        //Substring method: continued examples---

        String email = "Cydeo.School@gmail.com";

        String email1 = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("email1 = " + email1);

        String email2 = "Cydeo.School@yahoo.com";
        String email3 = email2.substring(email2.indexOf("@")+1, email2.lastIndexOf("."));
        System.out.println("email3 = " + email3);

        //Universal code for email domain

        String uniEmail= "Cydeo.School@gmail.com";

        int beginningIndex = uniEmail.indexOf("@")+1;
        int endingIndex = uniEmail.lastIndexOf(".");
        String domain = uniEmail.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);








    }
}
