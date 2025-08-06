package MorphologicalAnalysis;

public class NounTest {
    public static void main(String[] args) {
        MorphologicalParse noun1, noun2, noun3, noun4, noun5, noun6, noun7, noun8, noun9, noun10,
                noun11, noun12, noun13, noun14, noun15, noun16, noun17, noun18;

        noun1 = new MorphologicalParse("kalem+NOUN+A3SG+PNON+NOM");
        noun2 = new MorphologicalParse("ayşe+NOUN+PROP+A3SG+PNON+GEN");
        noun3 = new MorphologicalParse("dolap+NOUN+A3SG+PNON+GEN"); // o dolabın
        noun4 = new MorphologicalParse("dolap+NOUN+A3SG+P2SG+NOM"); // senin dolabın

        System.out.println("kalem");
        System.out.println(noun1.getUniversalDependencyFeatures(noun1.getUniversalDependencyPos()));
        System.out.println("Ayşe'nin");
        System.out.println(noun2.getUniversalDependencyFeatures(noun2.getUniversalDependencyPos()));
        System.out.println("o dolabın");
        System.out.println(noun3.getUniversalDependencyFeatures(noun3.getUniversalDependencyPos()));
        System.out.println("senin dolabın");
        System.out.println(noun4.getUniversalDependencyFeatures(noun4.getUniversalDependencyPos()));

        noun11 = new MorphologicalParse("nere+PRON+QUESP+A3SG+PNON+LOC^DB+VERB+ZERO+PRES+A3PL");
        System.out.println("neredeler");
        System.out.println(noun11.getUniversalDependencyFeatures(noun11.getUniversalDependencyPos()));

        noun12 = new MorphologicalParse("hangi+PRON+QUESP+A3SG+P3SG+LOC^DB+VERB+ZERO+PRES+A3PL");
        System.out.println("hangisindeler");
        System.out.println(noun12.getUniversalDependencyFeatures(noun12.getUniversalDependencyPos()));

        noun13 = new MorphologicalParse("değil+ADJ");
        System.out.println("değil");
        System.out.println(noun13.getUniversalDependencyFeatures(noun13.getUniversalDependencyPos()));

        noun14 = new MorphologicalParse("değil+ADJ^DB+VERB+ZERO+PAST+A3SG");
        System.out.println("değildi");
        System.out.println(noun14.isVerb());
        System.out.println(noun12.getUniversalDependencyFeatures(noun12.getUniversalDependencyPos()));

        noun15 = new MorphologicalParse("değil+ADJ^DB+VERB+ZERO+PRES+COP+A3PL");
        System.out.println("değildirler");
        System.out.println(noun12.getUniversalDependencyFeatures(noun12.getUniversalDependencyPos()));

    }
}
