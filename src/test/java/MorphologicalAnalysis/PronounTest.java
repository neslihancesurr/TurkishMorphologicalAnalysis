package MorphologicalAnalysis;

public class PronounTest {
    public static void main(String[] args) {
        FsmMorphologicalAnalyzer fsm = new FsmMorphologicalAnalyzer();
        //personal pronouns
        String[] word = {"ben", "biz", "sizler", "onlardaki", "benimdi"};
        //reciprocal
        //String[] word = {"birbirinize", "birbirlerini", "birbirini", "birbirinden", "birbirimizi", "birbirimizden"};
        //interrogatives
        //String[] word = {"mı", "mi", "mısınız", "mıydınız", "mıymış", "kim", "kimi", "kimdenler", "kimlesiniz",
        //"ne", "neyi", "neyden", "nereyi", "neresi", "nereden", "neden", "nedendi", "nasıl", "nasıllar",
        //"nasıldı", "kaç", "kaçı", "kaçıncı", "kaçtan", "kaçıncıydı", "hangi", "hangisi", "hangileriydi", "hangisinden",
        //"hani", "acaba"};
        //String[] word = {"hiç", "hiçbir", "hiçbiri", "hiçbirinden", "kimse", "kimsenin", "kimselere", "kimseye"};
        //String[] word = {"topu", "her", "bazı", "bazıları", "bazısı", "bazımız", "çoğu", "çoğumuz", "birçok", "birçoğumuz",
         //       "birkaç", "birkaçımızın", "başka", "başkası", "başkasıyla", "birkaç", "birkaçımızın",
        //"öbür", "öbüründen", "ötekinden", "öteki", "herkes", "herkesten", "kimi", "kimilerine", "biri", "birilerinden","birisini",
        //"hepsi", "hepsinde"};
       //String[] word = {"bu", "şu", "o", "bundan", "şuna", "ondan", "burada", "buradan", "şurada", "şuradan", "oradan", "orada", "oranınki"};
        //String[] word = {"üçüncü", "kaçıncı","beşinci", "yirminci"};

        for (String s : word) {
            System.out.printf("Analysis for: " + s + "\n");
            FsmParseList fsmParseList = fsm.morphologicalAnalysis(s);
            for (int i = 0; i < fsmParseList.size(); i++) {
                System.out.println(fsmParseList.getFsmParse(i).transitionList());
            }
        }

        MorphologicalParse pronoun16, pronoun17, pronoun18, pronoun19, pronoun20, pronoun21, pronoun22, pronoun23;

        pronoun16 = new MorphologicalParse("birçok+DET");
        pronoun17 = new MorphologicalParse("birçoğu+PRON+QUANTP+A1PL+P1PL+NOM");
        pronoun18 = new MorphologicalParse("şura+NOUN+A3SG+PNON+ABL");
        pronoun19 = new MorphologicalParse("oradan+ADV");
        pronoun20 = new MorphologicalParse("ora+NOUN+A3SG+PNON+LOC");
        pronoun21 = new MorphologicalParse("ora+NOUN+A3SG+PNON+GEN^DB+ADJ+REL");

        System.out.println("her (det)");
        System.out.println(pronoun16.getUniversalDependencyFeatures(pronoun16.getUniversalDependencyPos()));
        System.out.println("bazı (det)");
        System.out.println(pronoun17.getUniversalDependencyFeatures(pronoun17.getUniversalDependencyPos()));
        System.out.println("bazısı");
        System.out.println(pronoun18.getUniversalDependencyFeatures(pronoun18.getUniversalDependencyPos()));
        System.out.println("bazımız");
        System.out.println(pronoun19.getUniversalDependencyFeatures(pronoun19.getUniversalDependencyPos()));
        System.out.println("çoğu");
        System.out.println(pronoun20.getUniversalDependencyFeatures(pronoun20.getUniversalDependencyPos()));
        System.out.println("oranınki");
        System.out.println(pronoun21.getUniversalDependencyFeatures(pronoun21.getUniversalDependencyPos()));


        MorphologicalParse pronoun, pronoun1, pronoun2, pronoun3, pronoun4, pronoun5, pronoun6,
        pronoun7, pronoun8, pronoun9, pronoun10, pronoun11, pronoun12, pronoun13, pronoun14, pronoun15;

        pronoun = new MorphologicalParse("mi+QUES+PRES+A3SG");
        pronoun1 = new MorphologicalParse("mi+QUES+PAST+A2PL");
        pronoun2 = new MorphologicalParse("kim+PRON+QUESP+A3SG+PNON+ACC");
        pronoun3 = new MorphologicalParse("kim+PRON+QUESP+A3SG+PNON+ABL^DB+VERB+ZERO+PRES+A3PL");
        pronoun4 = new MorphologicalParse("ne+CONJ");
        pronoun5 = new MorphologicalParse("ne+PRON+QUESP+A3SG+P3SG+NOM");
        pronoun6 = new MorphologicalParse("nere+PRON+QUESP+A3SG+P3SG+NOM");
        pronoun7 = new MorphologicalParse("nereden+ADV");
        pronoun8 = new MorphologicalParse("neden+ADV");
        pronoun9 = new MorphologicalParse("neden+NOUN+A3SG+PNON+NOM^DB+VERB+ZERO+PAST+A3SG");
        pronoun10 = new MorphologicalParse("nasıl+ADV");
        pronoun11 = new MorphologicalParse("nasıl+ADJ^DB+VERB+ZERO+PRES+A3PL"); //nasıllar
        pronoun12 = new MorphologicalParse("kaç+ADJ");
        pronoun13 = new MorphologicalParse("kaç+ADJ^DB+NOUN+ZERO+A3SG+P3SG+NOM"); //kaçı
        pronoun14 = new MorphologicalParse("kaçıncı+ADJ");
        pronoun15 = new MorphologicalParse("kaçıncı+ADJ^DB+VERB+ZERO+PAST+A3SG"); //kaçıncıydı


        System.out.println("mı");
        System.out.println(pronoun.getUniversalDependencyFeatures(pronoun.getUniversalDependencyPos()));
        System.out.println("miydiniz");
        System.out.println(pronoun1.getUniversalDependencyFeatures(pronoun1.getUniversalDependencyPos()));
        System.out.println("kimi");
        System.out.println(pronoun2.getUniversalDependencyFeatures(pronoun2.getUniversalDependencyPos()));
        System.out.println("kimdenler");
        System.out.println(pronoun3.getUniversalDependencyFeatures(pronoun3.getUniversalDependencyPos()));
        System.out.println("ne (conj)");
        System.out.println(pronoun4.getUniversalDependencyFeatures(pronoun4.getUniversalDependencyPos()));
        System.out.println("neyi");
        System.out.println(pronoun5.getUniversalDependencyFeatures(pronoun5.getUniversalDependencyPos()));
        System.out.println("nereyi");
        System.out.println(pronoun6.getUniversalDependencyFeatures(pronoun6.getUniversalDependencyPos()));
        System.out.println("nereden (adv)");
        System.out.println(pronoun7.getUniversalDependencyFeatures(pronoun7.getUniversalDependencyPos()));
        System.out.println("neden (adv)");
        System.out.println(pronoun8.getUniversalDependencyFeatures(pronoun8.getUniversalDependencyPos()));
        System.out.println("neden (noun)");
        System.out.println(pronoun9.getUniversalDependencyFeatures(pronoun9.getUniversalDependencyPos()));
        System.out.println("nasıl");
        System.out.println(pronoun10.getUniversalDependencyFeatures(pronoun10.getUniversalDependencyPos()));
        System.out.println("nasıllar");
        System.out.println(pronoun11.getUniversalDependencyFeatures(pronoun11.getUniversalDependencyPos()));
        System.out.println("kaç");
        System.out.println(pronoun12.getUniversalDependencyFeatures(pronoun12.getUniversalDependencyPos()));
        System.out.println("kaçı");
        System.out.println(pronoun13.getUniversalDependencyFeatures(pronoun13.getUniversalDependencyPos()));
        System.out.println("kaçıncı");
        System.out.println(pronoun14.getUniversalDependencyFeatures(pronoun14.getUniversalDependencyPos()));
        System.out.println("kaçıncıydı");
        System.out.println(pronoun15.getUniversalDependencyFeatures(pronoun15.getUniversalDependencyPos()));
    }
}
