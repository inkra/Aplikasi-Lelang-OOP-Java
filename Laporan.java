package LelangBarang;
public class Laporan {
    public void laporan(Barang barang){
        int x=barang.getJmlBarang();

        System.out.println();
        System.out.println("=====TABEL BARANG YANG DILELANG=====");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + barang.getNamaBarang(i)+"\t\t"+"Rp." +barang.getHargaAwal(i)+"\t"+barang.getStatus(i)); 
        }
    }
    
    public void laporan(Petugas petugas){
    int x=petugas.getJmlPetugas();
    System.out.println("===========TABEL PETUGAS============");
    System.out.println("Nama \tAlamat \t\tTelepon");
    for (int i = 0; i < x; i++) {
    System.out.println(petugas.getNama(i)+"\t"+
    petugas.getAlamat(i)+"\t"+petugas.getTelepon(i) + "\t");
    }
    }
    
    public void laporan(Masyarakat masyarakat){
        int x=masyarakat.getJmlMasyarakat();
        System.out.println("\n==========TABEL MASYARAKAT==========");
        System.out.println("ID \tNama \t\tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + masyarakat.getNama(i)+"\t"+masyarakat.getAlamat(i)+"\t\t"+masyarakat.getTelepon(i)); 
        }
    }

    public void laporan(Masyarakat masyarakat, Lelang lelang, Barang barang){
        int x=lelang.getJmlLelang(); 
        System.out.println("\n===========LAPORAN LELANG===========");
        System.out.println("Nama Masyarakat \tBarang \tHargaTawar");
        
        for (int i = 0; i < x; i++) {
            System.out.println(masyarakat.getNama(i)+"\t\t\t"+barang.getNamaBarang(0)+"\t"+lelang.getHargaTawar(i)); 
        }
    }
    
    
}