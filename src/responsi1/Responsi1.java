/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package responsi1;

import java.util.Scanner;
public class Responsi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Petugas petugas = new Petugas();
        Handphone hp1 = new Handphone();
        Handphone hp2 = new Handphone();
        
        while(true){
        
        System.out.println("\n=======|Manajemen Toko Handphone|=======");
//        System.out.println("1. Login Sistem");
        System.out.println("1. Tambahkan Data Handphone");
        System.out.println("2. Tampilkan Data Handohone");
        System.out.println("3. Update Stok Handphone");
        System.out.println("4. Penjualan Handphone");
        System.out.println("5. Keluar Sistem");
        
        System.out.print("\nPilih menu :");
        int menu = sc.nextInt();
        sc.nextLine();
        
        switch(menu){
//            case 1:
//                System.out.print("Masukkan username : ");
//                String username = sc.nextLine();
//                System.out.print("Masukkan password : ");
//                String password = sc.nextLine();
//                petugas.validasiLogin(username, password);
//                break;
                
            case 1:
                System.out.println("\n=======|Tambah Daftar HP|=======");
                System.out.print("Pilih Letak Handphone 1-2 : ");
                int pilihHP = sc.nextInt();
                sc.nextLine();
                
                System.out.println("\nTambah data handphone");
                System.out.print("Merk HP : ");
                String merk = sc.nextLine();
                System.out.print("Harga HP : ");
                int harga = sc.nextInt();
                System.out.print("Stok : ");
                int stok = sc.nextInt();
                
                if (pilihHP == 1) {
                    hp1.setMerek(merk);
                    hp1.setHarga(harga);
                    hp1.setStok(stok);
                }else{
                    hp2.setMerek(merk);
                    hp2.setHarga(harga);
                    hp2.setStok(stok);
                }
                break;
            
            case 2:
                System.out.println("\n=======|List Daftar HP|=======");
                System.out.println("HP 1 :");
                hp1.daftarHandphone();
                System.out.println("\nHP 2 :");
                hp2.daftarHandphone();
                break;
            case 3:
                System.out.println("\n=======|Perbarui Stok HP|=======");
                System.out.print("Pilih Letak Handphone 1-2 : ");
                int pilihHpStok = sc.nextInt();
                sc.nextLine();
                
                System.out.print("\nJumlah Stok : ");
                int stokHp = sc.nextInt();
                if (pilihHpStok == 1) {
                    hp1.setStok(stokHp);
                }else{
                    hp2.setStok(stokHp);
                }
                break;
            case 4:
                System.out.println("\n=======|Penjualan HP|=======");
                System.out.print("Pilih Handphone 1-2 : ");
                int pilihHpJual = sc.nextInt();
                sc.nextLine();
                System.out.print("Member ? Y/T : ");
                String member = sc.nextLine();
                
                if (pilihHpJual == 1) {
                    System.out.println("\nHarga Jual : "+hp1.sales(member));
                }else{
                    System.out.println("\nHarga Jual : "+hp2.sales(member));
                }
                
                break;
            default:
                System.exit(0);
        }
    }}
    
}





































