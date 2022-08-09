package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You stick your hand inside. It's weirdly more spacious than you expected.");
                System.out.println("As you grope around, your hand closes around a weirdly hairy something.");
                System.out.println("You try to withdraw it from the mailbox, but as you're pulling it towards yourself, the something pulls back.");
                System.out.println("Its strength is much mightier than yours.");
                System.out.println("You get eaten by a grue.");
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You go to the entrance of the house -- it is boarded up, however, the wooden planks look old and mushy.");
            System.out.println("There might be a possible back entrance, but you can't see it from here.");
            System.out.println("Do you try to pry open the door or go round the house?");
            action = userInput.nextLine();

            if(action.equals("pry open the door")) {
                System.out.println("You wiggle your fingers under the planks and pull towards yourself. They don't budge.");
                System.out.println("Do you try again?");
                action = userInput.nextLine();

                if (action.equals("yes")) {
                    System.out.println("You really put your back into it and use your whole weight trying to pull the planks out.");
                    System.out.println("You tug and tug and tug and-- they come detached and you fall on your ass. Ouch.");
                    System.out.println("Do you enter the house?");
                    action = userInput.nextLine();

                    if(action.equals("yes")){
                        System.out.println("You enter the house through the front door. It is dark and shadowy.");
                        System.out.println("As you take one more step, the wooden floor creak.");
                        System.out.println("Creak... CRACK!");
                        System.out.println("The wood breaks under your feet and you plummet to the basement, landing on your neck and instantly dying.");
                        System.out.println("Maybe you shouldn't wander into abandoned buildings with unknown structural integrity. There was a reason it was boarded up.");
                        System.out.println("Better luck next time.");
                    } else if (action.equals("no")){
                        System.out.println("Then... then why did you put in that whole effort into prying the entrance open?");
                        System.out.println("You're so embarrassed by the feeling of some invisible entity witnessing your useless decision, ");
                        System.out.println("that your conscious brain cannot withstand the pressure and you instantly drop into a coma.");
                        System.out.println("Let's hope someone passes by and calls an ambulance before you die.");
                    }
                } else if (action.equals("no")){
                    System.out.println("Your weak arms are no match for the might of wood and nails and you give up.");
                    System.out.println("The disappointment kind of ruins the whole trip.");
                    System.out.println("Maybe you should go home after all.");
                    System.out.println("You give up and go home.");

                }
            } else if (action.equals("go round")){
                System.out.println("You go around the house to the back and stop at the backdoor.");
                System.out.println("You notice that some other adventurer has done your job for you and the doors are wide open.");
                System.out.println("His corpse is lying just inside the entrance.");
                System.out.println("You call the cops. Every time you close your eyes, you see his washed out face and blank eyes.");
                System.out.println("You think you have had enough adventure for the next 10 years and you go home.");
                System.out.println("At least you're not that guy.");
            }
        }
    }
}
