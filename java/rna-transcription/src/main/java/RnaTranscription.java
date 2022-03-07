class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rnaStrand = "";
        
        // Returns empty string if the dnaStrand is empty
        if (dnaStrand == "")
        return "";
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i) == 'G')
            rnaStrand = rnaStrand + "C";
            else if(dnaStrand.charAt(i) == 'C')
            rnaStrand = rnaStrand + "G";
            else if(dnaStrand.charAt(i) == 'T')
            rnaStrand = rnaStrand + "A";
            else if(dnaStrand.charAt(i) == 'A')
            rnaStrand = rnaStrand + "U";
        }
        return rnaStrand;
    }

}
