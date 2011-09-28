/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.peserta.service;

import aplikasi.peserta.domain.Peserta;
import java.util.List;

/**
 *
 * @author brainmatics
 */
public interface ManajemenPesertaService {

    public void simpan(Peserta p);

    public Peserta findPesertById(Integer Id);

    public Peserta findPesertByNomorPeserta(String no);

    public List<Peserta> findSemuaPeserta(Integer start, Integer rows);

    public Long countsemuaPeserta();
}
