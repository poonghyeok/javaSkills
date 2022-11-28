package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
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

//        pattern = "\\w\\W";
        // \\w 는 알파벳 혹은 숫자를 의미한다. Alphanumeric [0-9a-zA-Z] 와 동일
        // \\W 는 알파벳 혹은 숫자를 제외한..

//        System.out.println("1 ".matches(pattern));
        // whitespace 도 not alphanumeric 이기 때문에, true case
//        System.out.println("11".matches(pattern));
        // 1은 alphanumeric이기 때문에 false, \\W 에 해당하는 not Alphanumeric 이 왔어야 됨.


        //Quantifiers : 요소들을 얼마나 반복시킬지 정의한다.
        //*은 *앞의 요소가 0이상 반복되는 것
//        pattern = "a*[0-9]*";
//        System.out.println("aaa123".matches(pattern));
            //true : a는 0번이상(3번) 반복, 0에서 9사이 숫자가 3번 반복
//        System.out.println("aaa".matches(pattern));
            //true : a 가 0 번이상 반복, 0-9의 숫자가 0번 반복

        // + 는 * 과 다르게 앞의 요소가 1번 이상 반복되는 것을 의미
//        pattern = "a*[0-9]+";//a가 0번이상 반복되고 0-9의 숫자가 1번 이상 반복되어야 함을 의미한다.
//        System.out.println("aaa123".matches(pattern));
            //true : a가 0번 이상 반복, 0-9의 숫자가 1번 이상 반복됨.
//        System.out.println("aaa".matches(pattern));
            //false : 0-9의 숫자가 1번 이상 반보되지 않았으므로 false

        // ? 는 요소가 0 또는 1회만  반복되는 것을 의미한다
//        pattern = "a*[0-9]?";
//        System.out.println("aaa123".matches(pattern));
            //flase 0-9의 숫자가 0또는 1회만 반복 되어야하는데 그렇지 못함.
//        System.out.println("aaa12".matches(pattern));
            //false : 1회 반복이라고 해서 2개가 1회 반복이 아니다.
//        System.out.println("aaa1".matches(pattern));
            //true : 1회 반복
//        pattern = "a*[0-9]{0,1}"; //[0-9]?는 [0-9]{0,1}과 같은 의미를 갖는다.
//        System.out.println("aaa123".matches(pattern));
            //false : 123, 3번이 반복되었으므로 false
//        System.out.println("aaa1".matches(pattern));
            //true : 0-9의 숫자가 1번만 반복되었으므로 true

        //Grouping : 패턴에 그룹을 지정할 수 있다. ()로 그룹을 지 정, $1 처럼 $다음에 그룹의 번호를 입력, 패턴에서 가장 왼쪽 그룹이 1번으로 시작
//            pattern = "(\\w)(\\s+)([\\w])";
//        System.out.println("Hello   World".replaceAll(pattern, "-"));
                // \w\s[\w]는 뭐지, o    W가 -로 변경되어 출력됨.
//        pattern =  "(\\w)(\\s+)([\\w])";
//        System.out.println("Hello    world".replaceAll(pattern, "$1-$3"));
            //pattern에 일치하는 내용을 그룹1과 - 그룹3에 해당하는 내용으로 변환이 된다.

//        pattern = "a*[0-9]*";
//        System.out.println("aaa123".matches(pattern));
            //true : *는 0회 이상 반복이므로 안나와도 되고 여러번 나와도 됨.

//        pattern = "\\s";
//        String[] arr = "Hello World JAVA REGEX".split("pattern");
//        System.out.println(Arrays.asList(arr));

//        pattern = "Hello";
//        System.out.println("Hello World Hello World".replaceFirst(pattern,"REGEX"));

        /*Pattern pattern1 = Pattern.compile("\\bcat\\b");
        Matcher matcher = pattern1.matcher("act cat cat cattie cat");//matcher method에게 검사할 String을 전달함.
        int count = 0;
        while(matcher.find()){//Pattern 객체의 matcher method로 생성된 Matcher 객체의 method의 활용 find() 로  찾은 값이 있는지 없는지
            count++;
            System.out.println("Match Number : " + count);
            System.out.println("group() : " + matcher.group()); //regex에 해당하는 group 즉, find해내 값이 무엇인지 return하는 group() method
            System.out.println("start() : " + matcher.start()); //regex에 해당하는 group의 start index,
            System.out.println("end() : " + matcher.end()); //regex에 해당하는 group의 end index,
        }*/

//        Pattern pattern1 = Pattern.compile("\\d{3}-\\d{5}");
//        // \d는 0-9 사이의 숫자 {3}은 횟수 literal hypen, 0-9사이의 숫자 {5} 5번
//        Matcher matcher = pattern1.matcher("123-45678");
//        System.out.println(matcher.find());

//        Pattern pattern1 = Pattern.compile("\\b(\\w+)\\s+\\1\\b\\s+\\1\\b"); //경계 grouping alphanumeric 1개 이상, whilte space 1개이상 \\1은 뭐지 \\b는 경계
        // \\1은 grouping index의 1을 의미한다. 0도 아니고 이건 1로 한다. \\1은 (\\w+)를 의미한다. 단순하게 regex를 의미하는 것이 아니라 (\\w+)에 해당하는 String을 의미한다. 이게 정말로 한번 더 나오는 것인지 확인하는 pattern이 되겠다.
        // 단어의 중복을 검사할 수 있는 pattern 이다.
//        Matcher matcher = pattern1.matcher("world  world  world");
//        System.out.println(matcher.find());
//        System.out.println(matcher.group());

//        Pattern p =  Pattern.compile("dog");
//        Matcher m = p.matcher("The dog says meow. All dogs say meow~!");
//        System.out.println(m.replaceAll("cat"));

//        System.out.println("The cat sat on the mat.".replaceAll("at[.]", "*"));
//        System.out.println("The cat sat on the mat.".replaceAll("at[.]"));

//        System.out.println("The cat sat on the mat.".replaceAll("at[.]?", "*"));
            //?는 있을 수도 있고 없을 수도 있다를 의미하기 때문에 cat sat mat. 가 전부 *로 치환됨

//        System.out.println("The cat  sat on the mat.".replaceAll("[a-z]+", "*"));
        // a-z 까지의 문자가 1번 반복되는 것을 표현하는 regex는 전부 * 로 치환한다. a-z에 해당하지 않는 T와 .은 regex에 match 되지 않아서 치환되지 않았다.

//        System.out.println("The cat sat on the mat.".replaceAll("c.+t", "*"));
        //.은 무엇을 의미하는가 . 은 어떤 문자 한개를 의미한다. .+ 가 된다면 아무 문자 1개 이상을 의미힌다.

//        System.out.println("The cat sat on the mat.".replaceAll("c.+?t", "*"));
        // +와 ?가 같이 쓰여서 둘 중 작은 범위에 ?로 계산되어졌다. .?는 가운데 문자가 올 수도 있고 없을 수도 있다는 의미, 해당하는 건 cat 뿐

        // ==== 출처 :  https://codechacha.com/ko/java-regex/ ==== 3회독 필요//

    }

}
