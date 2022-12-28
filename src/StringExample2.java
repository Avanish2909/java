public class StringExample2 {
    public static void main(String[] args){
        String s1=new String("computer");

        //Use indexOf() function
        int i=s1.indexOf('m');
        System.out.println("index is "+i);
        String s2=new String("Computer");

        //Comparing string
        //Use equals() function of Comparing string
        if(s1.equals(s2))
            System.out.println("Strings are same");
        else
            System.out.println("Strings are not same");

        // Use equalsIgnoreCase() --> capital and small letter word Ignore but will be same character
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Strings are same");
        else
            System.out.println("Strings are not same");

        //Use compareTo() function
        int i1=s1.compareTo(s2);
        if(i==0)
            System.out.println("Strings are same");
        else if (i>0) {
            System.out.println("Opposite to dictionary order");
        }
        else System.out.println("Dictionary order");

        //Use of substring
/**     String s1=new String("Computer");     */
        String s3=s1.substring(4);
        System.out.println(s3);
    }
}
