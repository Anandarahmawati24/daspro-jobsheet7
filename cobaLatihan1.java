import java.util.Scanner;
public class DoWhileCuti4{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.println(" Jatah cuti :  ");
        jatahCuti = sc.nextInt();
        do {
            System.out.println(" Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();
        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.println(" Jumlah hari:  ");
            jumlahHari = sc.nextInt();
            
            if (jumlahHari<= jatahCuti) {
                System.out.println(" Sisa jatah cuti: " +jatahCuti);
            } else {
                System.out.println(" Sisa jatah cuti anda tidak mencukupi");
                break;
                System.out.println(" Silahkan masukkan hari yang sesuai.");;
            } 
        }
    } while (jatahCuti> 0);
    } while (true);
}