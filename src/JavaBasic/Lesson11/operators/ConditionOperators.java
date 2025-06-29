package JavaBasic.Lesson11.operators;

public class ConditionOperators {
    public static void main(String[] args) {

        boolean logic1 = false;
        boolean logic2 = true;

        System.out.println(logic1);
        System.out.println(logic2);

        //Операторы сравнения делают своим результатом логические значения.
        //Логические операторы применяются только для работы с логическими значениями.
        // 1) Логическое 'И'- &&
        // 2) Логическое 'ИЛИ' - ||
        // 3) Логическое 'НЕ' ( отрицание ) -!

        boolean resultConditionalAND = logic1 && logic2;
        System.out.println(resultConditionalAND);

        boolean resultConditionalOR = logic1 || logic2;
        System.out.println(resultConditionalOR);

        boolean resultConditionalNOT = !logic1;
        System.out.println(resultConditionalNOT);

    }
}
