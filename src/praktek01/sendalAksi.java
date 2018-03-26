/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Hndrw
 */
public class sendalAksi {
    public static void main(String[] args) {
        Sendal Capal= new Sendal();
        Sendal Casual= new Sendal();
        Sendal Outdoor= new Sendal ();
        
        Capal.warna="Biru";
        Capal.merk="Nippon";
        Capal.bahan="Karet";
        Capal.jenis="Jepit";
        Capal.ukuran="38 39 40";
        
        Casual.warna="Coklat";
        Casual.merk="Crocodile";
        Casual.bahan="Kulit";
        Casual.jenis="PDH";
        Casual.ukuran="39 40 41";
        
        Outdoor.warna="Hitam";
        Outdoor.merk="Eiger";
        Outdoor.bahan="Kain Karet";
        Outdoor.jenis="Sendal Gunung";
        Outdoor.ukuran="39 40 41 42";
    }
}
