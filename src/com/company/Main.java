package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                String[][] directory = {{"Brad Pitt", "412-890-8920"},
                        {"Jennifer Anniston", "321-893-8921"},
                        {"Bruce Willis", "789-231-3291"},
                        {"Mark Twain", "921-329-5628"}};
                System.out.println("Enter customer's name: ");
                String customerName = s.nextLine();
                String customerPhone = searchName(customerName, directory);
                System.out.println("The customer's number is: " + customerPhone);
            }
            public static String searchName(String customerName, String directory[][]){
                for (int i=0;i<4;i++){
                    if(customerName.equals(directory[i][0])){
                        System.out.println("Number: " + directory[i][1]);
                        return directory[i][1];
                    }
                }
                return "";
            }
        }
