
package inheritance;
import java.util.Scanner;
public class Run {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        System.out.print("Nama\t\t:");
        String nama=in.nextLine();
        System.out.print("Pekerjaan\t:");
        String p=in.nextLine();
        System.out.print("Masa Kerja\t:");
        int mk=in.nextInt();
        System.out.println("---------------------------------");
        if (p.equalsIgnoreCase("software engineer")){
        SoftwareEngineer se=new SoftwareEngineer(p,mk);
            System.out.println("Nama\t\t: "+nama);
            System.out.println("Pekerjaan\t: "+p);
            System.out.println("Masa Kerja\t: "+mk);
            System.out.println("Gaji Total\t: Rp."+se.getGaji());
        }else if(p.equalsIgnoreCase("project manager")){
            ProjectManager pm=new ProjectManager(p,mk);
            System.out.println("Nama\t\t: "+nama);
            System.out.println("Pekerjaan\t: "+p);
            System.out.println("Masa Kerja\t: "+mk);
            System.out.println("Gaji Total\t: Rp."+pm.getGaji());
        }else{
            System.out.println("Input lagi");
        }
    }
}
