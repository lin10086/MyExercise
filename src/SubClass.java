public class SubClass {
    public static void main(String[] args) {
        int[] a []=new int[2][4];

        int[] arr = {1, 2};
        int[][] b = new int[2][4];
        String[] str = {"a", "b"};
        if (arr instanceof int[]) {
            System.err.println("是int[]");
        }
        if (b instanceof int[][]) {
            System.err.println("是int[][]");
        }
        if (str instanceof String[]) {
            System.err.println("是String[]");
        }
        /**
         * boolean result = obj instanceof Class;
         * 1.obj为对象，Class为类或接口（当obj为Class的对象，或直接或间接的自类，或接口的实现类都返回true.
         * 2.编译时编译器会检查obj是否能Class类型.
         * 3.obj必须是引用类型
         * 4.若obj为null则肯定返回false (null和任何值都不相同（包括本身））
         */
    }
}
