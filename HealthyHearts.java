/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
       Scanner inputReader = new Scanner(System.in);
       
       int age;
       int bpm;
       
        System.out.print("What is your age? ");
        age = inputReader.nextInt();
        
        System.out.println("Your maximum heart rate should be " + (220 - age)+" beats per minute.");
        bpm = 220 - age;
        System.out.println("Your target HR Zone is " + bpm *.5 +" - "+ bpm *.85 +" beats per minute.");
        
       
    }
    
}
