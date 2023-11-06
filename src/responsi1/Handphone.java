/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi1;

/**
 *
 * @author fathurdewantoro
 */
public class Handphone {
    String merek;
    int harga;
    int stok;

    public String getMerek() {
        return merek;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    
    
    
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
    int sales(String member){
        int hargaJual = 0;
        
        if(getStok() > 0){
            System.out.println("\n=====|Nota Pembelian|=====");
            if (member.equals("Y")) {
                
                hargaJual = getHarga() - ((getHarga() * 10)/100);
                setStok(getStok()-1);
                System.out.println("\nAnda mendapatkan diskon member 10%.");
            }else{
                hargaJual = getHarga();
                setStok(getStok()-1);
            }
            System.out.println("Merk : "+getMerek());
            System.out.println("Harga Normal : "+getHarga());
        }else{
            System.out.println("**Stok barang habis !**");
        }
        return hargaJual;
    }
    
    void daftarHandphone(){
        System.out.println("Merk : "+getMerek());
        System.out.println("Harga : "+getHarga());
        System.out.println("Stok : "+getStok());
    }
}
