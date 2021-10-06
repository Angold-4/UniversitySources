
public class TestStudentName {
  public static void main(String[] args) {

      StudentName Ryan = new StudentName("Tai-Man Ryan Chan");
      System.out.println(Ryan);
      String sn = Ryan.findShortName();
      System.out.println("Short Name: " + sn);

      String cn = Ryan.findChineseName();
      System.out.println("Chinese Name: " + cn);


      StudentName Sophia = new StudentName("Yi-Ning Sophia Leung");
      System.out.println(Sophia);

      String sns = Sophia.findShortName();
      System.out.println("Short Name: " + sns);

      String cns = Sophia.findChineseName();
      System.out.println("Chinese Name: " + cns);
      

  }
}

/* output:
 Full Name: Tai-Man Ryan Chan
 Short Name: TR Chan
 Chinese Name:  Chan Tai Man

 Full Name: Yi-Ning Sophia Leung
 Short Name: YS Leung
 Chinese Name:  Leung Yi Ning
*/
