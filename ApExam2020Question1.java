import java.util.ArrayList;


public class ApExam2020Question1
{
   public static void main(String[] args)
   {
      OnlinePurchaseManager opm = new OnlinePurchaseManager();
      // Part A
      System.out.println(opm.countElectronicsByMaker("ABC"));
      System.out.println(opm.countElectronicsByMaker("lmnop"));
      System.out.println(opm.countElectronicsByMaker("XYZ"));
      System.out.println(opm.countElectronicsByMaker("QRP"));

      // Part B
      System.out.println(opm.hasAdjacentEqualPair());
   }
}