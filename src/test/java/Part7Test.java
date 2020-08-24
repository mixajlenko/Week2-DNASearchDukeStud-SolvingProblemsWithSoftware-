import org.junit.Assert;
import org.junit.Test;


public class Part7Test {
    Part7 part7 = new Part7();

    String dna1 = "AGTCTCTACGACGGATGTATGATACAAAACAGCGTGCAAAAATGCCGACGTGGCTATGCATCTGTTTAATTAAGGAATCCGAGCGGCGAACCCGCACG" +
            "CATGCACGGCTCTGCGATCCATGGACCGAGGGTTAGGATGAGCCCCTAATTGACGCATGCCCATAAGCCGATCGTGTACTACCTTAGGACAGAATTTTCAGAA" +
            "CTAGGTGTAGAATATAACGTGAACCATAGTGTTTGACACTCGTTCCATATTGATTATGCCTCTACCAGATGACCACAGCTTCTTCCTCTATATCTTTCGAGAA" +
            "GCTAATTCCCCTTGTTAGCGGGCAACTCAATAACCCGCACGACGACCCCCGCGTTAGGTCAAATACTATAAAATTTTGGGATTGGCCTACTATTCCGTGAACA" +
            "CTTCGAGCACGCTTTGACGGAGGGAAAATTTCGAAGATCTCTCTATTTGTGGTTTCCTCGTATTTACGTAAGGATTTTTCGCGCTAGCAAGTTTGATCTTGTG" +
            "GACTGCGGACTTGGTGTAGCATGCTATGTTTTCTTCTTCAGTATATTGAGGTAACCGTCCCCGACCGACCGTGATAGGAACTAGGTTACCGGTAATAGGTTAA" +
            "TTACACAGAGCTTGTAACACCCGACATGGGCACCTGCCGCTCCGCTGCGTCGCCTAATGTTAACCACCCGACCCGGATGCATGTACATACGTTTAAGTCCAAA" +
            "ATAAGGCCGCGGACTCCCCAGCAGTACGTCTTACCAAATCACACTTCAAAGTAAGCTCGTAGATCGATTTCGTGGGATATAATTTCGGCACTGAAATAAGAAC" +
            "CGTCGCGTTCCGCCTGGTAAACTACGCAGCTGCCCAGGTCGACGGATGCTTGGTTCGCAAATCTAAGCCGTAGGGGCTTGGATGATCCCGCCGTTTGCACTCC" +
            "GATTTATAGAATAGTGTGAGTACCTGACGAAATACGGGTAGTTCGCACTATCTGGTTGTGATTACCCATAGTCGGCGG";

    String dna2 = "TGTAGGCGGAGCATGTCACACCTTCGCTGCTTTCCTACAGGCGTCACTAAAAGCAAGCTATCTGTAATATATGTCGACATAACGACGTACCCGCCAC" +
            "TGCCGCATCAGTCTCCTAGGCCTTAAATTACTTACGAGGACACAGCCACGCTTGAGTTATTCTACATAGTGGGATAAAGCGACAGATTTGAGTCTCACATCCT" +
            "GTGCTTATCGTAAAGACACACGAACCCTCGCCGTGGCCAAGGCAAAAACCGGCCATGAACCTTGTCTCGAATAACAGTAATATATGAAGACCATGTAACGATT" +
            "CCCAGTTTTAGACATGTCTCGGTAGGCGTGACAGTGGCCTCATTTCTGATGTCGCGACCGGAACTCGAATAAGCACCCTCCGAGGTTGGTGGGCTCACTAGTG" +
            "TTGCGCCACGAGGTCAATGCCCGCCGACGGCCACCAAGTCGTCAATGGCCGACGGAGCCTCAATACTTTCGTCAGTGGTTGTAAAACGTGCTGAGTTACCGGC" +
            "GACCCGTTCGCAACATTCGAGCGAACGATTTTCACTAGAAAAAATAGAGGGCTGCCGAATGTAATCATATTCACGAAGCTGTTGCCTATAACTTGAACGATTT" +
            "ATAGATGAATGCGGCCGCGTGTACAGCGCCCCGTCGCTTAACGACGCCAATCCTGAGATATACGGGGTTGATTTGCCCACGTCAAGGATACATGTTCGGGTTT" +
            "CATACTTCAATCCTCATGCGTTACCGAATCGAACCTGTGTGATTTCCATCCTATTTGCACGAATGTCGCGCAAACGCAGATCGGGTCCTTGCCGTAAAATCGG" +
            "ATTTTCAGGTGACGAGGAGCTTATAGCGCCTCTCTCAACACAGTGGATGGAGTAGATTGCCACAGGAGCCACCAGTCGTTATTATTTCAAGTGAAGGGTATTG" +
            "GTGAATGCTGTAAACAGGATCATGAATTGACCGGACTAGAATCCCGGTTCTATGGACACGTTAAATATTGTTACGGCGT";

    @Test
    public void testCountGenes() {
        int result1 = part7.countGenes(dna1);
        Assert.assertEquals(8, result1);
        int result2 = part7.countGenes(dna2);
        Assert.assertEquals(11, result2);
    }

    @Test
    public void testReadGeneFile() {
        String result = part7.readGeneFile("DNAString2");
        Assert.assertEquals("TGTAGGCGGAGCATGTCACACCTTCGCTGCTTTCCTACAGGCGTCACTAAAAGCAAGCTATCTGTAATATATGTCGACA" +
                "TAACGACGTACCCGCCACTGCCGCATCAGTCTCCTAGGCCTTAAATTACTTACGAGGACACAGCCACGCTTGAGTTATTCTACATAGTGGGATAAAGCG" +
                "ACAGATTTGAGTCTCACATCCTGTGCTTATCGTAAAGACACACGAACCCTCGCCGTGGCCAAGGCAAAAACCGGCCATGAACCTTGTCTCGAATAACAG" +
                "TAATATATGAAGACCATGTAACGATTCCCAGTTTTAGACATGTCTCGGTAGGCGTGACAGTGGCCTCATTTCTGATGTCGCGACCGGAACTCGAATAAG" +
                "CACCCTCCGAGGTTGGTGGGCTCACTAGTGTTGCGCCACGAGGTCAATGCCCGCCGACGGCCACCAAGTCGTCAATGGCCGACGGAGCCTCAATACTTT" +
                "CGTCAGTGGTTGTAAAACGTGCTGAGTTACCGGCGACCCGTTCGCAACATTCGAGCGAACGATTTTCACTAGAAAAAATAGAGGGCTGCCGAATGTAAT" +
                "CATATTCACGAAGCTGTTGCCTATAACTTGAACGATTTATAGATGAATGCGGCCGCGTGTACAGCGCCCCGTCGCTTAACGACGCCAATCCTGAGATAT" +
                "ACGGGGTTGATTTGCCCACGTCAAGGATACATGTTCGGGTTTCATACTTCAATCCTCATGCGTTACCGAATCGAACCTGTGTGATTTCCATCCTATTTG" +
                "CACGAATGTCGCGCAAACGCAGATCGGGTCCTTGCCGTAAAATCGGATTTTCAGGTGACGAGGAGCTTATAGCGCCTCTCTCAACACAGTGGATGGAGT" +
                "AGATTGCCACAGGAGCCACCAGTCGTTATTATTTCAAGTGAAGGGTATTGGTGAATGCTGTAAACAGGATCATGAATTGACCGGACTAGAATCCCGGTT" +
                "CTATGGACACGTTAAATATTGTTACGGCGT", result);
    }
}