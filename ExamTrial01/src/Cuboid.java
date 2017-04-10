// Create a class that represents a cuboid:
// It should take its three dimensions as constructor parameters (numbers)
// It should have a method called `getSurface` that returns the cuboid's surface
// It should have a method called `getVolume` that returns the cuboid's volume

public class Cuboid {

  static class Numbers {
    int length;
    int height;
    int breadth;


    Numbers(int length, int height, int breadth) {
      this.length = length;
      this.height = height;
      this.breadth = breadth;
    }
  }
  public static void main(String[] args) {

    System.out.println(getSurface(Numbers));
  }

  public static int getSurface(int l, int h, int b){
    int surface = 2 * ((l * b) + (b * h) + (h * l));
    return surface;
  }
}