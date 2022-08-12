public class Praktikum {

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        for (String nameToEmboss : args) {
            String validationResultText = "";

            switch (Boolean.hashCode(new Account(nameToEmboss).checkNameToEmboss())) {
                case 1231: validationResultText = "можно"; break;
                case 1237: validationResultText = "нельзя";
            }
            System.out.println("Строку \"" + nameToEmboss + "\" напечатать на карте " + validationResultText + ".");
        }
    }
}