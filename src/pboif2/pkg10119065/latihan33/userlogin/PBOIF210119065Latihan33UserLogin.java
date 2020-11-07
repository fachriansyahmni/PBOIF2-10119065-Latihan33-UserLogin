package pboif2.pkg10119065.latihan33.userlogin;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program login user
                          dengan objek
 */
public class PBOIF210119065Latihan33UserLogin {

    public static void main(String[] args) {
        String usName,passWord;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = sc.nextLine();
        System.out.print("Masukkan Password = ");
        passWord = sc.nextLine();
        User user = new User();
        user.pengecekanLogin(usName, passWord);
        System.out.println("\nDeveloped by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
