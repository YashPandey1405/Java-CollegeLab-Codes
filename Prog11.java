import java.io.*;
import java.util.Scanner;

public class Prog12{
    String input;
    Prog12(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your desired string");
        String input = reader.nextLine();
    }
    
    Prog12(String input){
        this.input = input;
    }

    int count(){
        int token = 1;
        for(int i = 0; i < input.length();i++){
            if(input.charAt(i)==' '){
                token++;
            }
        }
        return token;
    }

    String[] tokenize(){
        String tokens[] = new String[count()];
        int prev = 0, k = 0;
        for(int i = 0; i < input.length();i++){
            if(input.charAt(i)==' '){
                tokens[k++] = input.substring(prev,i);
                prev = i+1;
            }
        }
        tokens[k] = input.substring(prev,input.length());
        return tokens;
    }

    public static void main(String[] args) {       
        Prog12 t1 = new Prog12("Hello WOrld tis is but a string");
        System.out.println(t1.count());
        String tokens[] = t1.tokenize();
        for(int i = 0; i < tokens.length;i++){
            System.out.println(tokens[i]);
        }
    }
}