package HomeWork;

public class Main {
    public static void main(String[] args) {
         Animal[] animal = {new Shark(), new Turtle(), new Eagle()};

        for (Animal i : animal) {
           if (i.getClass().getName().equals("HomeWork.Eagle")){
               ((Eagle)i).fly();
           }
           if (i instanceof Eagle){
               System.out.println("Class name 1");
           }
        }
        for (Animal i : animal) {
           if (i.getClass().getName().equals("HomeWork.Turtle")){
               ((Turtle)i).swim();
           }
           if (i instanceof Turtle){
               System.out.println("Class name 2");
           }
        }
        for (Animal i : animal) {
           if (i.getClass().getName().equals("HomeWork.Shark")){
               ((Shark)i).attack();
           }
           if (i instanceof Shark){
               System.out.println("Class name 3");
           }


        }
    }
}
