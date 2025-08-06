package MorphologicalAnalysis;

public class MoodTest {
    public static void main(String[] args) {
        MorphologicalParse verb1, verb2, verb3, verb4, verb5, verb6, verb7, verb8, verb9;

        verb1 = new MorphologicalParse("git+VERB+POS+NECES+A3SG");
        verb2 = new MorphologicalParse("konuş+VERB+POS^DB+VERB+ABLE+NECES+A3SG");
        verb3 = new MorphologicalParse("kaç+VERB+NEG+NECES+COP+A3SG");
        verb4 = new MorphologicalParse("söyle+VERB+POS^DB+VERB+ABLE+NECES+COP+A3SG");
        verb5 = new MorphologicalParse("yüz+VERB+POS^DB+VERB+ABLE+AOR+A3SG");
        verb6 = new MorphologicalParse("yürü+VERB^DB+VERB+ABLE+NEG+AOR+A3SG");
        verb7 = new MorphologicalParse("gel+VERB^DB+VERB+ABLE+NEG^DB+VERB+ABLE+AOR+A3SG");
        verb8 = new MorphologicalParse("git+VERB^DB+VERB+ABLE+NEG^DB+VERB+ABLE+AOR+A3SG");
        verb9 = new MorphologicalParse("yüz+VERB+POS^DB+VERB+ABLE+PAST+A3SG");

        System.out.println("gitmeli");
        System.out.println(verb1.getUniversalDependencyFeatures(verb1.getUniversalDependencyPos()));
        System.out.println("konuşabilmeli");
        System.out.println(verb2.getUniversalDependencyFeatures(verb2.getUniversalDependencyPos()));
        System.out.println("kaçmamalıdır");
        System.out.println(verb3.getUniversalDependencyFeatures(verb3.getUniversalDependencyPos()));
        System.out.println("söyleyebilmelidir");
        System.out.println(verb4.getUniversalDependencyFeatures(verb4.getUniversalDependencyPos()));
        System.out.println("yüzebilir");
        System.out.println(verb5.getUniversalDependencyFeatures(verb5.getUniversalDependencyPos()));
        System.out.println("yürüyemez");
        System.out.println(verb6.getUniversalDependencyFeatures(verb6.getUniversalDependencyPos()));
        System.out.println("gelemeyebilir");
        System.out.println(verb7.getUniversalDependencyFeatures(verb7.getUniversalDependencyPos()));
        System.out.println("gidemeyebilir");
        System.out.println(verb8.getUniversalDependencyFeatures(verb8.getUniversalDependencyPos()));
        System.out.println("yüzebildi");
        System.out.println(verb9.getUniversalDependencyFeatures(verb9.getUniversalDependencyPos()));

        MorphologicalParse verb10, verb11, verb12, verb13, verb14, verb15;
        verb10 = new MorphologicalParse("git+VERB+POS^DB+VERB+ABLE+AOR+COND+A3SG");
        verb11 = new MorphologicalParse("sat+VERB+POS+PROG1+COND+A3SG");
        verb12 = new MorphologicalParse("sat+VERB+POS+DESR+A3SG");
        verb13 = new MorphologicalParse("sat+VERB+POS+AOR+COND+A3SG");
        verb14 = new MorphologicalParse("çözül+VERB+POS^DB+VERB+ABLE+DESR+A3SG");
        verb15 = new MorphologicalParse("yay+VERB+POS^DB+VERB+ABLE+DESR+A1PL");

        System.out.println("gidebilirse");
        System.out.println(verb10.getUniversalDependencyFeatures(verb10.getUniversalDependencyPos()));
        System.out.println("satıyorsa");
        System.out.println(verb11.getUniversalDependencyFeatures(verb11.getUniversalDependencyPos()));
        System.out.println("satsa");
        System.out.println(verb12.getUniversalDependencyFeatures(verb12.getUniversalDependencyPos()));
        System.out.println("satarsa");
        System.out.println(verb13.getUniversalDependencyFeatures(verb13.getUniversalDependencyPos()));
        System.out.println("çözülebilse");
        System.out.println(verb14.getUniversalDependencyFeatures(verb14.getUniversalDependencyPos()));
        System.out.println("yayabilsek");
        System.out.println(verb15.getUniversalDependencyFeatures(verb15.getUniversalDependencyPos()));


    }
}
