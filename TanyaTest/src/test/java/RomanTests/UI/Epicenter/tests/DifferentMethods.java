package RomanTests.UI.Epicenter.tests;

import TanyaTestFoxtrot.pageObjects.TestInit;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class DifferentMethods extends TestInit {

    @Test
    // PALINDROM
    public void palindrom() {
        String palin = "sosmmsos";
        System.out.println(isPalindrom(palin));
    }

    public boolean isPalindrom(String palin) {
        int n = palin.length();
        for (int i = 0; i < n; i++) {
            if (palin.charAt(i) != palin.charAt(n - i - 1))
                return false;
        }
        return true;
    }
//
//    //переназначення (override) метода
//    public class Animal {
//        public void speak() {
//            System.out.println("Animal make various sounds.");
//        }
//    }
//
//    public class Dog extends Animal {
//        @Override
//        public void speak() {
//            System.out.println("Woof!");
//        }
//    }
//
//    public class Cat extends Animal {
//        @Override
//        public void speak() {
//            System.out.println("Meow!");
//        }
//    }
//
//    public class Main {
//        public void main(String[] args) {
//            Animal dog = new Dog();
//            Animal cat = new Cat();
//            dog.speak(); // Output: "Woof!"
//            cat.speak(); // Output: "Meow!"
//        }
//    }
//
//
////    @Test
////    public void StringBuilder () {
////        String term = "Hello World";
////        StringBuilder sb = new StringBuilder(term);
////        System.out.println(sb.reverse().toString()); // Output: "dlroW olleH"
////    }
//
//    // string reverse
//    @Test
//    public void stringReverse() {
//
//        // Using a for loop and a temporary variable to swap the values:
//        public void loop () {
//            String term = "Hello World";
//            char[] termArray = term.toCharArray();
//            for (int i = 0; i < termArray.length / 2; i++) {
//                char temp = termArray[i];
//                termArray[i] = termArray[termArray.length - 1 - i];
//                termArray[termArray.length - 1 - i] = temp;
//            }
//            System.out.println(new String(termArray)); // Output: "dlroW olleH"
//
//        }
//
//        //Using the StringBuilder class and the reverse() method:
//        public void StringBuilder () {
//            String term = "Hello World";
//            StringBuilder sb = new StringBuilder(term);
//            System.out.println(sb.reverse().toString()); // Output: "dlroW olleH"
//        }
//
//        //Using recursion:
//        public static void reverseString (String term){
//            if (term.length() == 0) {
//                return;
//            }
//            System.out.print(term.charAt(term.length() - 1));
//            reverseString(term.substring(0, term.length() - 1));
//        }
//
//        public static void main (String[]args){
//            String term = "Hello World";
//            reverseString(term); // Output: "dlroW olleH"
//        }
//
//        //Using the stack data structure:
//        public void stackDataStructure () {
//            String term = "Hello World";
//            Stack<Character> stack = new Stack<Character>();
//            for (int i = 0; i < term.length(); i++) {
//                stack.push(term.charAt(i));
//            }
//            while (!stack.isEmpty()) {
//                System.out.print(stack.pop());
//            } // Output: "dlroW olleH"
//        }
//
//        //Using the reverseOrder() method of the Comparator interface:
//        public void methodOfTheComparatorInterface(){
//            String[] words = {"Hello", "World"};
//            Arrays.sort(words, Collections.reverseOrder());
//            System.out.println(Arrays.toString(words)); // Output: "[World, Hello]"
//
//        }
//    }

}


