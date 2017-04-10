import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Create a function that takes a list as a parameter,
// and returns a new list with every second element from the orignal list
// example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
public class Seconds {
  public static void main(String[] args) {
    List<Integer> mylist = new ArrayList<Integer>();
    mylist.add(1);
    mylist.add(2);
    mylist.add(3);
    mylist.add(4);
    mylist.add(5);
    System.out.println(listChanger(mylist));

  }

  public static List<Integer> listChanger(List<Integer> list){
    List<Integer> readylist = new ArrayList<Integer>();

    for (int i = 0; i < list.size(); i++){
      if (list.indexOf(i) % 2 != 0 && list.indexOf(i) > 0) {
        readylist.add(i);
      }
    }
    return readylist;
  }
}