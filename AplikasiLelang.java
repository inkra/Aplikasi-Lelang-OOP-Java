 package LelangBarang;
    import java.util.Scanner;
    public class AplikasiLelang {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in); 
        Masyarakat masyarakat2 = new Masyarakat();
        Petugas petugas2 = new Petugas();
        Lelang lelang2 = new Lelang();
        Laporan laporan2 = new Laporan();
        
        //Menampilkan Tabel Daftar Petugas
        laporan2.laporan(petugas2);
        //Input Petugas(Yang akan melelang barang)
        System.out.println("\n==========SILAHKAN LELANG BARANG ANDA!==========");
        System.out.print("Masukkan ID Petugas                : ");
        int idPetugas = myObj.nextInt();
        System.out.println("Selamat datang " + petugas2.getNama(idPetugas)+"\n");
        
        //Input data Barang yang akan di lelang
        Barang barang2 = new Barang();
        
        //Menampilkan tabel daftar masyarakat & barang yg mau dilelang
        laporan2.laporan(barang2);
        laporan2.laporan(masyarakat2);
        
        //Proses pelelangan barang
        lelang2.prosesLelang(masyarakat2, lelang2, barang2);
        
        //Laporan lelang barang
        //laporan2.laporan(masyarakat2, lelang2, barang2);
    }
}
