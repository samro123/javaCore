public class StringApps {
    public static void main(String[] args) {
        //String subjectScores = "English = 28 Science = 83 Math = 90 History = 65";
        //subjectScore(subjectScores);
        //checkPassword("jajdss@");
        String st = """
                what your name
                what time
                what dong in
                what
                """;
        System.out.println(countString(st));
    }

    static void subjectScore(String subjectString){
        String[] slipt = subjectString.split(" ");
        int sum = 0;
        int count = 0;
        for(int i = 0 ; i < slipt.length ;i++){
            //duyet qua cac phan tu trong Array<String>
            if(Character.isDigit(slipt[i].charAt(0))){
                //kiem tra cac phan tu co phia la so
                sum+=Integer.valueOf(slipt[i]);// string ep ve int
                count ++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }

    static  void checkPassword(String passWord){
        int countNumber =0;
        int countLetter =0;
        int countSpecialChar = 0;
        if(passWord.length() <= 5){
            System.out.println("Password weak");
        }
        else{
            for(int i = 0 ; i < passWord.length() ; i++){
                //duyet qua cac phan tu trong String
                //System.out.println(passWord.charAt(i) + " ");
                if(Character.isLetter(passWord.charAt(i))){
                    countLetter ++;
                }else if (Character.isDigit(passWord.charAt(i))){
                    countNumber ++;
                }else if(!Character.isLetterOrDigit(passWord.charAt(i))){
                    countSpecialChar++;
                }
            }
            if(countNumber * countLetter * countSpecialChar == 0){
                System.out.println("Password unvalid");
            }
            else{
                System.out.println("Passwrod vaild");
            }
        }
    }

    static  int countString(String st){
        int count = 0;
        String [] slipts = st.split(" ");
        for(int i = 0 ; i < slipts.length ; i++){
            //System.out.println(slipts[i]);
            if(slipts[i].contains("what")){
                count ++;
            }
        }
        return count;
    }
}
