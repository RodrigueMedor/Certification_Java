package start;

public class SwitchExample {

    public static void main(String[] args) {
         String[] strs = {"A", "B", "C", "D"};

         int iteration = 0;
         for(String str: strs){
             System.out.println("-------------------iteteration "+ (++iteration) + " , str ="+ str +" -------------- ");
             switch (str){
                 case "A":
                     System.out.println("Do A");
                 case "B":
                     System.out.println("Do B");
                 default:
                     System.out.println("DOING THIS!!!!!!!!!");
                 case "C":
                     System.out.println("Do C");
             }
         }
    }
}
