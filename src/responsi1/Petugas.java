/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi1;

/**
 *
 * @author fathurdewantoro
 */
public class Petugas {
    String username, password, nama;
    
    Petugas(){
        username = "petugas_bambang";
        password = "petugas123";
        nama = "Bambang Cahyo";
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }
    
    void validasiLogin(String username, String password){
        if (username.equals(getUsername()) && password.equals(getPassword())) {
            System.out.println("**Login Berhasil**");
            System.out.println("Selamat Datang Petugas "+getNama());
        }else{
            System.out.println("**Gagal Login**");
        }
    }
    
}
