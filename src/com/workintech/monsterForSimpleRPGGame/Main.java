package com.workintech.monsterForSimpleRPGGame;

public class Main {
    public static void main(String[] args) {
        Monster troll=new Troll("Shrek",800,50);
        Monster wereWolf=new Werewolf("wolf",1000,70);
        System.out.println(troll.getName() +" vs " + wereWolf.getName());
        System.out.println("troll damage:" + troll.getDamage() + " vs wereWolf damage: " + wereWolf.getDamage() );
        System.out.println("Part 1 Troll attack:"+troll.attack());
        System.out.println("Part 2 wereWolf attack:" + wereWolf.attack());
        System.out.println("Results:"+ "Troll damage " + troll.attack() +" and" + " wereWolf damage " + wereWolf.attack() );
        System.out.println("wereWolf Win!!!!!!!!!!!!");

    }
}
