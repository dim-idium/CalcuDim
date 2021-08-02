package com.dimidium.calcudim;

public class StringChar {

    Integer resultInt;
    String resultString;
    boolean flag = false;
    String firstValue = "";
    String secondValue = "";
    String operation;
    boolean digit;

    public StringChar(String resultTyping) {
        char[] ch = new char[resultTyping.length()];   //  Char массив
        for (int i = 0; i < resultTyping.length(); i++)
        {
            ch[i] = resultTyping.charAt(i);         // набранную пользователем строку в Char массив
        }


        for (int i = 1; i < resultTyping.length(); i++) // Цикл обработки набранного ваыражения посимволно
        {

            if (!flag) {
                digit = Character.isDigit(ch[i]);// Достаем истину о символе

                if (digit) {                           // Элемент выражения число? Если да, то
                    String simbol = String.valueOf(ch[i]);
                    firstValue = firstValue + simbol;// Конкастинируем символ в переменную


                } else {
                    operation = String.valueOf(ch[i]);
                    flag = true;
                }

            }else{
                String simbol = String.valueOf(ch[i]);
                secondValue = secondValue + simbol;// Конкастинируем символы в переменную

            }

        }

        Integer firstValueInt = Integer.valueOf(firstValue);
        Integer secondValueInt = Integer.valueOf(secondValue);

        if (operation.equals("+")){
            resultInt = firstValueInt + secondValueInt;
        }else if (operation.equals("-")){
            resultInt = firstValueInt - secondValueInt;
        }else if (operation.equals("*")){
            resultInt = firstValueInt * secondValueInt;
        }
        else if (operation.equals("/")){
            resultInt = firstValueInt / secondValueInt;
        }

        resultString =  Integer.toString(resultInt);
    }
}







    /*

                    FOOTER



Integer firstValueInt = Integer.valueOf(firstValue);
        Integer secondValueInt = Integer.valueOf(secondValue);



        if(operation == "+"){
            resultInt = firstValueInt + secondValueInt;
        }else if (operation == "-"){
            resultInt = firstValueInt - secondValueInt;
        }else if (operation == "*"){
            resultInt = firstValueInt * secondValueInt;
        }
        else if (operation == "/"){
            resultInt = firstValueInt / secondValueInt;
        }
        resultString =  Integer.toString(resultInt);
    }







        String data = "abc";
        String[] arr = explode(data);

   public String[] explode(String s) {
        String[] arr = new String[s.length];
        for(int i = 0; i < s.length; i++)
        {
            arr[i] = String.valueOf(s.charAt(i));
        }
        return arr;


    String[] ArreyResultTyping = new String[] {resultTyping};
        result = ArreyResultTyping[2];

     */


        /*
  for (int i = 0; i < ArreyResultTyping.length; i++){
           String s = ArreyResultTyping[i];
           if (Integer.parseInt(s)) {
               numStringOne = numStringOne + ArreyResultTyping[i];
           }else {
               operation = ArreyResultTyping[i];
           }*/







  /*  boolean differnsFlag = Double.parseDouble(StringResultTyping[i]);

   if (Integer.parseInt(ArreyResultTyping[i])) {

           }


     if (!Character.isDigit(ArreyResultTyping[i].charAt(i))) {
               numCharOne = numCharOne + ArreyResultTyping[i];
           }else {
               continue;
           }

   */
