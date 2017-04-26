
package inheritance;


public class Karyawan {
    public int gajiPokok=2500000;
    public int gaji;
    public int bonus;
    public int masaKerja;
    public String jenis;
    
    public Karyawan( String jenis, int masaKerja){
        this.jenis=jenis;
        this.masaKerja=masaKerja;
        
    }
    
    
    public int getBonus(){
        if(masaKerja>5){
            return 500000/2;
        }else if(masaKerja<=5){
            return 0;
        }
        return bonus;
    }
    public int getMasaKerja(){
        return masaKerja;
    }
}
