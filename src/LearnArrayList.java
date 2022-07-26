import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();//    List<Integer> list = new LinkedList<>(); if we add LinkedList it would work fine bease we jave linkedlist in >list and >queue aswell.
        list.add(1);
        list.add(121);
        list.add(122);
        list.add(123);
        System.out.println(list);


        List <Integer> newList = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(1);
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(121));
        System.out.println(list);
        /*list.clear();
        System.out.println(list);*/
        list.set(4, 12020);
      /*  System.out.println(list);*/

        // list.set(5, 12020);//show error to add we use .add() method

        list.contains(1);
        System.out.println(list);


        for(int i=0; i< list.size(); i++){
            System.out.println("for loop" + list.get(i));
        }
        System.out.println("  ");

        //or

        for (Integer element: list) {
           // list.remove(2);//shows erroe because on runtime dynamically we do nit remove data in for loops that is why we need itrator
            System.out.println("forEach loop"+ element);
        }

        System.out.println("  ");
        ////


        Iterator<Integer> itlist = list.iterator();

           while (itlist.hasNext()) {
           /*int element = itlist.next();
           if(element == list)*/
               /*          itlist.remove();*/
               System.out.println("iterator" + itlist.next());
           }


            System.out.println("--------itrator 2md time---------");


            itlist = list.iterator();// itrator move itself at the end to move the list again we have to define it again as just we define here

            while (itlist.hasNext()){
           /*int element = itlist.next();
           if(element == list)*/
                /*          itlist.remove();*/
                System.out.println("iterator" + itlist.next());


                System.out.println("-------listitrator---------");

                ListIterator<Integer> listit = list.listIterator();

                while (listit.hasNext()) {
           /*int element = itlist.next();
           if(element == list)*/
                    /*          itlist.remove();*/
                    System.out.println("listIterator" + listit.next());
                }

                System.out.println("-------listitrator end to beginning---------");//move backword by using listitrator

                while (listit.hasPrevious()){
                    System.out.println("listIterator"+ listit.previous() );
                }
        }
    }
}