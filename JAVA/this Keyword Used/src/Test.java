  class abcd {

    int i;

    void setvalue(int i) {

        this.i = i; // if we remove this keyword ,we get zero answer.To resolve this problem we used this keyword...

    }

    void show() {

        System.out.println(i);
    }
}

public class Test {

    public static void main(String[] args) {

        abcd obj = new abcd();

        obj.setvalue(87);
        obj.show();

         }

        }
