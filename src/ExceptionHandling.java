import java.io.*;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException,ArithmeticException {
        int i=1;
        int j;
        int[] a =new int[4];
        int k=0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try {


           j= Integer.parseInt(br.readLine());
            k=i/j;
            if(k<10){
                throw new ArithmeticException();
            }
            System.out.println(k);
            System.out.println("bye");

            for (int c=0;c<=4;c++){
                a[c]=c+1;
            }


        }
        catch (IOException e){
            System.out.println("io exception ");
        }
        catch (ArithmeticException e){
            System.out.println("minimum value should be 10");
        }
        finally {
            br.close();
            System.out.println("finally bye");
        }

        System.out.println(k);
    }
}
