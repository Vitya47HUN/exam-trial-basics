import java.util.*;

public class PirateCounter {

  static class Pirate {
    String name;
    boolean hasWoodenLeg;
    int gold;

    @Override
    public String toString() {
      return "Pirate{" +
              "name='" + name + '\'' +
              ", hasWoodenLeg=" + hasWoodenLeg +
              ", gold=" + gold +
              '}';
    }
    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }
  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    for (int k = 0;k < 2;k++){
      System.out.println(listSorter(pirates).get(k).name);
    }
  }
  public static ArrayList<Pirate> listSorter(List<Pirate> list) {
    ArrayList<Pirate> sortedList = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).hasWoodenLeg == true && list.get(i).gold > 15) {
        sortedList.add(list.get(i));
      }
    }
    return sortedList;
  }
}