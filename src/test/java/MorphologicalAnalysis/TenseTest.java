package MorphologicalAnalysis;

public class TenseTest {
    public static void main(String[] args) {
        MorphologicalParse parse, parse1, parse2, parse3, parse4, parse5, parse6, parse7, parse8, parse9, parse10
                ,parse11, parse12, parse13, parse14, parse15, parse16, parse17, parse18, parse19, parse20;
        parse = new MorphologicalParse("git+VERB+POS+PAST+A2PL");
        parse1 = new MorphologicalParse("git+VERB+POS+PAST+PAST+A3SG");
        parse2 = new MorphologicalParse("git+VERB+POS+FUT+PAST+A3SG");
        parse3 = new MorphologicalParse("git+VERB+POS+NARR+A3SG");
        parse4 = new MorphologicalParse("git+VERB+POS+NARR+PAST+A2SG");
        parse5 = new MorphologicalParse("git+VERB+POS+PROG1+PAST+A3SG");
        parse6 = new MorphologicalParse("git+VERB+POS+AOR+PAST+A3SG");
        parse13 = new MorphologicalParse("git+VERB+POS+AOR+NARR+A3SG");
        parse14 = new MorphologicalParse("git+VERB^DB+VERB+ABLE+NEG+PROG1+NARR+A3SG");
        parse15 = new MorphologicalParse("gel+VERB^DB+VERB+ABLE+NEG+FUT+NARR+A3SG");
        parse16 = new MorphologicalParse("al+VERB+POS+PROG1+A3PL+PAST");

        System.out.println("gittiniz");
        System.out.println(parse.getUniversalDependencyFeatures(parse.getUniversalDependencyPos()));
        System.out.println("gittiydi");
        System.out.println(parse1.getUniversalDependencyFeatures(parse1.getUniversalDependencyPos()));
        System.out.println("gidecekti");
        System.out.println(parse2.getUniversalDependencyFeatures(parse2.getUniversalDependencyPos()));
        System.out.println("gitmiş");
        System.out.println(parse3.getUniversalDependencyFeatures(parse3.getUniversalDependencyPos()));
        System.out.println("gitmiştin");
        System.out.println(parse4.getUniversalDependencyFeatures(parse4.getUniversalDependencyPos()));
        System.out.println("gidiyordu");
        System.out.println(parse5.getUniversalDependencyFeatures(parse5.getUniversalDependencyPos()));
        System.out.println("giderdi");
        System.out.println(parse6.getUniversalDependencyFeatures(parse6.getUniversalDependencyPos()));
        System.out.println("gidermiş");
        System.out.println(parse13.getUniversalDependencyFeatures(parse13.getUniversalDependencyPos()));
        System.out.println("gidemiyormuş");
        System.out.println(parse14.getUniversalDependencyFeatures(parse14.getUniversalDependencyPos()));
        System.out.println("gelemeyecekmiş");
        System.out.println(parse15.getUniversalDependencyFeatures(parse15.getUniversalDependencyPos()));
        System.out.println("alıyorlardı");
        System.out.println(parse16.getUniversalDependencyFeatures(parse16.getUniversalDependencyPos()));


        parse7 = new MorphologicalParse("git+VERB+POS+AOR+A1SG");
        parse8 = new MorphologicalParse("git+VERB+POS+PROG1+A3PL");
        parse9 = new MorphologicalParse("git+VERB+NEG+AOR+A2SG");
        parse10 = new MorphologicalParse("git+VERB+NEG+PROG1+A1PL");
        parse11 = new MorphologicalParse("git+VERB+POS+PROG2+A1PL");
        parse12 = new MorphologicalParse("git+VERB+POS+AOR+A1PL");

        System.out.println("giderim");
        System.out.println(parse7.getUniversalDependencyFeatures(parse7.getUniversalDependencyPos()));
        System.out.println("gidiyorlar");
        System.out.println(parse8.getUniversalDependencyFeatures(parse8.getUniversalDependencyPos()));
        System.out.println("gitmezsin");
        System.out.println(parse9.getUniversalDependencyFeatures(parse9.getUniversalDependencyPos()));
        System.out.println("gitmiyoruz");
        System.out.println(parse10.getUniversalDependencyFeatures(parse10.getUniversalDependencyPos()));
        System.out.println("gitmekteyiz");
        System.out.println(parse11.getUniversalDependencyFeatures(parse11.getUniversalDependencyPos()));
        System.out.println("gideriz");
        System.out.println(parse12.getUniversalDependencyFeatures(parse12.getUniversalDependencyPos()));

        parse17 = new MorphologicalParse("kır+VERB^DB+VERB+PASS^DB+VERB+PASS+POS+AOR+A3SG");
        parse18 = new MorphologicalParse("kırıl+VERB^DB+VERB+REFLEX+POS+AOR+A3SG");
        parse19 = new MorphologicalParse("yap+VERB^DB+VERB+PASS^DB+VERB+PASS+POS+AOR+A3SG");
        parse20 = new MorphologicalParse("üzül+VERB^DB+VERB+REFLEX+POS^DB+VERB+ABLE+AOR+A3SG");

        System.out.println("kırılınır (kır-)");
        System.out.println(parse17.getUniversalDependencyFeatures(parse17.getUniversalDependencyPos()));
        System.out.println("kırılınır (kırıl-)");
        System.out.println(parse18.getUniversalDependencyFeatures(parse18.getUniversalDependencyPos()));
        System.out.println("yapılınır");
        System.out.println(parse19.getUniversalDependencyFeatures(parse19.getUniversalDependencyPos()));
        System.out.println("üzülünür");
        System.out.println(parse20.getUniversalDependencyFeatures(parse20.getUniversalDependencyPos()));

    }
}
