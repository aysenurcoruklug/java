
package javaapplication1;
public class MyUtils {
public static float ucgenCevre(float a,float b,float c) {
return a+b+c;
}
 public static float ucgenAlan(float a,float b,float c){
    float u= (a+b+c)/2;
    float alan=(float)Math.sqrt(u*(u-a)*(u-b)*(u-c));
    return alan;
 }
 public static float cokgenCevre(float ... kenar){
     float cokgenCevre=0;
     for(float sayi:kenar){
         cokgenCevre +=sayi;
     }
     return cokgenCevre;
 }
 public static float cokgenAlan(float ... kenarlar){
     int z=0;
     for(float i=0;i<kenarlar.length;i++){
         z++;
     }
     float alan=(float)(1/2*cokgenCevre(kenarlar)*z*Math.sqrt(2));
     return alan;
 }
 public static void metod(int []dizi){
     double endeger=2.71828;
     double [] diziler=new double [dizi.length];
     int a=0;
     for(double x:dizi){
         x=3*Math.pow(x, 2)-2*Math.pow(endeger, x)+Math.sqrt(x);
         diziler [a]=1/(1+Math.pow(endeger, x));
         a++;
     }
     for(int i=0;i<dizi.length;i++){
         System.out.println(diziler[i]);
     }
 }
    public static void main(String[] args) {
      float cevre=MyUtils.ucgenCevre(3, 5, 7);
      System.out.println(cevre);
      
      float alan=MyUtils.ucgenAlan(3, 5, 7);
       System.out.println(alan);
       
       float çç=cokgenCevre(7,9,32,34,5,2,6);
        System.out.println(çç);
        
        float ça=cokgenAlan(2,3,8,6,1);
        System.out.println(ça);
        
        int[] sayılar={34,45,66,-54,9};
    }
 
}
