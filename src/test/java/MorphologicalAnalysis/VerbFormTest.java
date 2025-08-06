package MorphologicalAnalysis;

public class VerbFormTest {
    public static void main(String[] args) {
        // Sıfat fiil testleri
        // -dık
        MorphologicalParse parse1, parse2, parse3, parse4, parse5, parse18;
        parse1 = new MorphologicalParse("al+VERB+POS^DB+ADJ+PASTPART+P2SG"); // aldığın
        parse2 = new MorphologicalParse("tanı+VERB+POS^DB+ADJ+PASTPART+PNON"); // tanıdık
        parse3 = new MorphologicalParse("çık+VERB+POS^DB+ADJ+PASTPART+P1PL"); // çıktığımız
        parse4 = new MorphologicalParse("gör+VERB+POS^DB+ADJ+PASTPART+P1SG"); // gördüğüm
        parse5 = new MorphologicalParse("yaz+VERB+POS^DB+ADJ+PASTPART+P2PL"); // yazdığınız
        parse18 = new MorphologicalParse("yaz+VERB+NEG^DB+ADJ+PASTPART+P2PL");
        String uPos1 = parse1.getUniversalDependencyPos();
        String uPos2 = parse2.getUniversalDependencyPos();
        String uPos3 = parse3.getUniversalDependencyPos();
        String uPos4 = parse4.getUniversalDependencyPos();
        String uPos5 = parse5.getUniversalDependencyPos();
        String uPos18 = parse18.getUniversalDependencyPos();

        System.out.println("aldığın");
        System.out.println(parse1.getUniversalDependencyFeatures(uPos1));
        System.out.println("tanıdık");
        System.out.println(parse2.getUniversalDependencyFeatures(uPos2));
        System.out.println("çıktığımız");
        System.out.println(parse3.getUniversalDependencyFeatures(uPos3));
        System.out.println("gördüğüm");
        System.out.println(parse4.getUniversalDependencyFeatures(uPos4));
        System.out.println("yazdığınız");
        System.out.println(parse5.getUniversalDependencyFeatures(uPos5));
        System.out.println("yazmadığınız");
        System.out.println(parse18.getUniversalDependencyFeatures(uPos18));

        //mış
        MorphologicalParse parse6, parse7, parse8, parse19;

        parse6 = new MorphologicalParse("gör+VERB+POS+NARR^DB+ADJ+ZERO"); // görmüş
        parse7 = new MorphologicalParse("bit+VERB+POS+NARR^DB+ADJ+ZERO"); // bitmiş
        parse8 = new MorphologicalParse("yaşa+VERB+POS+NARR^DB+ADJ+ZERO"); // yaşamış
        parse19 = new MorphologicalParse("bit+VERB+NEG+NARR^DB+ADJ+ZERO");

        String uPos6 = parse6.getUniversalDependencyPos();
        String uPos7 = parse7.getUniversalDependencyPos();
        String uPos8 = parse8.getUniversalDependencyPos();
        String uPos19 = parse19.getUniversalDependencyPos();

        System.out.println("görmüş");
        System.out.println(parse6.getUniversalDependencyFeatures(uPos6));
        System.out.println("bitmiş");
        System.out.println(parse7.getUniversalDependencyFeatures(uPos7));
        System.out.println("yaşamış");
        System.out.println(parse8.getUniversalDependencyFeatures(uPos8));
        System.out.println("bitmemiş");
        System.out.println(parse19.getUniversalDependencyFeatures(uPos19));

        //ecek
        MorphologicalParse parse9, parse10, parse11, parse12;

        parse9 = new MorphologicalParse("git+VERB+POS^DB+ADJ+FUTPART+PNON"); // gidecek
        parse10 = new MorphologicalParse("gör+VERB+POS^DB+ADJ+FUTPART+P1PL"); // göreceğimiz
        parse11 = new MorphologicalParse("anlat+VERB^DB+VERB+PASS^DB+VERB+ABLE+NEG^DB+ADJ+FUTPART+PNON"); // anlatılamayacak
        parse12 = new MorphologicalParse("getir+VERB+NEG^DB+ADJ+FUTPART+P3SG"); // getirmeyeceği

        String uPos9 = parse9.getUniversalDependencyPos();
        String uPos10 = parse10.getUniversalDependencyPos();
        String uPos11 = parse11.getUniversalDependencyPos();
        String uPos12 = parse12.getUniversalDependencyPos();

        System.out.println("gidecek");
        System.out.println(parse9.getUniversalDependencyFeatures(uPos9));
        System.out.println("göreceğimiz");
        System.out.println(parse10.getUniversalDependencyFeatures(uPos10));
        System.out.println("anlatılamayacak");
        System.out.println(parse11.getUniversalDependencyFeatures(uPos11));
        System.out.println("getirmeyeceği");
        System.out.println(parse12.getUniversalDependencyFeatures(uPos12));

        //-ası

        //-an
        MorphologicalParse parse15, parse16, parse17, parse20;

        parse15 = new MorphologicalParse("anlaşıl+VERB^DB+VERB+ABLE+NEG^DB+ADJ+PRESPART");
        parse16 = new MorphologicalParse("gel+VERB+POS^DB+ADJ+PRESPART");
        parse17 = new MorphologicalParse("bil+VERB^DB+VERB+PASS+POS^DB+ADJ+PRESPART");
        parse20 = new MorphologicalParse("bilin+VERB+NEG^DB+ADJ+PRESPART");

        String uPos15 = parse15.getUniversalDependencyPos();
        String uPos16 = parse16.getUniversalDependencyPos();
        String uPos17 = parse17.getUniversalDependencyPos();
        String uPos20 = parse20.getUniversalDependencyPos();

        System.out.println("anlaşılamayan");
        System.out.println(parse15.getUniversalDependencyFeatures(uPos15));
        System.out.println("gelen");
        System.out.println(parse16.getUniversalDependencyFeatures(uPos16));
        System.out.println("bilinen");
        System.out.println(parse17.getUniversalDependencyFeatures(uPos17));
        System.out.println("bilinmeyen");
        System.out.println(parse20.getUniversalDependencyFeatures(uPos20));

        // Zarf fiil testleri
        System.out.println("---------------------------------");
        MorphologicalParse zarf1, zarf2, zarf3, zarf4, zarf5, zarf6, zarf7, zarf8, zarf9,zarf10, zarf11, zarf12;
        zarf1 = new MorphologicalParse("yürü+VERB+POS+AOR^DB+ADV+WHILE");
        zarf2 = new MorphologicalParse("yap+VERB+POS+NARR^DB+ADV+WHILE");
        zarf3 = new MorphologicalParse("gör+VERB+POS^DB+NOUN+PASTPART+A3SG+P3SG+LOC");
        zarf4 = new MorphologicalParse("gir+VERB+POS^DB+NOUN+PASTPART+A3SG+P3PL+LOC");
        zarf5 = new MorphologicalParse("güven+VERB+POS^DB+ADV+AFTERDOINGSO");
        zarf6 = new MorphologicalParse("ol+VERB+POS^DB+ADV+BYDOINGSO");
        zarf7 = new MorphologicalParse("konuş+VERB+POS^DB+ADV+BYDOINGSO");
        zarf8 = new MorphologicalParse("git+VERB+POS^DB+ADV+WITHOUTHAVINGDONESO");
        zarf9 = new MorphologicalParse("duy+VERB+NEG+NARR+A3SG^DB+ADV+ASIF");
        zarf10 = new MorphologicalParse("geç+VERB+POS+AOR+A3PL^DB+ADV+WHILE");
        zarf11 = new MorphologicalParse("iç+VERB+NEG^DB+ADV+ASLONGAS");
        zarf12= new MorphologicalParse("bul+VERB^DB+VERB+ABLE+NEG^DB+ADV+WHEN");

        String zarfPos1 = zarf1.getUniversalDependencyPos();
        String zarfPos2 = zarf2.getUniversalDependencyPos();
        String zarfPos3 = zarf3.getUniversalDependencyPos();
        String zarfPos4 = zarf4.getUniversalDependencyPos();
        String zarfPos5 = zarf5.getUniversalDependencyPos();
        String zarfPos6 = zarf6.getUniversalDependencyPos();
        String zarfPos7 = zarf7.getUniversalDependencyPos();
        String zarfPos8 = zarf8.getUniversalDependencyPos();
        String zarfPos9 = zarf9.getUniversalDependencyPos();
        String zarfPos10 = zarf10.getUniversalDependencyPos();
        String zarfPos11 = zarf11.getUniversalDependencyPos();
        String zarfPos12 = zarf12.getUniversalDependencyPos();

        System.out.println("yürürken");
        System.out.println(zarf1.getUniversalDependencyFeatures(zarfPos1));
        System.out.println("yapmışken");
        System.out.println(zarf2.getUniversalDependencyFeatures(zarfPos2));
        System.out.println("gördüğünde");
        System.out.println(zarf3.getUniversalDependencyFeatures(zarfPos3));
        System.out.println("girdiklerinde");
        System.out.println(zarf4.getUniversalDependencyFeatures(zarfPos4));
        System.out.println("güvenip");
        System.out.println(zarf5.getUniversalDependencyFeatures(zarfPos5));
        System.out.println("olarak");
        System.out.println(zarf6.getUniversalDependencyFeatures(zarfPos6));
        System.out.println("konuşarak");
        System.out.println(zarf7.getUniversalDependencyFeatures(zarfPos7));
        System.out.println("gitmeden");
        System.out.println(zarf8.getUniversalDependencyFeatures(zarfPos8));
        System.out.println("duymamışçasına");
        System.out.println(zarf9.getUniversalDependencyFeatures(zarfPos9));
        System.out.println("geçerlerken");
        System.out.println(zarf10.getUniversalDependencyFeatures(zarfPos10));
        System.out.println("içmedikçe");
        System.out.println(zarf11.getUniversalDependencyFeatures(zarfPos11));
        System.out.println("bulamayınca");
        System.out.println(zarf12.getUniversalDependencyFeatures(zarfPos12));

        // İsim fiil testleri
        MorphologicalParse isim1, isim2, isim3, isim4, isim5, isim6, isim7, isim8, isim9, isim10;
        isim1 = new MorphologicalParse("dön+VERB+POS^DB+NOUN+FUTPART+A3SG+P3PL+NOM");
        isim2 = new MorphologicalParse("dön+VERB+POS^DB+NOUN+FUTPART+A3SG+P3PL+ABL");
        isim3 = new MorphologicalParse("koş+VERB+POS^DB+NOUN+INF2+A3SG+P1SG+NOM");
        isim4 = new MorphologicalParse("koş+VERB+POS^DB+NOUN+INF2+A3SG+P1SG+ACC");
        isim5 = new MorphologicalParse("yüz+VERB+POS^DB+NOUN+INF+A3SG+PNON+NOM");
        isim6 = new MorphologicalParse("git+VERB+POS^DB+NOUN+INF3+A3SG+P3SG+NOM");
        isim7 = new MorphologicalParse("git+VERB+NEG^DB+NOUN+INF3+A3SG+P3SG+NOM");
        isim8 = new MorphologicalParse("bitir+VERB+POS^DB+NOUN+PASTPART+A3SG+P3SG+ACC");
        //isim9 = new MorphologicalParse("");
        //isim10 = new MorphologicalParse("");

        String isimPos1 = isim1.getUniversalDependencyPos();
        String isimPos2 = isim2.getUniversalDependencyPos();
        String isimPos3 = isim3.getUniversalDependencyPos();
        String isimPos4 = isim4.getUniversalDependencyPos();
        String isimPos5 = isim5.getUniversalDependencyPos();
        String isimPos6 = isim6.getUniversalDependencyPos();
        String isimPos7 = isim7.getUniversalDependencyPos();
        String isimPos8 = isim8.getUniversalDependencyPos();

        System.out.println("dönecekleri");
        System.out.println(isim1.getUniversalDependencyFeatures(isimPos1));
        System.out.println("döneceklerinden");
        System.out.println(isim2.getUniversalDependencyFeatures(isimPos2));
        System.out.println("koşmam");
        System.out.println(isim3.getUniversalDependencyFeatures(isimPos3));
        System.out.println("koşmamı");
        System.out.println(isim4.getUniversalDependencyFeatures(isimPos4));
        System.out.println("yüzmek");
        System.out.println(isim5.getUniversalDependencyFeatures(isimPos5));
        System.out.println("gidişi");
        System.out.println(isim6.getUniversalDependencyFeatures(isimPos6));
        System.out.println("gitmeyişi");
        System.out.println(isim7.getUniversalDependencyFeatures(isimPos7));
        System.out.println("bitirdiğini");
        System.out.println(isim8.getUniversalDependencyFeatures(isimPos8));


        //String[] word = {"dönecekleri", "döneceklerinden", "koşmam",
        // "koşmamı", "yüzmek", "gidişi", "gitmeyişi", "bitirdiğini"};
    }
}
