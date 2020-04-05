package petle;

public class Application {
//   public static void main(String[] args) {
//       for (int i = 0; i <= 100; i++) {
//           System.out.println(i);
//       }
//    }

    public static void main(String[] args) {
//        for (int j = 300; j <= 1000; j++) {
//           if (j % 3 == 0 && j%2 == 0) {
//              System.out.println(j);
//          }
//        }
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("nr: " + i + " lorem ipsum save file");
//        }
        String napis = "lorem ipsum save file";
        System.out.println(napis.length());
//        for (int i = 0; i < napis.length(); i = i + 2) {
//            System.out.print(napis.charAt(i));
//        }

        for (int i = napis.length() - 1; i>=0; i--) {   //pisze od końca
            System.out.print(napis.charAt(i));
        }
     }
}
