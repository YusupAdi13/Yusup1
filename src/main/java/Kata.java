public class Kata {

  public static boolean feast(String beast, String dish) {
    char beastStart = beast.charAt(0);
    char beastEnd = beast.charAt(beast.length() - 1);
    char dishStart = dish.charAt(0);
    char dishEnd = dish.charAt(dish.length() - 1);

    return beastStart == dishStart && beastEnd == dishEnd;
  }

  public static void main(String[] args) {
    String beast = "great blue heron";
    String dish = "garlic naan";
    boolean isAllowed = feast(beast, dish);
    System.out.println(isAllowed);
  }
}
