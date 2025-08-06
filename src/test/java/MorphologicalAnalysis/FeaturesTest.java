package MorphologicalAnalysis;

import org.junit.Before;

public class FeaturesTest {
// PronType Tests
    MorphologicalParse pron, pron2, pron3, pron4, pron5, pron6, pron7, pron8, pron9, pron10,
    pron11, pron12, pron13, pron14, pron15, pron16, pron17, pron18, pron19;

    @Before
    public void setUp() throws Exception {
        pron = new MorphologicalParse("biz+PRON+PERS+A1PL+PNON+NOM"); // biz
        pron2 = new MorphologicalParse("siz+PRON+PERS+A2PL+PNON+NOM"); // sizler
        pron3 = new MorphologicalParse("o+PRON+PERS+A3PL+PNON+LOC^DB+ADJ+REL"); //onlardaki
        pron4 = new MorphologicalParse("benimdi"); // benimdi
        pron5 = new MorphologicalParse();
        pron6 = new MorphologicalParse();
        pron7 = new MorphologicalParse();
        pron8 = new MorphologicalParse();
        pron9 = new MorphologicalParse();
        pron10 = new MorphologicalParse();
    }
}
