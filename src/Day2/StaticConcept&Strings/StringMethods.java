import java.util.Locale;

public class StringMethods {
    static String CompanyName = "CODOID Innovation Private Limited";

    public static void main(String[] args) {

        System.out.println("\nThe 13th index Character Present is : "+CompanyName.charAt(13));


        System.out.println("\n The Decimal value of the [Space] is : "+CompanyName.codePointAt(6));

//        System.out.println("\n The next value of the space in the String is :" +CompanyName.codePointBefore(6));

        System.out.println("\n The in-between available char count of 0-10 is : "+CompanyName.codePointCount(0,10));

        System.out.println("\n Replace of the given input from previous one  : "+CompanyName.replaceAll("Private", "Pvt"));

        System.out.println("\n Replacing the given character in the previous string : "+CompanyName.replace('I', 'i'));

        System.out.println("\n The Total Length of the give string is : "+CompanyName.length());

        String empty = "";

        System.out.println("\n The Verify The String is Empty or not : "+empty.isEmpty());

        System.out.println("\n Enter the name from the given index: " +CompanyName.substring(7));

        System.out.println("\n Enter the name from the given index range: " +CompanyName.substring(0, 7));

        System.out.println("\n To check the give String is equals to the name :" +CompanyName.equals("CODoID Innovation Private Limited"));

        System.out.println("\n To check the give String is equals but the case sensitive is not a problem in to the name :" +CompanyName.equalsIgnoreCase("CodoiD Innovation Private Limited"));

        System.out.println("\n To Check the given character contain there : "+ CompanyName.contains("ODOI"));

        System.out.println("\n To Check the given contents is present there :"+ CompanyName.contentEquals("ODOI"));

        System.out.println("\n Merge the given text in to Company name : "+ CompanyName.concat(" Company"));

        System.out.println("\n User want to compare and remaining char count :"+CompanyName.compareToIgnoreCase("CODoiD"));

        System.out.println("\n user want to compare the char count with case sensitive : "+CompanyName.compareTo("CODOID Innovation"));

        char [] str1 = {'C','O','D','O','I','D',' ','P','v','t','L','t','d',',', '.','.'};
        String str2 = "";
        System.out.println("\n user want to print individual char as a group : " +str2.copyValueOf(str1));

        System.out.println("\n user want to pick the char and want to form a group : " +str2.copyValueOf(str1, 0, 7));

        System.out.println("\n user want to check the Company name Starts with :" +CompanyName.startsWith("cOD"));

        System.out.println("\n user want to check the Company name ends with :" +CompanyName.endsWith("ted"));

        int val1= 5;
        double val2= 55.2;
        float val3= 5.2651f;
        long val4= 9823236451284l;
        boolean val5= false;
        char val = 'h';

        System.out.println("\n To change the int to String : "+String.valueOf(val1));

        System.out.println("\n To change the char to String : "+String.valueOf(val));

        System.out.println("\n To change the long to String : "+String.valueOf(val4));

        System.out.println("\n To change the double to String : "+String.valueOf(val2));

        System.out.println("\n To change the boolean to String : "+String.valueOf(val5));

        System.out.println("\n To change the float to String : "+String.valueOf(val3));

        String company1="   ABC Pvt Ltd         ";
        System.out.println("\n user want to trim the company name without any space in starting and ending :" +company1.trim());

        System.out.println("\n user want to print the company name fully uppercase : "+CompanyName.toUpperCase());

        System.out.println("\n user want to print the company name fully lowercase : "+CompanyName.toLowerCase());

        System.out.println("\n user want to include something : " +CompanyName.join("-", "DOB","19","03","1996"));

        System.out.println("\n user want to check the index of given text: "+CompanyName.indexOf('P'));

        System.out.println("\n To check the what is the next index of given character from the given index :" +CompanyName.indexOf('O', 3));

        System.out.println("\n To check the what is the next index of given String from the given index :" +CompanyName.indexOf("va", 10));

        System.out.println("\n  user want to check the index of given String: "+CompanyName.indexOf("Pri"));

        System.out.println("\n user want to check the before last index before given String: "+CompanyName.lastIndexOf("ted"));

        System.out.println("\n user want to check the before last index given char: "+CompanyName.lastIndexOf('e'));

        System.out.println("\n user want to check the before last index before given String: "+CompanyName.lastIndexOf("va", 10));

        System.out.println("\n user want to check the before last index given char: "+CompanyName.lastIndexOf('e',2));

        String [] arrcmp = CompanyName.split(" ");

        for(String CompanyName : arrcmp){
            System.out.print("\n "+CompanyName);
        }

    }
}

