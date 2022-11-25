package regex;

import java.util.regex.Pattern;

public class RegexStudy {

    public static void main(String[] args){
        String pattern = "^[0-9]*$";
        String str = "123321";

        boolean result = Pattern.matches(pattern, str);
//        System.out.println(result);

        pattern = "ab.";
//        System.out.println("ab".matches(pattern));
            //false : . 은 문자 한개를 의미하기 때문에, ab와 함께 공백이든 문자든
//        System.out.println("abc".matches(pattern));
            //true

        pattern = "ab\\s\\S";
//        System.out.println("ab  ".matches(pattern));
        //false : \\s  는 whitespace 를 의미하고 \\S 는 not white space를 의마하므로 false가 출력된다.
//        System.out.println("ab c".matches(pattern));
        // \\S에 매칭되는 c가 나타났기 때문에, true가 return 된다.

        //^는 문자열의 시작점을 찾는다.
        String sentence = "";
//        System.out.println("The cat sat on the mat.".replaceAll("[Tt]he", "*"));
            //The the 를 replace하라고 했으니 둘 다 * 로 replace 된다.
//        System.out.println("The cat sat on the mat.".replaceAll("^[Tt]he", "*"));
            //regex의 ^ 으로 문자열의 시작을 명시했으므로 문자열 시작에 있는 The만을 *로 replace, 두번째 the는 문자열의 시작 ^ 조건을 만족하지 못하므로 replace 되지 않는다.

        //$는 문자열의 종료점을 찾는다.
//        System.out.println("The cat sat on the mat. and the cat".replaceAll("cat", "*"));
//        System.out.println("The cat sat on the mat. and the cat".replaceAll("cat$", "*"));
        //cat인데 $를 추가함으로써 문자열 종료에 있는 cat만을 replace 시키니다.

        pattern = "[abc][vz]";
//        System.out.println("av".matches(pattern));
            //true : abc 중에 하나 vz 중에 하나를 regex와 match 되는지 test 했으므로 true가 return 된다.
//        System.out.println("ac".matches(pattern));
            //false : c는 vz 중에 하나가 아니라서 false가 return 된다.

        pattern = "Ex_[a-g1-5]";
        //Ex_와 a-g 또는 1-5 중에 하나가 와야한다는 의미
//        System.out.println("Ex_g".matches(pattern));
            //true
//        System.out.println("Ex_6".matches(pattern));

        pattern = "\\d\\D";
        // \\d 는 0-9 사이의 숫자 \\D 는 0-9를 제외한 문자 [^0-9] 와 동일하다.
        pattern = "\\d\\D";
//        System.out.println("1a".matches(pattern));
            //true
//        System.out.println("a1".matches(pattern));
            //false

        pattern = "\\d\\s\\D";
//        System.out.println("1 a".matches(pattern));
            //true

//        System.out.println("1 1a".matches(pattern));
            //false

        pattern = "\\w\\W";
        // \\w 는 알파벳 혹은 숫자를 의미한다. Alphanumeric [0-9a-zA-Z] 와 동일
        // \\W 는 알파벳 혹은 숫자를 제외한..

//        System.out.println("1 ".matches(pattern));
        // whitespace 도 not alphanumeric 이기 때문에, true case
        System.out.println("11".matches(pattern));
        // 1은 alphanumeric이기 때문에 false, \\W 에 해당하는 not Alphanumeric 이 왔어야 됨.





    }

}
