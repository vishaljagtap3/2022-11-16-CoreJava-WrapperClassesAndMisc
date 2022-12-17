import java.awt.geom.FlatteningPathIterator;

public class Main {
    public static void main(String[] args) {

        //*****
        //Auto boxing
        //Integer iRef = new Integer(100); //not recommended
        Integer iRef = 100;
        Float fObj = 3.14f;
        //Auto unboxing
        float fVar = fObj; //float fVar = fObj.floatValue();
        int i = iRef;

        //****

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
        System.out.println("Total Processors: " + runtime.availableProcessors());
        System.out.println("Max Memory: " + runtime.maxMemory());
        runtime.gc();

        try {
            Process p = runtime.exec("ls -l -a /home/vishal/java");

            StringBuffer buff = new StringBuffer();
            int count = 0;
            byte[] data = new byte[1024 * 2];
            while ((count = p.getInputStream().read(data)) != -1) {
                buff.append(new String(data, 0, count));
            }

            System.out.println(buff.toString());

            char [] carr = new char[120];
            buff.getChars(10, 30, carr, 10);
            for(char ch : carr) {
                System.out.print(ch);
            }
            System.out.println();
        }
        catch (Exception e){
        }

        /*int val = Integer.parseInt("12323");
        float fval = Float.parseFloat("12.12f");

        System.out.println(Byte.MIN_VALUE + " --- " + Byte.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " --- " + Double.MAX_VALUE);*/


        /*String str = "1234";
        Integer i2 = new Integer(str);
        System.out.println(i2.intValue());*/


        /*Integer i1 = new Integer(10);
        System.out.println(i1.intValue());
        System.out.println(i1.floatValue());

        Double d1 = new Double(10.10);
        System.out.println(d1.doubleValue());
        System.out.println(d1.intValue());*/
    }

}
