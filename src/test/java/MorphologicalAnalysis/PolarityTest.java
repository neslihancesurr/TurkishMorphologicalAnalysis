package MorphologicalAnalysis;

import org.junit.Test;

public class PolarityTest {
    public static void main(String[] args) {
        FsmMorphologicalAnalyzer fsm = new FsmMorphologicalAnalyzer();
        String[] word = {"değil", "yok", "değillerdir","değiller", "yoktum", "var", "vardı", "varlardı", "vardılar"};
        for (String s : word) {
            System.out.printf("Analysis for: " + s + "\n");
            FsmParseList fsmParseList = fsm.morphologicalAnalysis(s);
            for (int i = 0; i < fsmParseList.size(); i++) {
                System.out.println(fsmParseList.getFsmParse(i).transitionList());
            }
        }
        MorphologicalParse msp = new MorphologicalParse("değil+ADJ");
        MorphologicalParse msp2 = new MorphologicalParse("yok+ADJ");
        MorphologicalParse msp3 = new MorphologicalParse("değil+ADJ^DB+VERB+ZERO+PRES+A3PL+COP");
        MorphologicalParse msp4 = new MorphologicalParse("var+ADJ");
        MorphologicalParse msp5 = new MorphologicalParse("var+ADJ^DB+NOUN+ZERO+A3PL+PNON+NOM^DB+VERB+ZERO+PAST+A3SG");

        System.out.println("değil");
        System.out.println(msp.getUniversalDependencyFeatures(msp.getUniversalDependencyPos()));
        System.out.println("yok");
        System.out.println(msp2.getUniversalDependencyFeatures(msp2.getUniversalDependencyPos()));
        System.out.println("değillerdir");
        System.out.println(msp3.getUniversalDependencyFeatures(msp3.getUniversalDependencyPos()));
        System.out.println("var");
        System.out.println(msp4.getUniversalDependencyFeatures(msp4.getUniversalDependencyPos()));
        System.out.println("varlardı");
        System.out.println(msp5.getUniversalDependencyFeatures(msp5.getUniversalDependencyPos()));
    }


}
