package selfpractices.selfpractice_stringmanipulations;

public class StringManipulations_01 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("java");//new kelimesi ile olusturulan her sey yeni bir referans alir

//        str1.toLowerCase();       //str1 e yapilan degisiklik yani kucuk harfe donusturme methodu henuz atama yapmadigimiz icin  kalici olarak degismez
                                    //sadece 10.satirda degisir.
                                    // Asagidaki if statement yine false/not equal sonucu verir.

        String str= str1.toLowerCase();   //atama yaptik

        if(str.equals(str2)){            // == kullanirsam sonucu hatali verir. Cunku hem icerige hem referansa bakar
                                         //kelimeler icerik ayni olsa bile "==" bize false dondurur cunku new keyword ile str2 yeni bir referans aldi
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


                //2.Way

        if(str2.equals(str1.toLowerCase())){    //equals() method sadece icerik karsilastirir, dolayisi ile if statement "true" doner
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

                //3.Way

        if(str1.toLowerCase() == str2.toLowerCase()){ //"==" hem reference hem icerik check edeceginden str2 ya yeni bir reference atandigindan "false" / not equal verir
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }




    }
}
