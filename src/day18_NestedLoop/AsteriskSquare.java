package day18_NestedLoop;

public class AsteriskSquare {
    public static void main(String[] args) {
        String ast = "*";
        int times = 0;

        for (int j = 0; j < 10; j++) {
            System.out.print(ast);

            for (int i = 0; i < 10; i++) {

                System.out.println(ast.repeat(10));
                break;
            }

            }
        }
    }