public class Main {
    public static void main(String[] args) {
        EnhancedPlayer expo = new EnhancedPlayer("Expo");
        System.out.println("initial health is " + expo.healthRemaining());

        EnhancedPlayer ryan = new EnhancedPlayer("Ryan",5000, "chainsaw");
        System.out.println("initial health is " + ryan.healthRemaining());
    }

    //big benefit of encapsulation is that you aren't affecting other code when you rename variables, you can't supersede
    //the class by assigning fields from the main method since they have private access modifier. Must access the class methods.

    //encapsulation principles: use limiting access modifiers, use setters/getters sparingly
}