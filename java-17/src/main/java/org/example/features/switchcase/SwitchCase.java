package org.example.features.switchcase;

public class SwitchCase {
    public static void main(String[] args) {
        String playerName = "Rahul";
        //Get the team name for the Player
        runSwitch(playerName);
    }


//    private static void runSwitch(String playerName) {
//        //Here we are using old switch case which was borrowed from C syntax
//        //It is not a very concise syntax
//        switch (playerName){
//            case "Rahul":
//            case "Pant":
//            case "Virat":
//                System.out.println("RCB");
//                break;
//            case "Sachin":
//            case "Rohit":
//            case "Pandya":
//                System.out.println("MI");
//                break;
//            default:
//                System.out.println("I don't know this player.");
//        }

        private static void runSwitch(String playerName) {
            //Here we are using old switch case which was borrowed from C syntax
            //It is not a very concise syntax
            switch (playerName) {
                case "Rahul", "Pant", "Virat" -> System.out.println("RCB");
                case "Sachin", "Rohit", "Pandya" -> System.out.println("MI");
                default -> System.out.println("I don't know this player.");
            }
    }

}
