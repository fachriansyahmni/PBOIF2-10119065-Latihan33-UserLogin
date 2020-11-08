package pboif2.pkg10119065.latihan33.userlogin;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program login user
                          dengan objek
 */
public class User {

    final private String userName = "RizkiAdam";
    final private String password = "terbaikselalu";
    private Boolean statusAkun;
    
    public void pengecekanLogin(String parUserName, String parPassword)
    {
       boolean status = cekAkun(parUserName,parPassword);
       hasilLogin(status,parUserName);
    }
    
    private boolean cekAkun(String parUserName, String parPassword){
        if(parUserName.equals(userName) && parPassword.equals(password)) return true;
        return false;
    }
    
    private void hasilLogin(Boolean status, String parUserName)
    {
        if(status)
        {
            System.out.println("\n**** HALO "+userName+" ****"); 
            System.out.println("Selamat Datang di Aplikasi ini"); 
        }else{
            System.out.println("\nOops, Username atau Password anda salah"); 
        }
    }
    
}
