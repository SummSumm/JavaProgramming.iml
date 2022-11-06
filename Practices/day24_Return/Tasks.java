package day24_Return;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        System.out.println((frequencyofWord("java java java java python", "java")));
        System.out.println("-----------------------------------------------");

        System.out.println(isAnagram("abcd", "dcba"));
        System.out.println("-----------------------------------------------");

        System.out.println(reverse("1234"));
        System.out.println("-----------------------------------------------");

        String a = "davad";
        String b = reverse(a);
        if (b.equalsIgnoreCase(a)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        System.out.println("-----------------------------------------------");

        System.out.println(FrequencyinArray(new int[]{2, 2, 2, 3, 1}, 2));
        System.out.println("-----------------------------------------------");

        System.out.println(Arrays.toString(intArray(new int[]{1, 2, 3}, 4)));
        System.out.println("-----------------------------------------------");

        System.out.println(Arrays.toString(mergedIntArray(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println("-----------------------------------------------");

        System.out.println(Arrays.toString(reverseArray(new int[]{10, 20, 30})));
        System.out.println("-----------------------------------------------");

        System.out.println(contains(new int [] {10,20,30}, 200));
        System.out.println("-----------------------------------------------");

        System.out.println(Arrays.toString(removeNo(new int [] {10,20,30}, 2)));
    }


    public static int frequencyofWord(String sent, String wordd) {

        int count = 0;

        for (int i = 0; i <= sent.length() - 4; i++) {
            String word = sent.substring(i, i + 4); // 4lü 4lü ayırıp onların içinde var mı diye bakıyoruz
            if (word.contains(wordd)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String word1, String word2) {


        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean same = Arrays.equals(ch1, ch2);
        return same;
    }

    public static String reverse(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char each = word.charAt(i);
            reversed += each;
        }
        return reversed;
    }

    public static int FrequencyinArray(int[] arr, int num) {
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

    public static int[] intArray(int[] arr, int num) {
        int[] newArray = new int[arr.length + 1];

        int i = 0;
        for (int each : arr) {
            newArray[i++] = each;
        }
        newArray[i] = num;
        return newArray;
    }

    public static int[] mergedIntArray(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each1 : arr1) {
            merged[i++] = each1;
        }
        for (int each2 : arr2) {
            merged[i++] = each2;
        }
        return merged;
    }

    public static int[] reverseArray(int[] arr) {
        int[] newarray = new int[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int each = arr[i];
            newarray[j++] += each;
        }
        return newarray;
    }

    public static boolean contains(int[] arr, int num) {
        boolean result = false;
        for (int i : arr) {
            if (i == num) {
                result = true;
            }

        }
        return result;
    }

    public static int [] removeNo(int[] array, int index) {
        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1];

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    }





/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3


    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true


	3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


	4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true



    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5


    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}


	7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}


	8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}


	9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false


	10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */