
package inheritance;


public class ProjectManager extends Karyawan{
    private int tunjangan=6000000;
    private int apresiasi;
    public ProjectManager(String jenis, int masaKerja) {
        super(jenis, masaKerja);
    }
    public int getTunjangan(){
        return tunjangan;
    }
    public int getBonus(){
        return bonus+450000;
    }
    public int getApresiasi(){
        if(masaKerja>=10){
            return 700000;
        }else if(masaKerja<10){
            return 450000/2;
        }
        return apresiasi;
    }
    public int getGaji(){
        gaji=gajiPokok+tunjangan+super.getBonus()+getApresiasi()+getBonus();
        return gaji;
    }
}
