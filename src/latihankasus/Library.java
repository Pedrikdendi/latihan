
package latihankasus;

public class Library {
    private String NamaPerpustakaan;
    private String AlamatPerpustakaan;
    private String DeskripsiPerpustakaan;
//    Constructor
   public Library(String NamaPerpustakaan, String AlamatPerpustakaan, String DeskripsiPerpustakaan){
       this.NamaPerpustakaan = NamaPerpustakaan;
       this.AlamatPerpustakaan = AlamatPerpustakaan;
       this.DeskripsiPerpustakaan = DeskripsiPerpustakaan;
   }
   public String getNamaPerpustakaan(){
    return NamaPerpustakaan;   
   }
}
