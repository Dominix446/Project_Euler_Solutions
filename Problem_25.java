public class Problem_25 {
  public static void main(String[] args) {
    double phi = (1 + Math.sqrt(5)) / 2.0;
    double logF = 0.0;
    int index = 1;//first 2 terms are equal
    while (logF <= 999) {
      logF += Math.log10(phi);//acutally there isa rounding error,but as the logfunction is forgiving,we get the correct ans easily
      index++;
    }
    System.out.println(index);
  }
}
