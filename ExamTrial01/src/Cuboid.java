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

    System.out.println("The surface of the cuboid: " + getSurface(new Numbers(1,2,3)));
    System.out.println("The volume of the cuboid: " + getVolume(new Numbers(1,2,3)));
  }
  public static int getSurface(Numbers nums){
    int surface = 2 * ((nums.length * nums.breadth) + (nums.breadth * nums.height) + (nums.height * nums.length));
    return surface;
  }
  public static int getVolume(Numbers nums){
    int volume = nums.length * nums.breadth * nums.height;
    return volume;
  }
}