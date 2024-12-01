package addBinary;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder resultToBuilder = new StringBuilder();
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        int  ostatok = 0;

        while(indexA >= 0 || indexB>= 0 || ostatok != 0){
            int digitA = indexA >= 0 ? a.charAt(indexA) - '0' : 0;
            int digitB = indexB >= 0 ? b.charAt(indexB) - '0' : 0;

            int sum = digitA + digitB + ostatok;
            resultToBuilder.append(sum % 2);
            ostatok = sum / 2;

            indexA--;
            indexB--;
       }

        return resultToBuilder.reverse().toString();
    }
}
