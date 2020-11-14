/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan58.tambahkurang;

/**
 *
 * @author Fiona Avila
 */


public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        int hitungSelisih = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + hitungSelisih);
    }
}
