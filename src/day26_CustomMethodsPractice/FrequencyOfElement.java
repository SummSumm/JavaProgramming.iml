package day26_CustomMethodsPractice;
public class FrequencyOfElement {

    public static void main(String[] args) {
        int [] array = {1,1,1,2,03,302,010,051,5,5,6,1};
        System.out.println(frequencyOfElement(array, 1));

    }




    // returns frequency of given element in given array
    public static int frequencyOfElement (int [] array, int num) {

        int count = 0;
        for (int i : array) {
            if (i==num) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement (char [] array, char num) {

        int count = 0;
        for (char i : array) {
            if (i==num) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement (String [] array, String num) {

        int count = 0;
        for (String i : array) {
            if (i.equals(num)) {
                count++;
            }
        }
        return count;
    }
}





