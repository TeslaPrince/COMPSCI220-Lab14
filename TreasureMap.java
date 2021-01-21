public class TreasureMap{
  private final Instruction[] steps;
  private final Instruction instruct;
  private static final int DEFAULT_PACES = 0;
  private static final Direction unkownDirect = Direction.UNKNOWN;
  private static final class Instruction{    
    private final int paces;
    private final Direction direction;
    public Instruction(){
    this(DEFAULT_PACES,unkownDirect);
    }
    public Instruction(int paces, Direction direction){
      this.paces = paces;
      this.direction = direction;
    }
    public int getPaces(){
      return paces;
    }
    public Direction getDirection(){
      return direction;
   }
    public String toString(){
      return String.format("%d paces to the %s", getPaces(), getDirection());
    }

  }
  public TreasureMap(int pace1, Direction d1, int paces2, Direction d2, int paces3, Direction d3, int paces4, Direction d4, int paces5, Direction d5){
    this(pace1, d1, paces2, d2, paces3, d3, paces4, d4,paces5, d5);
  }
  public TreasureMap(int paces1, Direction d1,  int paces2,  Direction d2, int paces3, Direction d3, int paces4, Direction d4){
    this(paces1, d1, paces2, d2, paces3, d3, paces4, d4);
  }
  public TreasureMap(int paces1, Direction d1,  int paces2,  Direction d2, int paces3, Direction d3){
    this(paces1, d1, paces2, d2, paces3, d3);
  }
  public TreasureMap(Direction d1, int pace1,  Direction d2, int pace2){
    this(paces1, d1, paces2, d2, paces3, d3);
  }
}//end of treasure map 