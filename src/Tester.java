import java.util.Arrays;

class Tester {
    public static void main(String[] args) {

            for (Month month : Month.values()){
                String s = month.name();
                if(s.endsWith("Y")){
                    System.out.println(month+ " Finisce con Y");
                }else{
                    System.out.println(month + " Non finisce con Y");
                }
                }
        }
    }
