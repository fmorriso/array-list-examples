public class ApExam2020Question1
{
   public static void main(String[] args)
   {
      System.out.format("Java version: %s%n", getJavaVersion());

      OnlinePurchaseManager opm = new OnlinePurchaseManager();
      // Part A
      System.out.println(opm.countElectronicsByMaker("ABC"));
      System.out.println(opm.countElectronicsByMaker("lmnop"));
      System.out.println(opm.countElectronicsByMaker("XYZ"));
      System.out.println(opm.countElectronicsByMaker("QRP"));

      // Part B
      System.out.println(opm.hasAdjacentEqualPair());
   }

   /** get the java version that is running the current program
    * @return string containing the java version running the current program
    */
   private static String getJavaVersion()
   {
      Runtime.Version runTimeVersion = Runtime.version();
      return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
   }
}