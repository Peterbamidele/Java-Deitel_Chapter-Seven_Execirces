public class Array_example {
    public static void main(String[] args){
        String[] semicolon = {"cohort1", "cohort2", "cohort3", "cohort14", "cohort5", "cohort6"};
         System.out.println(semicolon[4]);
         // result will cohort5

        String[] vehicle = {"Airplane", "Car", "Boat", "Ship", "helicopter", "bicycles", "Lorry"};
        vehicle[5] = "Shipshape";
        System.out.println(vehicle[0]);


        int[] children = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
         System.out.println(children[4-(1*3)]);
         System.out.println(children[4-(1*6)]);


    }
}
