import java.util.Scanner;
public class rockPaperScissors {
  public static void main (String[] args) {
      // scissors > paper || paper > rock || rock > scissor
      Scanner inp = new Scanner(System.in);
      double cpuChoice = Math.random();
      String paper = "ورقه";
      String rock = "حجر";
      String scissors = "مقص";
      String cpuCho = "حجر";
      System.out.println("اختر ورقه او مقص او حجر");
      String userChoice = inp.next();
      while (!paper.equals("ورقه") && !rock.equals("حجر") && !scissors.equals("مقص")) {
          System.out.println("الرجاء ادخال الكلمه بالشكل الصحيح");
          System.out.println("اختر ورقه او مقص او حجر");
          userChoice = inp.next();
      }
      if (cpuChoice >= 0.33)
          cpuCho = rock;
      else if (cpuChoice >= 0.34)
          cpuCho = paper;
      else if (cpuChoice >= 67 )
      cpuCho = scissors;
          if (userChoice.equals(cpuCho)) {
              System.out.println("تعادل للعب مره اخر اكتب ن للتوقف اكتب لا");
              String again = inp.next();
              if (again.equals("ن")) {
                        System.out.println("اختر ورقه او مقص او حجر");
      while (!paper.equals("ورقه") && !rock.equals("حجر") && !scissors.equals("مقص")) {
          System.out.println("الرجاء ادخال الكلمه بالشكل الصحيح");
          System.out.println("اختر ورقه او مقص او حجر");
          userChoice = inp.next();
      }
          }
            //  if (again.equals("لا")) {
                //  break;
             // }
             
      }
          else if (userChoice.equals(rock)) {
              if (cpuCho.equals(paper))
                  System.out.println("الكمبيوتر اختار ورقه وفاز");
              else if (cpuCho.equals(scissors))
                  System.out.println("تهانينا لقد ربحت، الكمبيوتر اختار مقص");
          }
          else if (userChoice.equals(paper)) {
              if (cpuCho.equals(scissors))
                  System.out.println("الكمبيوتر اختار مقص وفاز");
              else if (cpuCho.equals(rock))
                  System.out.println("تهانينا لقد ربحت، الكمبيوتر اختار حجر");
          }
          else if (userChoice.equals(scissors)) {
              if (cpuCho.equals(rock))
                  System.out.println("الكمبيوتر اختار حجر وفاز");
              else if (cpuCho.equals(paper))
                  System.out.println("تهانينا لقد ربحت، الكمبيوتر اختار ورقه");
          }
  }  
}
