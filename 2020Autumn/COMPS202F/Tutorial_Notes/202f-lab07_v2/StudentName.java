public class StudentName {
    private String fullName;

    public StudentName(String aName){
        fullName = aName;
    }

    public String getName() {
        return fullName;
    }

    public String setName(String nName) {
        fullName = nName;
        return fullName;
    }

    public String toString(){
        return "Full Name: " + fullName;
    }


    public String findShortName(){
        String ShortName = "";
        int pos01 = fullName.indexOf(" ");
        int pos02 = fullName.indexOf(" ", pos01+1);

        ShortName += fullName.charAt(0);
        ShortName += fullName.charAt(pos01+1);
        ShortName += fullName.substring(pos02);


        return ShortName;
    }


    public String findChineseName(){
        String ChineseName = "";
        int pos01 = fullName.indexOf("-");
        int pos02 = fullName.indexOf(" ");
        int pos03 = fullName.indexOf(" ", pos02+1);

        ChineseName += fullName.substring(pos03);
        ChineseName += " ";
        ChineseName += fullName.substring(0, pos01);
        ChineseName += " ";
        ChineseName += fullName.substring(pos01+1, pos02);

        return ChineseName;
    }





	
	
	
	
	
}
