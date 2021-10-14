public class Rotation {

    public static void main(String[] args) {
        System.out.println(checkRotation("abcd", "dcab"));
    }
    public static Boolean checkRotation(String str1, String str2){
        int i = 0;
        String tempStr = "";
        int count = 0;
        while(str1.length() == str2.length()){
            if(str1.equals(str2))
                return true;
            else{
                if(tempStr.equals((str2)))
                    return true;
                while (!tempStr.equals(str2)){
                    char first = str1.charAt(i);
                    String subStr = str1.substring(1, (str1.length()));
                    tempStr = subStr + first;
                    str1 = tempStr;
                    count ++;
                    if(count >= 4){
                        return false;
                    }
                }

            }
        }
        return false;
    }
}
