/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author LENOVO
 */
public class KTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        
        String formattedDate = time.format(myFormatObj);
       
        System.out.print("Masukkan provinsi anda : ");
        String prov = input.nextLine();
        System.out.print("Masukkan kota/kabupaten anda : ");
        String kota = input.nextLine();
        System.out.print("Masukkan NIK anda : ");
        String nik = input.nextLine();
        System.out.print("Masukkan nama lengkap anda : ");
        String nama = input.nextLine();
        System.out.print("Masukkan tempat lahir anda : ");
        String tempat = input.nextLine();
        System.out.print("Masukkan tanggal lahir anda : ");
        String lahir = input.nextLine();
        System.out.print("Masukkan jenis kelamin anda : ");
        String kelamin = input.nextLine();
        System.out.print("Masukkan alamat anda : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan golongan darah anda : ");
        String goldar = input.nextLine();
        System.out.print("Masukkan RT anda : ");
        String rt = input.nextLine();
        System.out.print("Masukkan RW anda : ");
        String rw = input.nextLine();
        System.out.print("Masukkan kelurahan/desa anda : ");
        String keluh = input.nextLine();
        System.out.print("Masukkan kecamatan anda : ");
        String kecat = input.nextLine();
        System.out.print("Masukkan agama anda : ");
        String agama = input.nextLine();
        System.out.print("Masukkan status perkawinan anda : ");
        String status = input.nextLine();
        System.out.print("Masukkan pekerjaan anda : ");
        String kerja = input.nextLine();
        System.out.print("Masukkan kewarganegaraan anda : ");
        String warga = input.nextLine();
        System.out.print("Masukkan masa berlaku : ");
        String berlaku = input.nextLine();
        
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("                  PROVINSI " +prov.toUpperCase());
        System.out.println("                      " +kota.toUpperCase());
        System.out.println("NIK               : " +nik.toUpperCase());
        System.out.println("");
        System.out.println("Nama              : " +nama.toUpperCase());
        System.out.println("Tempat/Tgl lahir  : " +tempat.toUpperCase() +", " +lahir.toUpperCase());
        System.out.println("Jenis Kelamin     : " +kelamin.toUpperCase() +"                       " +"Golongan Darah : " +goldar.toUpperCase());
        System.out.println("Alamat            : " +alamat.toUpperCase()  +"                       " +formattedDate);
        System.out.println("      RT/RW       : " +rt +"/" +rw);
        System.out.println("      Kel/Desa    : " +keluh.toUpperCase());
        System.out.println("      Kecamatan   : " +kecat.toUpperCase());
        System.out.println("Agama             : " +agama.toUpperCase());
        System.out.println("Status Perkawinan : " +status.toUpperCase());
        System.out.println("Pekerjaan         : " +kerja.toUpperCase());
        System.out.println("Kewarganegaraan   : " +warga.toUpperCase());
        System.out.println("Masa berlaku      : " +berlaku.toUpperCase());
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        
    }
    
}
