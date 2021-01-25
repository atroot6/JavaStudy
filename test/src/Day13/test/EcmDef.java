package Day13.test;


public class EcmDef {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int result = ecm(a, b);

            System.out.println(result);
        } catch (EcDef e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("发生异常，数字类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("发生异常，缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("算数异常，除0");
        }
    }

    public static int ecm(int m, int n) throws EcDef {
        if (m < 0 || n < 0) {
            throw new EcDef("发生异常，输入的数字是负数");

        }
        return m / n;
    }
}
