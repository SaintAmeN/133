package pl.sda.j133.domowe;

public class MainABCheck {
    public static boolean ABCheck(String str){
        // 'a', '0', '0', '0', 'b' <-true
        //  1                   5
        //  5                   9
        //  n                   n+4

        //                        A               B
        //                        |               |
        // [ 'L' 'a' 'u' 'r' 'a' '_' 's' 'o' 'b' 's'  ]
        char[] tablicaZnakow = str.toCharArray();

        for (int i = 0; i < tablicaZnakow.length-4; i++) {
            char znakA = tablicaZnakow[i];
            char znakB = tablicaZnakow[i+4];

            if (znakA == 'a' && znakB == 'b'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String daneTestowe = "aaaaaaaaaa";
//        String daneTestowe = "after badly";
//        String daneTestowe = "Laura sobs";

        System.out.println(ABCheck(daneTestowe));
    }
}
