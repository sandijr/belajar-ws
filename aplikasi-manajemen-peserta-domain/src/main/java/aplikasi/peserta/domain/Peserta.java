/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.peserta.domain;

import java.util.Date;

/**
 *
 * @author brainmatics
 */
public class Peserta {
    private Integer Id;
    private String nomorPeserta;
    private String nama;
    private Date tanggalLahir;

    /**
     * @return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return the nomorPeserta
     */
    public String getNomorPeserta() {
        return nomorPeserta;
    }

    /**
     * @param nomorPeserta the nomorPeserta to set
     */
    public void setNomorPeserta(String nomorPeserta) {
        this.nomorPeserta = nomorPeserta;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
