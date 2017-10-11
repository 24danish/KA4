import java.util.Scanner;
public class gaji {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Sila Masukkan Nama pekerja :");
        String Nama =input.next();
   
   System.out.println("Jam bekerja tidak boleh melebihi 9 Jam sehari ");     
   System.out.print("masukkan jam bekerja sehari :");     
   int bil_jam_sehari = input.nextInt();
   System.out.println("Hari bekerja tidak boleh melebihi 30 Hari");        
   System.out.print("masukkan bilangan hari bekerja :");
   int bil_hari = input.nextInt();
   System.out.println("Jam kerja lebih masa tidak boleh melebihi 50 Jam");
   System.out.print("masukkan bilangan jam lebih masa :");
   int bil_jam_ot=input.nextInt();
   
    int gaji = (bil_jam_sehari * bil_hari * 20)+(bil_jam_ot * 15);  
        
        
        System.out.println("Rumusan Gaji bulanan :"+Nama);
        System.out.println("Jumlah jam bekerja :"+bil_jam_sehari+" jam");
        System.out.println("Jumlah hari bekerja :"+bil_hari+" hari");
        System.out.println("Jumlah jam lebih masa :"+bil_jam_ot+" jam");    
        System.out.print("Jumlah gaji :RM"+gaji);       
    }
    
}
