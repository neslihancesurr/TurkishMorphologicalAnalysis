package MorphologicalAnalysis;

public class AnalysisTest {
    public static void main(String[] args) {
        FsmMorphologicalAnalyzer fsm = new FsmMorphologicalAnalyzer();
        //String[] word = {"ne", "neredeler", "neden", "nasıl", "kaç", "hangisi", "hangisindeler", "kalem", "Ayşe'nin", "dolabın"};
        //String[] word = {"giderdi", "alırdı", "görürlerdi", "almazlardı", "söylediydim", "söyledilerdi"};
        //String[] word = {"düşecekti", "görüneceklerdi", "atılacaklardı", "gidecektim"};
        //String[] word = {"gitmiş", "görülmüş", "görürmüş", "görmekteymiş", "göremiyormuş", "duruyordu"};
        //String[] word = {"git", "gitsin", "gidin", "gitsinler", "gideyim", "gidesin", "gide", "gidelim", "gidiniz"};
        //String[] word = {"gitse", "olsa", "gelirse", "görse"};
        //String[] word = {"kırılınır", "yapılınır", "denir", "üzülünebilir", "alındı"};
        //String[] word = {"gelmektedir","gelmekte", "yürür", "mavidir", "direneceklerdir"};
        //String[] word = {"yağabilir", "gelebilir", "gelemeyebilir", "gelmeyebilir", "yürüyemez", "çözülebilse", "çözülebilirse", "sevse", "severse"};
        //String[] word = {"dönecekleri", "döneceklerinden", "koşmam", "koşmamı", "yüzmek", "gidişi", "gitmeyişi", "bitirdiğini"};
        //String[] word = {"yürürken", "yapmışken", "gördüğünde", "girdiklerinde", "güvenip",
       //        "olarak", "konuşarak", "gitmeden", "duymamışçasına", "geçerlerken", "içmedikçe", "bulamayınca"};
        // String[] word = {"aldığın", "tanıdık", "çıktığımız", "gördüğüm", "yazdığınız", "yazmadığınız",
        //       "görmüş", "yaşamış", "bitmiş", "bitmemiş",
        //      "gidecek", "alacakları", "göreceğimiz", "anlatılamayacak", "getirmeyeceği",
        //      "bakılası", "unutulası",
        //      "anlaşılamayan", "gelen", "bilinen", "bilinmeyen"};
        //String[] word = {"gitmeli", "konuşabilmeli", "kaçmamalıdır", "söyleyebilmelidir",
        //"yüzebilir", "yürüyemez", "yüzebildi", "gelemeyebilir", "gidemeyebilir"};
       // String[] word = {"gidebilirse", "satıyorsa", "satsa", "satarsa", "çözülebilse", "uyusa", "yayabilsek"};
        //String[] word = {"gitti", "gittiydi", "gidecekti", "gitmiş", "gitmişti", "gidiyordu", "giderdi", "gidermiş", "gidemiyormuş", "gelemeyecekmiş", "alıyorlardı", "gelmişmiş"};
        //String[] word = {"giderim", "gidiyorlar", "gitmezsin", "gitmiyoruz", "gitmekteyiz", "gideriz"};
        //String[] word = {"değil", "değildi", "değilmiş", "değildirler"};
        //String[] word = {"kendi", "kendisi", "kendinin", "kendisinin", "görse", "versene", "bugün", "bugünden"};
        //String[] word = {"fakülteyi", "bitirenler", "göreve", "en", "uçtan", "başlıyorlarmış", "kitaplık", "ikidir", "kaçtır", "arabadakiler", "arabalardakiler"};
        //String[] word = {"annem", "evden", "çıkarak", "yanımıza", "gelecekti"};
        //String[] word = {"yıllarca","aylarca", "bence", "bizlerce", "yavaşça"};
        //String[] word = {"ev", "evi", "eve", "evde", "evden", "evin", "evle"};
        //String[] word = {"gidin", "gidiniz", "yıkanıldı", "gidilindi", "mıymış", "bitirmişmiş"};
        String[] word = {"yazacaklarım", "yazdıklarım", "yazabileceklerim", "sevdiğim", "duyunca",
                "bitince", "gelirken", "gelecekken", "duyulan"};
        for (String s : word) {
            System.out.printf("Analysis for: " + s + "\n");
            FsmParseList fsmParseList = fsm.morphologicalAnalysis(s);
            for (int i = 0; i < fsmParseList.size(); i++) {
                System.out.println(fsmParseList.getFsmParse(i).transitionList());
            }
        }

        MorphologicalParse word1 = new MorphologicalParse("duy+VERB^DB+VERB+PASS+POS^DB+ADJ+PRESPART");
        MorphologicalParse word2 = new MorphologicalParse("gel+VERB+POS+AOR^DB+ADV+WHILE");
        MorphologicalParse word3 = new MorphologicalParse("yaz+VERB+POS^DB+VERB+ABLE^DB+NOUN+FUTPART+A3PL+P1SG+NOM");
        MorphologicalParse word4 = new MorphologicalParse("sev+VERB+POS^DB+ADJ+PASTPART+P1SG");
        MorphologicalParse word6 = new MorphologicalParse("duy+VERB+POS^DB+ADV+WHEN");

        System.out.println(word1.getUniversalDependencyFeatures(word1.getUniversalDependencyPos()));
        System.out.println(word2.getUniversalDependencyFeatures(word1.getUniversalDependencyPos()));
        System.out.println(word3.getUniversalDependencyFeatures(word1.getUniversalDependencyPos()));
        System.out.println(word4.getUniversalDependencyFeatures(word1.getUniversalDependencyPos()));
        System.out.println(word6.getUniversalDependencyFeatures(word1.getUniversalDependencyPos()));
    }
}
