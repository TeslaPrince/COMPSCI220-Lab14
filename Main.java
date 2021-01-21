class Main {
  public static void main(String[] args) {
    TreasureMap tm1 = new TreasureMap(5, NORTH, 19 , WEST);
    TreasureMap tm2 = new TreasureMap(30, SOUTH, 25, NORTH, 15,EAST);
    TreasureMap tm3 = new TreasureMap(38, WEST, 17, SOUTH, 38, NORTH, 5, EAST);
    TreasureMap tm4 = new TreasureMap(22, EAST, 61, NORTH, 99, WEST, 11, SOUTH, 44, NORTH);
    System.out.println("Treasure map one is: "+tm1.toString);
    System.out.println("treasure map two is: "+tm2.toString);
    System.out.println("treasure map 3 is: " +tm3.toString);
    Sytem.out.println("Treasure Map 4 is: " +tm4.toString);
  }
}