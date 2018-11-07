/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author bacag
 */
public class HealthyHearts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("What is your age? ");
        age = sc.nextInt();
        int maxHR = 220 - age;
        double minTarget = Math.round(maxHR * 0.5);
        double maxTarget = Math.round(maxHR * .85);
        int mnTarget = (int)minTarget;
        int mxTarget = (int)maxTarget;
        
        System.out.println("Your maximum heart rate shoud be " + maxHR + " beats per minute.");
        System.out.println("Your target HR Zone is " + mnTarget + " - " + mxTarget + " beats per minute.");

    }
}
